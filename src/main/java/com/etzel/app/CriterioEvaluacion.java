package com.etzel.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author
 * Etzel M. Valderrama
 * Ricardo Silva
 * Fernando Bermudez
 * Matías Muñoz
 * 
 * Controlador para mostrar el formulario de contacto.
 */
@Controller
public class CriterioEvaluacion {
	
private static final Logger logger = LoggerFactory.getLogger(Contacto.class);
	
	@RequestMapping(value = "/evaluaciontres", method = RequestMethod.GET)
	public void mostrarPDF(Locale locale, HttpServletResponse response) throws IOException {
		logger.info("Mostrando pdf con el criterio de evaluacion.");
		
		// Ruta al archivo PDF
        String rutaPDF = "files/CriterioDeEvaluacion3.pdf";
        
        // Configurar la respuesta HTTP
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=archivo.pdf");
        
        // Leer el archivo PDF y escribirlo en la respuesta HTTP
        Path pdfPath = Paths.get(rutaPDF);
        InputStream inputStream = new FileInputStream(pdfPath.toFile());
        ServletOutputStream outputStream = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        inputStream.close();
        outputStream.flush();
	}
}
