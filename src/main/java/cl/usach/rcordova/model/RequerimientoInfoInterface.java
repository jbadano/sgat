package cl.usach.rcordova.model;

import java.util.Date;

public interface RequerimientoInfoInterface {

	public Long getId();

	public void setId(Long id);

	public Requerimiento getRequerimiento();

	public void setRequerimiento(Requerimiento requerimiento);

	public String getCampo();

	public void setCampo(String campo);

	public String getValor();

	public void setValor(String valor);

}