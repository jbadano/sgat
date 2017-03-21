package cl.usach.rcordova.model;

import java.util.Date;

public interface RequerimientoAdjuntoInterface {

	public Long getId();

	public void setId(Long id);

	public Requerimiento getRequerimiento();

	public void setRequerimiento(Requerimiento requerimiento);

	public Usuario getUsuario();

	public void setUsuario(Usuario usuario);

	public Date getFechaSubida();

	public void setFechaSubida(Date fechaSubida);
	
	public String getNombreArchivo();
	
	public void setNombreArchivo(String nombreArchivo);
	
	public String getMIMEType();
	
	public void setMIMEType(String MIMEType);
	
	public byte[] getFileContent();
	
	public void setFileContent(byte[] fileContent);

}