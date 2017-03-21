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
@XmlRootElement(name="requerimiento")
@Entity
@Table(name="requerimiento")
public class Requerimiento implements RequerimientoInterface {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@ManyToOne(optional=false)
    @JoinColumn(name="proceso",referencedColumnName="id")    
	private Proceso proceso;
	
	private String titulo;
	
	private Date fechaCreacion;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="jefeProyecto",referencedColumnName="id")   
	private Usuario jefeProyecto;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="usuarioAsignado",referencedColumnName="id")   
	private Usuario usuarioAsignado;
	
	@ManyToMany
	@JoinTable(name="usuario_observador_requerimiento", joinColumns={@JoinColumn(name="req_id")}, inverseJoinColumns={@JoinColumn(name="user_id")})
	private Collection<Usuario> usuariosObservadores;
	
	private String estadoActual;

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Usuario getJefeProyecto() {
		return jefeProyecto;
	}

	public void setJefeProyecto(Usuario jefeProyecto) {
		this.jefeProyecto = jefeProyecto;
	}

	public Usuario getUsuarioAsignado() {
		return usuarioAsignado;
	}

	public void setUsuarioAsignado(Usuario usuarioAsignado) {
		this.usuarioAsignado = usuarioAsignado;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Collection<Usuario> getUsuariosObservadores() {
		return usuariosObservadores;
	}

	public void setUsuariosObservadores(Collection<Usuario> usuariosObservadores) {
		this.usuariosObservadores = usuariosObservadores;
	}

	
	
}

