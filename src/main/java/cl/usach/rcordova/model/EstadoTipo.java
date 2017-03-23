package cl.usach.rcordova.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
@XmlRootElement(name="estadoTipo")
@Entity
@Table(name="estadoTipo")
public class EstadoTipo implements EstadoTipoInterface{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@Size(min=4, max=20)
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}