package es.altair.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")



public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idUsuario;
	private String login;
	private String pass;
	private String nombre;
	private String apellido;
	private int tipo;
	
	
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	private Set<Vuelo> vuelos = new HashSet<Vuelo>();
	
	public Usuario(String login, String pass, String nombre, String apellidos, int tipo) {
		super();
		this.login = login;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido = apellidos;
		this.tipo = tipo;
	}

	public Usuario() {

	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellido;
	}

	public void setApellidos(String apellidos) {
		this.apellido = apellidos;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Set<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(Set<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", login=" + login + ", pass=" + pass + ", nombre=" + nombre
				+ ", apellidos=" + apellido + ", tipo=" + tipo + "]";
	}
}
