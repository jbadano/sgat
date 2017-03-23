package cl.usach.rcordova.model;

import java.util.Collection;

public interface AccionInterface {
	
	public Long getId();

	public void setId(Long id);

	public AccionTipo getAccionTipo();

	public void setAccionTipo(AccionTipo accionTipo);

	public Proceso getProceso();

	public void setProceso(Proceso proceso);

	public String getNombre();

	public void setNombre(String nombre);

	public String getDescripcion();

	public void setDescripcion(String descripcion);
	
	public Collection<Transicion> getTransiciones();

	public void setTransiciones(Collection<Transicion> transiciones);
	
}
