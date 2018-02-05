package es.altair.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios") 
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idusuarios;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String pass;
	
	private Integer tipo;
	
	//private Set<Concierto> libros = new HashSet<Concierto>();
	
	public Usuario () {
		
		
	}

	public Usuario(String nombre, String apellido, String email, String pass, Integer tipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.pass = pass;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [idusuarios=" + idusuarios + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", pass=" + pass + ", tipo=" + tipo + "]";
	}

	public Integer getIdusuarios() {
		return idusuarios;
	}

	public void setIdusuarios(Integer idusuarios) {
		this.idusuarios = idusuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
	}
