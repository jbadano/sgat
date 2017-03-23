package cl.usach.rcordova.model;

import java.util.Collection;

public interface EstadoInterface {
	
	public Long getId();

	public void setId(Long id);

	public EstadoTipo getEstadoTipo();

	public void setEstadoTipo(EstadoTipo estadoTipo);

	public Proceso getProceso();

	public void setProceso(Proceso proceso);

	public String getNombre();

	public void setNombre(String nombre);

	public String getDescripcion();

	public void setDescripcion(String descripcion);
	
	public Collection<Actividad> getActividades();

	public void setActividades(Collection<Actividad> actividades);
}
