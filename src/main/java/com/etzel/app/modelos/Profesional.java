package com.etzel.app.modelos;

/**
 * @author
 * Etzel M. Valderrama
 */
public class Profesional extends Usuario {

	/**
	 * Atributos
	 */
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * Constructores
	 */
	public Profesional() {
		super();
	}
	
	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public Profesional(int id, String run, String nombre, String apellido, String fechaNacimiento) {
		super(id, run, nombre, apellido, fechaNacimiento);
	}

	/**
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String titulo, String fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(int id, String run, String nombre, String apellido, String fechaNacimiento, String titulo,
			String fechaIngreso) {
		super(id, run, nombre, apellido, fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String run, String nombre, String apellido, String fechaNacimiento, String titulo,
			String fechaIngreso) {
		super(run, nombre, apellido, fechaNacimiento);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
     * Metodos de acceso
     */
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
     * Metodos de modificacion
     */
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [Titulo = " + titulo + ", Fecha de Ingreso = " + fechaIngreso + "]";
	}
}
