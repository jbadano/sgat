package cl.usach.rcordova.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

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
@XmlRootElement(name="requerimientoAccion")
@Entity
@Table(name="requerimientoAccion")
public class RequerimientoAccion implements RequerimientoAccionInterface {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="requerimiento",referencedColumnName="id")    
	private Requerimiento requerimiento;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="accion",referencedColumnName="id")   
	private Accion accion;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="transicion",referencedColumnName="id")   
	private Transicion transicion;
	
	private boolean isActive;
	
	private boolean isComplete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Requerimiento getRequerimiento() {
		return requerimiento;
	}

	public void setRequerimiento(Requerimiento requerimiento) {
		this.requerimiento = requerimiento;
	}

	public Accion getAccion() {
		return accion;
	}

	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	public Transicion getTransicion() {
		return transicion;
	}

	public void setTransicion(Transicion transicion) {
		this.transicion = transicion;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
	
	
}

