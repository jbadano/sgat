package cl.usach.rcordova.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.usach.rcordova.model.Usuario;
import cl.usach.rcordova.service.UsuarioService;



@Component
@Path("usuarioResource")
@XmlRootElement
public class UsuarioResource implements UsuarioResourceInterface {

	@Autowired
	private UsuarioService usuarioService;

	@GET
	@Path("signup")
	@Produces(MediaType.TEXT_HTML)
	public Response signup() {
		return Response.ok(new Viewable("/signup")).build();
	}

	@POST
	@Path("signup")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public Response signup(@FormParam("userName") String userName,
			@FormParam("password") String password,
			@FormParam("nombre") String nombre,
			@FormParam("apellido") String apellido,
			@FormParam("fechaNacimiento") String fechaNacimiento,
			@FormParam("emailAddress") String emailAddress)
			throws ParseException {

		if (userName == null || password == null || nombre == null
				|| apellido == null || fechaNacimiento == null
				|| emailAddress == null) {
			return Response.status(Status.PRECONDITION_FAILED).build();
		}

		Usuario usuario = new Usuario();
		usuario.setUserName(userName);
		usuario.setPassword(password);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);

		usuario.setFechaNacimiento(new java.sql.Date(new SimpleDateFormat(
				"MM/dd/yyyy").parse(fechaNacimiento.substring(0, 10)).getTime()));

		usuario.setEmailAddress(emailAddress);

		if (usuarioService.findByUserName(userName)) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "Nombre de usuario existente. Prueba otro user name.");
			map.put("usuario", usuario);
			return Response.status(Status.BAD_REQUEST)
					.entity(new Viewable("/signup", map)).build();
		} else {
			usuarioService.save(usuario);
			return Response.ok().entity(new Viewable("/login")).build();
		}
	}

	@GET
	@Path("login")
	@Produces(MediaType.TEXT_HTML)
	public Response login() {
		return Response.ok(new Viewable("/login")).build();
	}

	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public Response login(@FormParam("userName") String userName,
			@FormParam("password") String password) {

		if (userName == null || password == null) {
			return Response.status(Status.PRECONDITION_FAILED).build();
		}

		boolean found = usuarioService.findByLogin(userName, password);
		if (found) {
			return Response.ok().entity(new Viewable("/success")).build();
		} else {
			return Response.status(Status.BAD_REQUEST)
					.entity(new Viewable("/failure")).build();
		}
	}
}
