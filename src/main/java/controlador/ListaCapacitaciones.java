package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Capacitacion;

/**
 * Servlet implementation class ListaCapacitaciones
 */
public class ListaCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// Lista para almacenar las capacitaciones
    private List<Capacitacion> capacitaciones;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
        capacitaciones = new ArrayList<>();
    }
    
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        /*// Verificar si el usuario ha iniciado sesión
        HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            
        } else {
            // Si el usuario no ha iniciado sesión, redirigir al formulario de inicio de sesión
            response.sendRedirect("Login");
        }*/
        
    	// Obtener los datos del formulario
        String nombreCapacitacion = request.getParameter("nombreCapacitacion");
        String horario = request.getParameter("horario");
        String fechaCapacitacion = request.getParameter("fechaCapacitacion");

        // Validar si los datos no son nulos
        if (nombreCapacitacion != null && !nombreCapacitacion.isEmpty() && horario != null && !horario.isEmpty() && 
        		fechaCapacitacion != null && !fechaCapacitacion.isEmpty()) {
        	// Crear una instancia de Capacitacionm y establecer los datos
            Capacitacion capacitacion = new Capacitacion();
            capacitacion.setNombreCapacitacion(nombreCapacitacion);
            capacitacion.setHorario(horario);
            capacitacion.setFechaCapacitacion(fechaCapacitacion);

            // Agregar la capacitacion a la lista
            capacitaciones.add(capacitacion);
        }
        
        // Establecer la lista de capacitaciones en la solicitud
        request.setAttribute("listacapacitaciones", capacitaciones);
        
		// Establecer la página específica a incluir en la plantilla
	    request.setAttribute("contenido", "listaCapacitaciones.jsp");

	    // Redirigir a la vista
	    request.getRequestDispatcher("views/templateMaven.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}