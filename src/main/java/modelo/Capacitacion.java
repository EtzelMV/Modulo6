package modelo;

/**
 * @author 
 * Etzel M. Valderrama
 * Ricardo Silva
 * Fernando Bermudez
 * Matías Muñoz
 */
public class Capacitacion {
	
	// Atributos
	private String nombreCapacitacion;
    private String horario;
    private String fechaCapacitacion;
    
    //Constructores
	public Capacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombreCapacitacion
	 * @param horario
	 * @param fechaCapacitacion
	 */
	public Capacitacion(String nombreCapacitacion, String horario, String fechaCapacitacion) {
		super();
		this.nombreCapacitacion = nombreCapacitacion;
		this.horario = horario;
		this.fechaCapacitacion = fechaCapacitacion;
	}

	// Métodos de acceso
	/**
	 * @return the nombreCapacitacion
	 */
	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @return the fechaCapacitacion
	 */
	public String getFechaCapacitacion() {
		return fechaCapacitacion;
	}

	// Métodos de modificación
	/**
	 * @param nombreCapacitacion the nombreCapacitacion to set
	 */
	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @param fechaCapacitacion the fechaCapacitacion to set
	 */
	public void setFechaCapacitacion(String fechaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
	}

	// Método de consulta
	@Override
	public String toString() {
		return "Capacitacion [nombreCapacitacion=" + nombreCapacitacion + ", horario=" + horario
				+ ", fechaCapacitacion=" + fechaCapacitacion + "]";
	}
}
