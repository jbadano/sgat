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
@XmlRootElement(name="estado")
@Entity
@Table(name="estado")
public class Estado implements EstadoInterface{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="estadoTipo",referencedColumnName="id")    
	private EstadoTipo estadoTipo;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="proceso",referencedColumnName="id")    
	private Proceso proceso;
	
	@ManyToMany
	@JoinTable(name="actividad_estado", joinColumns={@JoinColumn(name="estado_id")}, inverseJoinColumns={@JoinColumn(name="actividad_id")})
    private Collection<Actividad> actividadesEstado;
	
	@NotEmpty
	@Size(min=4, max=20)
	private String nombre;

	private String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EstadoTipo getEstadoTipo() {
		return estadoTipo;
	}

	public void setEstadoTipo(EstadoTipo estadoTipo) {
		this.estadoTipo = estadoTipo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Collection<Actividad> getActividades() {
		return actividadesEstado;
	}

	public void setActividades(Collection<Actividad> actividadesEstado) {
		this.actividadesEstado = actividadesEstado;
	}
	
	
}
