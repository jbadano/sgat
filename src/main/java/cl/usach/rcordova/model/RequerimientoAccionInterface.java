package cl.usach.rcordova.model;

import java.util.Date;

public interface RequerimientoAccionInterface {

	public Long getId();

	public void setId(Long id);

	public Requerimiento getRequerimiento();

	public void setRequerimiento(Requerimiento requerimiento);
	
	public Accion getAccion();

	public void setAccion(Accion accion);

	public Transicion getTransicion();

	public void setTransicion(Transicion transicion);

	public boolean isActive();

	public void setActive(boolean isActive);

	public boolean isComplete();

	public void setComplete(boolean isComplete);

}