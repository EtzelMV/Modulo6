package com.etzel.app.dto;

/**
 * @author
 * Etzel M. Valderrama
 */
public class UsuarioDto {

	/**
	 * Atributos
	 */
	private int id;
	private String run;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;

	/**
     * Constructores
     */
	public UsuarioDto() {
		super();
	}

	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public UsuarioDto(int id, String run, String nombre, String apellido, String fechaNacimiento) {
		super();
		this.id = id;
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public UsuarioDto(String run, String nombre, String apellido, String fechaNacimiento) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @param run
	 * @param nombre
	 */
	public UsuarioDto(String run, String nombre) {
		super();
		this.run = run;
		this.nombre = nombre;
	}

	/**
     * Metodos de acceso
     */
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
     * Metodos de modificacion
     */
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param run the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
