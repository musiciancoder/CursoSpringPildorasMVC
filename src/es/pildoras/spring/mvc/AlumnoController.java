package es.pildoras.spring.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true); //string vacio
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	}

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {

		Alumno elAlumno = new Alumno();// el alumno qse esta registrando

		modelo.addAttribute("elAlumno", elAlumno);

		return "alumnoRegistroFormulario";
	}

	@RequestMapping("/procesarFormulario") // cuando pulsa el voton enviar
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno") Alumno elAlumno, // con @ModelAttribute se
																							// rescata un objeto que ya
																							// estaba en el modelo
			BindingResult resultadoValidacion) { // BindingResult para validacion formulario

		if (resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		} else {

			return "confirmacionRegistroAlumno";
		}
	}

}
