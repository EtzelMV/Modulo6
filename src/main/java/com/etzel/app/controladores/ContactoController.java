package com.etzel.app.controladores;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "contacto.jsp");
		
		return "plantilla";
	}
	
	@RequestMapping(value = "/contactando", method = RequestMethod.POST)
    public String contactoRealizado(HttpServletRequest request, 
    		HttpServletResponse response, Locale locale, Model model) {
		
		// Obtener los datos del formulario de contacto
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String consulta = request.getParameter("consulta");
        
        if (nombre != null && !nombre.isEmpty() && apellido != null && !apellido.isEmpty() && 
        		email != null && !email.isEmpty() && consulta != null && !consulta.isEmpty()) {
        	logger.info("Se ha registrado una consulta.");
        	
        	// Establecer los atributos en la solicitud
            request.setAttribute("nombre", nombre);
            request.setAttribute("apellido", apellido);
            request.setAttribute("email", email);
            request.setAttribute("consulta", consulta);
            
            System.out.println("\tNombre: " + nombre);
            System.out.println("\tApellido: " + apellido);
            System.out.println("\tEmail: " + email);
            System.out.println("\tConsulta: " + consulta);
            
            fechaSistema(locale, model);
            
            // Establecer la pagina a incluir en la plantilla
     		model.addAttribute("contenido", "consultaRealizada.jsp");
     		
     		return "plantilla";
        } else {
        	logger.info("Error al intentar una consulta.");
        	
        	fechaSistema(locale, model);
        	
        	// Establecer la pagina a incluir en la plantilla
     		model.addAttribute("contenido", "consultaFallida.jsp");
     		
     		return "plantilla";
        }
	}
	
	public Model fechaSistema(Locale locale, Model model) {
    	
    	Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return model.addAttribute("serverTime", formattedDate );
    }
}
