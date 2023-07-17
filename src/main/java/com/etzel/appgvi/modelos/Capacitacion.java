package com.etzel.appgvi.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Etzel M. Valderrama
 *
 */
@Entity
@Table(name="capacitacion")
public class Capacitacion {

	@Id
	@Column(name="id")
	private int id;
	
	private String nombre;
    private String horario;
    private String fecha;

    public Capacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horario
	 * @param fecha
	 */
	public Capacitacion(int id, String nombre, String horario, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horario = horario;
		this.fecha = fecha;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Capacitacion [nombre=" + nombre + ", horario=" + horario + ", fecha=" + fecha + "]";
	}
}
