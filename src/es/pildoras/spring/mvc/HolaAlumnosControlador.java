package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //muestra el formulario
		   return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {//procesa el formulario
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {//agrega datos al modelo
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {	
	//String nombre=request.getParameter("nombreAlumno");
		nombre+=" es el mejor alumno";
		String mensajeFinal="¿Quien es el mejor alumno?" + nombre;
		modelo.addAttribute("mensajeClaro", mensajeFinal);//aca es donde agrega
		return "HolaAlumnosSpring";
	}
	

}
