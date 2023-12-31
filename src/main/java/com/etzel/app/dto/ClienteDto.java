package com.etzel.app.dto;

/**
 * @author
 * Etzel M. Valderrama
 */
public class ClienteDto extends UsuarioDto {

	/**
	 * Atributos
	 */
	private String afp;
	private String direccion;
	private String comuna;
	private String telefono;
	// sistemaSalud: 1 para Fonasa, 2 para Isapres.
	private int sistemaSalud;

	/**
     * Constructores
     */
	public ClienteDto() {
		super();
	}
	
	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public ClienteDto(int id, String run, String nombre, String apellido, String fechaNacimiento) {
		super(id, run, nombre, apellido, fechaNacimiento);
	}
	
	/**
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public ClienteDto(String run, String nombre, String apellido, String fechaNacimiento) {
		super(run, nombre, apellido, fechaNacimiento);
	}
	
	/**
	 * @param run
	 * @param nombre
	 */
	public ClienteDto(String run, String nombre) {
		super(run, nombre);
	}

	/**
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public ClienteDto(String afp, String direccion, String comuna, String telefono, int sistemaSalud) {
		super();
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public ClienteDto(int id, String run, String nombre, String apellido, String fechaNacimiento, String afp,
			String direccion, String comuna, String telefono, int sistemaSalud) {
		super(id, run, nombre, apellido, fechaNacimiento);
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public ClienteDto(String run, String nombre, String apellido, String fechaNacimiento, String afp, String direccion,
			String comuna, String telefono, int sistemaSalud) {
		super(run, nombre, apellido, fechaNacimiento);
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @param run
	 * @param nombre
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public ClienteDto(String run, String nombre, String afp, String direccion, String comuna, String telefono,
			int sistemaSalud) {
		super(run, nombre);
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	/**
     * Metodos de acceso
     */
	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @return the sistemaSalud
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	
	/**
     * Metodos de modificacion
     */
	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
}
