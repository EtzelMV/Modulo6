package com.etzel.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * 
 * Controlador para mostrar el formulario de crear una capacitacion.
 */
@Controller
public class CrearCapacitacion {
	
	private static final Logger logger = LoggerFactory.getLogger(CrearCapacitacion.class);
	
	@RequestMapping(value = "/crearcapacitacion", method = RequestMethod.GET)
	public String formularioCapacitacion(Locale locale, Model model) {
		logger.info("Mostrando formulario para crear una capacitacion.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		// Establecer la página a incluir en la plantilla
		model.addAttribute("contenido", "crearCapacitacion.jsp");
		
		return "plantilla";
	}
}
