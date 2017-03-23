package cl.usach.rcordova.model;

import java.util.Collection;

public interface GrupoInterface {
	
	public Long getId();

	public void setId(Long id);

	public Proceso getProceso();

	public void setProceso(Proceso proceso);

	public String getNombre();

	public void setNombre(String nombre);

	public Collection<Usuario> getMiembrosGrupo();

	public void setMiembrosGrupo(Collection<Usuario> miembrosGrupo);
}
