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

import com.etzel.app.servicios.CapacitacionService;
import com.etzel.app.modelos.Capacitacion;

/**
 * @author
 * Etzel M. Valderrama
 */
@Controller
public class CapacitacionController {
	
	private static boolean capacitacionCreada = false;
	private final CapacitacionService cService;
	
	private static final Logger logger = LoggerFactory.getLogger(CapacitacionController.class);

    @Autowired
    public CapacitacionController(CapacitacionService cService) {
        this.cService = cService;
    }
    
    @RequestMapping(value = "/formcapacitacion", method = RequestMethod.GET)
    public String 	formCapacitacion(Locale locale, Model model) {
		logger.info("Mostrando formulario para crear una capacitacion.");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "crearCapacitacion.jsp");
		
		return "plantilla";
	}

    @RequestMapping(value = "/crearcapacitacion", method = RequestMethod.POST)
    public String crearCapacitacion(Capacitacion capacitacion, Locale locale, Model model) {
        
        if (capacitacion.getNombreCapacitacion() != null && !capacitacion.getNombreCapacitacion().isEmpty() 
        		&& capacitacion.getHorario() != null && !capacitacion.getHorario().isEmpty() && 
        		capacitacion.getFechaCapacitacion() != null && !capacitacion.getFechaCapacitacion().isEmpty()) {
        	
        	// Crear la capacitacion a traves del DAO
            capacitacionCreada = cService.create(capacitacion);
        }
        
        if (capacitacionCreada) {
            // Llamar al metodo listarCapacitaciones() para mostrar la lista de capacitaciones
        	return listarCapacitaciones(locale, model);
        } else {
        	fechaSistema(locale, model);
    		
    		return formCapacitacion(locale, model);
        }
    }

    @RequestMapping(value = "/listacapacitaciones", method = RequestMethod.GET)
    public String listarCapacitaciones(Locale locale, Model model) {
        // Obtener la lista de capacitaciones desde el DAO
        List<Capacitacion> capacitaciones = cService.getAll();
        
        fechaSistema(locale, model);

        // Agregar la lista de capacitaciones al model
        model.addAttribute("listacapacitaciones", capacitaciones);

        // Establecer la pagina a incluir en la plantilla
        model.addAttribute("contenido", "listarCapacitacion.jsp");

        return "plantilla";
    }
    
    @RequestMapping(value = "/formeditarcapacitacion", method = RequestMethod.GET)
    public String 	formEditarCapacitacion(int id, Locale locale, Model model) {
		logger.info("Mostrando formulario para editar una capacitacion.");
		
		// Tomando data de la capacitacion desde la base de datos
		Capacitacion capacitacion = cService.getOne(id);
		
		fechaSistema(locale, model);
		
		// Enviando data de la capacitacion a la vista
		model.addAttribute("capacitacion", capacitacion);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "editarCapacitacion.jsp");
		
		return "plantilla";
	}
    
    @RequestMapping(value = "/editarcapacitacion", method = RequestMethod.POST)
    public String editarCapacitacion(Capacitacion capacitacion, Locale locale, Model model) {
        
        if (capacitacion.getNombreCapacitacion() != null && !capacitacion.getNombreCapacitacion().isEmpty() 
        		&& capacitacion.getHorario() != null && !capacitacion.getHorario().isEmpty() && 
        		capacitacion.getFechaCapacitacion() != null && !capacitacion.getFechaCapacitacion().isEmpty()) {
        	
        	// Editar la capacitacion a traves del DAO
            cService.update(capacitacion);
        }
        
        // Llamar al metodo listarCapacitaciones() para mostrar la lista de capacitaciones
    	return listarCapacitaciones(locale, model);
    }
    
    @RequestMapping(value = "/borrarcapacitacion", method = RequestMethod.GET)
    public String 	borrarCapacitacion(int id, Locale locale, Model model) {
    	// Tomando data del capacitacion desde la base de datos
    	Capacitacion capacitacion = cService.getOne(id);
		
		// Eliminando capacitacion
		cService.delete(id);
		
		logger.info("La capacitacion (" + capacitacion.getNombreCapacitacion() + ", " + 
    			capacitacion.getHorario() + ", " + capacitacion.getFechaCapacitacion() + 
    			") ha sido borrado.");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "capacitacionBorrado.jsp");
		
		return "plantilla";
	}
    
    public Model fechaSistema(Locale locale, Model model) {
    	
    	Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return model.addAttribute("serverTime", formattedDate );
    }
}
