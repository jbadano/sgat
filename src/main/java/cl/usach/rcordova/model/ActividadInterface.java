package cl.usach.rcordova.model;

import java.util.Collection;

public interface ActividadInterface {
	
	public Long getId();

	public void setId(Long id);

	public Proceso getProceso();

	public void setProceso(Proceso proceso);

	public String getNombre();

	public void setNombre(String nombre);

	public String getDescripcion();

	public void setDescripcion(String descripcion);

	public Collection<Transicion> getTransiciones();

	public void setTransiciones(Collection<Transicion> transiciones);

	public ActividadTipo getActividadTipo();

	public void setActividadTipo(ActividadTipo actividadTipo);

	public Collection<Estado> getEstados();

	public void setEstados(Collection<Estado> estados);
	
	
}
