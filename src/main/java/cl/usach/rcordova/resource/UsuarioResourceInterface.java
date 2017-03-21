package cl.usach.rcordova.resource;

import java.text.ParseException;

import javax.ws.rs.core.Response;

public interface UsuarioResourceInterface {

	public Response signup();

	public Response signup(String userName, String password, String nombre,
			String apellido, String fechaNacimiento, String emailAddress)
			throws ParseException;

	public Response login();

	public Response login(String userName, String password);

}