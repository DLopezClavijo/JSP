package es.altair.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aeropuertos")

public class Aeropuerto implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idAeropuerto;
	
	

	private int idVuelo;
	
	private String nombre;
	
	private String ciudad;
	
	private String codigo;
	
	public Aeropuerto(int idVuelo, String nombre, String ciudad, String codigo,int idAeropuerto) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.idVuelo = idVuelo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo = codigo;
	}

	
	
	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getIdAeropuerto() {
		return idAeropuerto;
	}


	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	@Override
	public String toString() {
		return "Aeropuerto [idAeropuerto=" + idAeropuerto + ", idVuelo=" + idVuelo + ", nombre=" + nombre + ", ciudad="
				+ ciudad + ", codigo=" + codigo + "]";
	}

	
	
}
