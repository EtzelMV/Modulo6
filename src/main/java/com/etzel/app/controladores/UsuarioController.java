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

import com.etzel.app.modelos.Usuario;
import com.etzel.app.servicios.UsuarioService;

/**
 * @author
 * Etzel M. Valderrama
 */
@Controller
public class UsuarioController {
	
	private static boolean usuarioCreado = false;
	private final UsuarioService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    public UsuarioController(UsuarioService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(value = "/formusuario", method = RequestMethod.GET)
    public String 	formUsuario(Locale locale, Model model) {
		logger.info("Mostrando formulario para crear un usuario.");
		
		fechaSistema(locale, model);
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "crearUsuario.jsp");
		
		return "plantilla";
	}
    
    @RequestMapping(value = "/crearusuario", method = RequestMethod.POST)
    public String crearUsuario(Usuario usuario, HttpServletRequest request, 
    		HttpServletResponse response, Locale locale, Model model) {
    	
    	// Obtener los datos del formulario de usuario
        String run = request.getParameter("run");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        
        if (run != null && !run.isEmpty() && nombre != null && !nombre.isEmpty() && apellido != null && 
        		!apellido.isEmpty() && fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
        	// Crear la usuario a traves del DAO
            usuarioCreado = userService.create(usuario);
        }
        
        if (usuarioCreado) {
            // Llamar al metodo listarUsuarios() para mostrar la lista de usuarios
        	return listarUsuarios(locale, model);
        } else {
        	fechaSistema(locale, model);
    		
    		return formUsuario(locale, model);
        }
    }
    
    @RequestMapping(value = "/listausuarios", method = RequestMethod.GET)
    public String listarUsuarios(Locale locale, Model model) {
        // Obtener la lista de usuarios desde el DAO
        List<Usuario> usuarios = userService.getAll();
        
        fechaSistema(locale, model);

        // Agregar la lista de usuarios al model
        model.addAttribute("listausuarios", usuarios);

        // Establecer la pagina a incluir en la plantilla
        model.addAttribute("contenido", "listarUsuario.jsp");

        return "plantilla";
    }
    
    public Model fechaSistema(Locale locale, Model model) {
    	
    	Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return model.addAttribute("serverTime", formattedDate );
    }
}
