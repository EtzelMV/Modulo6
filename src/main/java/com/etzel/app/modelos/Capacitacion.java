package com.etzel.app.modelos;

/**
 * @author 
 * Etzel M. Valderrama
 * Ricardo Silva
 * Fernando Bermudez
 * Matias Munnoz
 */
public class Capacitacion {
	
	/**
	 * Atributos
	 */
	private int idCapacitacion;
	private String nombreCapacitacion;
    private String horario;
    private String fechaCapacitacion;
	
    /**
     * Constructores
     */
    public Capacitacion() {
		super();
	}

	/**
	 * @param idCapacitacion
	 * @param nombreCapacitacion
	 * @param horario
	 * @param fechaCapacitacion
	 */
	public Capacitacion(int idCapacitacion, String nombreCapacitacion, String horario, String fechaCapacitacion) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.nombreCapacitacion = nombreCapacitacion;
		this.horario = horario;
		this.fechaCapacitacion = fechaCapacitacion;
	}
	
	/**
     * Metodos de acceso
     */

	/**
	 * @return the idCapacitacion
	 */
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

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
	
	/**
     * Metodos de modificacion
     */

	/**
	 * @param idCapacitacion the idCapacitacion to set
	 */
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

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

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", nombreCapacitacion=" + nombreCapacitacion
				+ ", horario=" + horario + ", fechaCapacitacion=" + fechaCapacitacion + "]";
	}
}
