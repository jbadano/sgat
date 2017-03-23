package cl.usach.rcordova.model;

import java.util.Collection;
import java.util.Date;

public interface UsuarioInterface {

	public Long getId();

	public void setId(Long id);

	public String getUserName();

	public void setUserName(String userName);

	public String getNombre();

	public void setNombre(String nombre);

	public String getApellido();

	public void setApellido(String lastName);

	public String getPassword();

	public void setPassword(String password);

	public String getEmailAddress();

	public void setEmailAddress(String emailAddress);

	public Date getFechaNacimiento();

	public void setFechaNacimiento(Date fechaNacimiento);
	
	public Collection<Grupo> getGruposUsuario();

	public void setGruposUsuario(Collection<Grupo> gruposUsuario);

}