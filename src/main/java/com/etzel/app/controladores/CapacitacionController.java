package com.etzel.app.controladores;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etzel.app.dao.CapacitacionDao;
import com.etzel.app.modelos.Capacitacion;

/**
 * @author
 * Etzel M. Valderrama
 */
@Controller
public class CapacitacionController {
	
	private static boolean capacitacionCreada = false;
	private final CapacitacionDao capacitacionDao;
	
	private static final Logger logger = LoggerFactory.getLogger(CapacitacionController.class);

    @Autowired
    public CapacitacionController(CapacitacionDao capacitacionDao) {
        this.capacitacionDao = capacitacionDao;
    }

    @RequestMapping(value = "/listacapacitaciones", method = RequestMethod.GET)
    public String listarCapacitaciones(Locale locale, Model model) {
        // Obtener la lista de capacitaciones desde el DAO
        List<Capacitacion> capacitaciones = capacitacionDao.obtenerCapacitaciones();
        
        fechaSistema(locale, model);

        // Agregar la lista de capacitaciones al model
        model.addAttribute("listacapacitaciones", capacitaciones);

        // Establecer la pagina a incluir en la plantilla
        model.addAttribute("contenido", "listarCapacitacion.jsp");

        return "plantilla";
    }
    
    @RequestMapping(value = "/crearcapacitacion", method = RequestMethod.GET)
    public String crearCapacitacion(Locale locale, Model model) {
		logger.info("Mostrando formulario para crear una capacitacion.");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "crearCapacitacion.jsp");
		
		return "plantilla";
	}

    @RequestMapping(value = "/guardarcapacitacion", method = RequestMethod.POST)
    public String guardarCapacitacion(Capacitacion capacitacion, HttpServletRequest request, 
    		HttpServletResponse response, Locale locale, Model model) {
    	
    	// Obtener los datos del formulario
        String nombreCapacitacion = request.getParameter("nombreCapacitacion");
        String horario = request.getParameter("horario");
        String fechaCapacitacion = request.getParameter("fechaCapacitacion");
        
        if (nombreCapacitacion != null && !nombreCapacitacion.isEmpty() && horario != null && !horario.isEmpty() && 
        		fechaCapacitacion != null && !fechaCapacitacion.isEmpty()) {
        	// Crear la capacitacion a través del DAO
            capacitacionCreada = capacitacionDao.crearCapacitacion(capacitacion);
        }
        
        if (capacitacionCreada) {
            // Llamar al metodo crear capacitación para que muestres la lista de capacitaciones
        	return listarCapacitaciones(locale, model);
        } else {
        	fechaSistema(locale, model);
        	// Establecer la pagina a incluir en la plantilla
    		model.addAttribute("contenido", "crearCapacitacion.jsp");
    		
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
