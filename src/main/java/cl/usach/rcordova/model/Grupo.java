package cl.usach.rcordova.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
@XmlRootElement(name="grupo")
@Entity
@Table(name="grupo")
public class Grupo implements GrupoInterface{
	
	@Id
	@GeneratedValue
	private Long id;
		
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="proceso",referencedColumnName="id")    
	private Proceso proceso;
	
	@NotEmpty
	@Size(min=4, max=20)
	private String nombre;
	
	@ManyToMany
	@JoinTable(name="grupo_usuario", joinColumns={@JoinColumn(name="grupo_id")}, inverseJoinColumns={@JoinColumn(name="usuario_id")})
    private Collection<Usuario> miembrosGrupo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Usuario> getMiembrosGrupo() {
		return miembrosGrupo;
	}

	public void setMiembrosGrupo(Collection<Usuario> miembrosGrupo) {
		this.miembrosGrupo = miembrosGrupo;
	}
	
	

	
	
}
