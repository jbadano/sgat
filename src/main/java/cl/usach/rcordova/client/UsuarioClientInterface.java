package cl.usach.rcordova.client; 

import javax.ws.rs.core.Response;

public interface UsuarioClientInterface {

	public Response getSignup();

	public Response postSignup(String userName, String password,
			String nombre, String apellido, String fechaNacimiento,
			String emailAddress) throws Exception;

	public Response getLogin();

	public Response postLogin(String userName, String password);

}