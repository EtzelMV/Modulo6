package com.etzel.app.modelos;

/**
 * @author
 * Etzel M. Valderrama
 */
public class Administrativo extends Usuario {

	/**
	 * Atributos
	 */
	private String area;
	private String expPrevia;
	
	/**
	 * Constructores
	 */
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public Administrativo(int id, String run, String nombre, String apellido, String fechaNacimiento) {
		super(id, run, nombre, apellido, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(int id, String run, String nombre, String apellido, String fechaNacimiento, String area,
			String expPrevia) {
		super(id, run, nombre, apellido, fechaNacimiento);
		this.area = area;
		this.expPrevia = expPrevia;
	}

	/**
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String run, String nombre, String apellido, String fechaNacimiento, String area,
			String expPrevia) {
		super(run, nombre, apellido, fechaNacimiento);
		this.area = area;
		this.expPrevia = expPrevia;
	}

	/**
     * Metodos de acceso
     */
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @return the expPrevia
	 */
	public String getExpPrevia() {
		return expPrevia;
	}

	/**
     * Metodos de modificacion
     */
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @param expPrevia the expPrevia to set
	 */
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [Area = " + area + ", Experiencia Previa = " + expPrevia + "]";
	}
}
