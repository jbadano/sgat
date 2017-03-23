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
@XmlRootElement(name="accionDestinatario")
@Entity
@Table(name="accionDestinatario")
public class AccionDestinatario implements AccionDestinatarioInterface{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="accion",referencedColumnName="id")    
	private Accion accion;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="destinatario",referencedColumnName="id")    
	private Destinatario destinatario;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="grupo",referencedColumnName="id")    
	private Grupo grupo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Accion getAccion() {
		return accion;
	}

	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	
}
