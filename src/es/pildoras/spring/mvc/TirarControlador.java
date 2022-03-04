package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("secundario")
public class TirarControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //muestra el formulario
		   return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {//agrega datos al modelo
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {	
	//String nombre=request.getParameter("nombreAlumno");
		nombre+=" es el peor alumno";
		String mensajeFinal="¿Quien es el peor alumno?" + nombre;
		modelo.addAttribute("mensajeClaro", mensajeFinal);//aca es donde agrega
		return "HolaAlumnosSpring";
	}
	

}
