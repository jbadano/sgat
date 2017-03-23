package cl.usach.rcordova.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
@XmlRootElement(name="actividad")
@Entity
@Table(name="actividad")
public class Actividad implements ActividadInterface{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="actividadTipo",referencedColumnName="id")    
	private ActividadTipo actividadTipo;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="proceso",referencedColumnName="id")    
	private Proceso proceso;
	
	@NotEmpty
	@Size(min=4, max=20)
	private String nombre;
	
	@ManyToMany(mappedBy="actividadesEstado")
    private Collection<Estado> estados;
	
	@ManyToMany(mappedBy="actividadTransiciones")
    private Collection<Transicion> transiciones;

	private String descripcion;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Collection<Transicion> getTransiciones() {
		return transiciones;
	}

	public void setTransiciones(Collection<Transicion> transiciones) {
		this.transiciones = transiciones;
	}

	public ActividadTipo getActividadTipo() {
		return actividadTipo;
	}

	public void setActividadTipo(ActividadTipo actividadTipo) {
		this.actividadTipo = actividadTipo;
	}

	public Collection<Estado> getEstados() {
		return estados;
	}

	public void setEstados(Collection<Estado> estados) {
		this.estados = estados;
	}
	
	
	
}
