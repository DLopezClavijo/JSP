package es.altair.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelo implements Serializable{
	
	@Id
	private int idVuelo;
	
	private Date fLlegada;
	
	private Date fSalida;
	
	private int billete;
	
	private double precio;
	
	@OneToOne
	//(fetch= FetchType.)
	//cOMO CONECTAR ESTA MIERDA
	
	
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario idUsuario;
	
	
	private Set<Aeropuerto> aeropuertos = new HashSet<Aeropuerto>();


	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", fLlegada=" + fLlegada + ", fSalida=" + fSalida + ", billete=" + billete
				+ ", precio=" + precio + ", idUsuario=" + idUsuario + ", aeropuertos=" + aeropuertos + "]";
	}
	
	
	public Vuelo(int idVuelo, Date fLlegada, Date fSalida, Usuario usuario,int billete,double precio) {
		super();
		this.idVuelo = idVuelo;
		this.fLlegada = fLlegada;
		this.fSalida = fSalida;
		this.idUsuario = usuario;
		this.billete = billete;
		this.precio= precio;
	}

	public int getIdVuelo() {
		return idVuelo;
	}


	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}


	public Date gethLlegada() {
		return fLlegada;
	}


	public void sethLlegada(Date hLlegada) {
		this.fLlegada = fLlegada;
	}


	public Date gethSalida() {
		return fSalida;
	}


	public void sethSalida(Date fSalida) {
		this.fSalida = fSalida;
	}


	public Usuario getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Date getfLlegada() {
		return fLlegada;
	}


	public void setfLlegada(Date fLlegada) {
		this.fLlegada = fLlegada;
	}


	public Date getfSalida() {
		return fSalida;
	}


	public void setfSalida(Date fSalida) {
		this.fSalida = fSalida;
	}


	public int getBillete() {
		return billete;
	}


	public void setBillete(int billete) {
		this.billete = billete;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Usuario getUsuario() {
		return idUsuario;
	}


	public void setUsuario(Usuario usuario) {
		this.idUsuario = usuario;
	}


	public Set<Aeropuerto> getAeropuertos() {
		return aeropuertos;
	}


	public void setAeropuertos(Set<Aeropuerto> aeropuertos) {
		this.aeropuertos = aeropuertos;
	}
	

}
