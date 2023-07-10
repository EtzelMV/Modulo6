package com.etzel.app.controladores;

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
 * Matias Munnoz
 * 
 * Controlador para mostrar el formulario de contacto.
 */
@Controller
public class ContactoController {
	
private static final Logger logger = LoggerFactory.getLogger(ContactoController.class);
	
	@RequestMapping(value = "/contacto", method = RequestMethod.GET)
	public String formularioContacto(Locale locale, Model model) {
		logger.info("Mostrando formulario de contacto.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "contacto.jsp");
		
		return "plantilla";
	}
}
