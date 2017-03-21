package cl.usach.rcordova.model;

import java.util.Date;

public interface RequerimientoNotaInterface {

	public Long getId();

	public void setId(Long id);

	public Requerimiento getRequerimiento();

	public void setRequerimiento(Requerimiento requerimiento);

	public Usuario getUsuario();

	public void setUsuario(Usuario usuario);

	public Date getFechaCreacion();

	public void setFechaCreacion(Date fechaCreacion);

}