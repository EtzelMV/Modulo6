package com.etzel.app;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 
 * Etzel M. Valderrama
 * Ricardo Silva
 * Fernando Bermudez
 * Matías Muñoz
 */
@Controller
public class ListarCapacitacion {

	private static final Logger logger = LoggerFactory.getLogger(ListarCapacitacion.class);

    @Autowired
    private CapacitacionService capacitacionService; // Reemplaza 'CapacitacionService' por el nombre de tu servicio o repositorio

    @RequestMapping(value = "/listacapacitaciones", method = {RequestMethod.GET, RequestMethod.POST})
    public String listarCapacitaciones(HttpServletRequest request, HttpServletResponse response, 
    		Locale locale, Model model) throws ServletException, IOException {
        logger.info("Mostrando lista de capacitaciones.");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        // Obtener los datos del formulario
        String nombreCapacitacion = request.getParameter("nombreCapacitacion");
        String horario = request.getParameter("horario");
        String fechaCapacitacion = request.getParameter("fechaCapacitacion");
        
        if (nombreCapacitacion != null && !nombreCapacitacion.isEmpty() && horario != null && !horario.isEmpty() && 
        		fechaCapacitacion != null && !fechaCapacitacion.isEmpty()) {
        	// Crear una instancia de Capacitacion y establecer los datos
            Capacitacion capacitacion = new Capacitacion();
            capacitacion.setNombreCapacitacion(nombreCapacitacion);
            capacitacion.setHorario(horario);
            capacitacion.setFechaCapacitacion(fechaCapacitacion);

            // Agregar la capacitacion a través del servicio o repositorio
            capacitacionService.agregarCapacitacion(capacitacion);
        }

        // Obtener la lista actualizada de capacitaciones desde el servicio o repositorio
        List<Capacitacion> capacitaciones = capacitacionService.obtenerTodasLasCapacitaciones();

        // Establecer la lista de capacitaciones en el modelo
        model.addAttribute("listacapacitaciones", capacitaciones);

        // Establecer la página a incluir en la plantilla
        model.addAttribute("contenido", "listarCapacitacion.jsp");

        return "plantilla";
    }
}
