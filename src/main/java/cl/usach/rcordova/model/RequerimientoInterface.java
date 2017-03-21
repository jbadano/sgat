package cl.usach.rcordova.model;

import java.util.Date;

public interface RequerimientoInterface {

	public Long getId();

	public void setId(Long id);

	public Proceso getProceso();

	public void setProceso(Proceso proceso);

	public String getTitulo();

	public void setTitulo(String titulo);

	public Date getFechaCreacion();

	public void setFechaCreacion(Date fechaCreacion);

	public Usuario getJefeProyecto();

	public void setJefeProyecto(Usuario jefeProyecto);
	
	public Usuario getUsuarioAsignado();
	
	public void setUsuarioAsignado(Usuario usuarioAsignado);
	
	public String getEstadoActual();

	public void setEstadoActual(String estadoActual);

}