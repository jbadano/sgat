package cl.usach.rcordova.model;

import java.util.Collection;

public interface AccionDestinatarioInterface {
	
	public Long getId();

	public void setId(Long id);

	public Accion getAccion();

	public void setAccion(Accion accion);

	public Destinatario getDestinatario();

	public void setDestinatario(Destinatario destinatario);

	public Grupo getGrupo();

	public void setGrupo(Grupo grupo);
	
}
