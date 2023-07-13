package com.etzel.app.controladores;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author
 * Etzel M. Valderrama
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Bienvenido Etzel!!! El idioma local es {}.", locale);
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "home.jsp");
		
		return "plantilla";
	}
	
	@RequestMapping(value = "/login")
	public String login(Locale locale, Model model) {
		log.info("Mostrando formulario para inicio de sesión");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "login.jsp");
		
		return "plantilla";
	}
	
	@RequestMapping(value = "/loginerror")
	public String loginError(Locale locale, Model model) {
		log.info("Mostrando que ha ocurrido un error al iniciar sesión.");
		
		fechaSistema(locale, model);
		
		model.addAttribute("error", "true");
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "login.jsp");
		
		return "plantilla";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(Locale locale, Model model) {
		log.info("Se ha cerrado la sesión.");
		
		fechaSistema(locale, model);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "login.jsp");
		
		return "plantilla";
	}
	
	@RequestMapping(value = "/accessdenied")
	public String accesoDenegado(Locale locale, Model model) {
		log.info("Se ha denegado el acceso a un usuario.");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "accesoDenegado.jsp");
		
		return "plantilla";
	}
	
	public Model fechaSistema(Locale locale, Model model) {
    	
    	Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return model.addAttribute("serverTime", formattedDate );
    }
}