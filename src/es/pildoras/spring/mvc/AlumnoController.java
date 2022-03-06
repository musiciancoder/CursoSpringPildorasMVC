package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		
		Alumno elAlumno= new Alumno();//el alumno qse esta registrando
		
		modelo.addAttribute("elAlumno", elAlumno);
		
		return "alumnoRegistroFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute ("elAlumno") Alumno elAlumno) { //con @ModelAttribute se rescata un objeto que ya estaba en el modelo 
		
		return "confirmacionRegistroAlumno" ;
	}
	
	

}
