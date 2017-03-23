package cl.usach.rcordova.model;

import java.util.Collection;

public interface TransicionInterface {
	
	public Long getId();

	public void setId(Long id);

	public Estado getEstadoActual();

	public void setEstadoActual(Estado estadoActual);

	public Estado getEstadoSiguiente();

	public void setEstadoSiguiente(Estado estadoSiguiente);

	public Proceso getProceso();

	public void setProceso(Proceso proceso);
	
	public Collection<Accion> getAccionesTransicion();

	public void setAccionesTransicion(Collection<Accion> accionesTransicion);
	
	public Collection<Actividad> getActividades();

	public void setActividades(Collection<Actividad> actividadTransiciones);
	
}
