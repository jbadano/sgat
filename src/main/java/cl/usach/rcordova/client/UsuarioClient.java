package cl.usach.rcordova.client;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class UsuarioClient implements UsuarioClientInterface {
	private WebTarget target;

	public UsuarioClient(WebTarget target) {
		this.target = target;
	}

	public Response getSignup() {		
		Response response = target.path("signup").request().get(Response.class);
		return response;
	}

	public Response postSignup(String userName, String password,
			String nombre, String apellido, String fechaNacimiento,
			String emailAddress) throws Exception {
		
		Form form = new Form().param("userName", userName)
				.param("password", password).param("nombre", nombre)
				.param("apellido", apellido).param("fechaNacimiento", fechaNacimiento)
				.param("emailAddress", emailAddress);
		Response response = target.path("signup").request()
				.post(Entity.form(form));

		if (response.getStatus() == Status.INTERNAL_SERVER_ERROR
				.getStatusCode()) {
			throw new Exception();
		}

		if (response.getStatus() != Status.OK.getStatusCode()) {
			throw new RuntimeException();
		}

		return response;
	}

	public Response getLogin() {
		Response response = target.path("login").request().get(Response.class);

		return response;
	}

	public Response postLogin(String userName, String password) {
		Form form = new Form().param("userName", userName).param("password",
				password);

		Response response = target.path("login").request()
				.post(Entity.form(form));

		if (response.getStatus() != Status.OK.getStatusCode()) {
			throw new RuntimeException();
		}

		return response;
	}
}
