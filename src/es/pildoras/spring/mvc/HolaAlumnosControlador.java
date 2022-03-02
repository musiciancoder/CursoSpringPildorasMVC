package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {//procesa el formulario
		return "HolaAlumnosSpring";
	}

}
