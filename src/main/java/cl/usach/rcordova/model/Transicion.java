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
@XmlRootElement(name="transicion")
@Entity
@Table(name="transicion")
public class Transicion implements TransicionInterface{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="estadoActual",referencedColumnName="id")    
	private Estado estadoActual;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="estadoSiguiente",referencedColumnName="id")    
	private Estado estadoSiguiente;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="proceso",referencedColumnName="id")    
	private Proceso proceso;
	
	@ManyToMany
	@JoinTable(name="transicion_accion", joinColumns={@JoinColumn(name="transicion_id")}, inverseJoinColumns={@JoinColumn(name="accion_id")})
	private Collection<Accion> accionesTransicion;
	
	@ManyToMany
	@JoinTable(name="transicion_actividad", joinColumns={@JoinColumn(name="transicion_id")}, inverseJoinColumns={@JoinColumn(name="actividad_id")})
    private Collection<Actividad> actividadTransiciones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estado getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(Estado estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Estado getEstadoSiguiente() {
		return estadoSiguiente;
	}

	public void setEstadoSiguiente(Estado estadoSiguiente) {
		this.estadoSiguiente = estadoSiguiente;
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public Collection<Accion> getAccionesTransicion() {
		return accionesTransicion;
	}

	public void setAccionesTransicion(Collection<Accion> accionesTransicion) {
		this.accionesTransicion = accionesTransicion;
	}

	public Collection<Actividad> getActividades() {
		return actividadTransiciones;
	}

	public void setActividades(Collection<Actividad> actividadTransiciones) {
		this.actividadTransiciones = actividadTransiciones;
	}
	
	
	
}
