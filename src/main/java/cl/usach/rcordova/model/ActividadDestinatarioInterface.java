package cl.usach.rcordova.model;

import java.util.Collection;

public interface ActividadDestinatarioInterface {
	
	public Long getId();

	public void setId(Long id);

	public Actividad getActividad();

	public void setActividad(Actividad actividad);

	public Destinatario getDestinatario();

	public void setDestinatario(Destinatario destinatario);

	public Grupo getGrupo();

	public void setGrupo(Grupo grupo);
	
	
}
