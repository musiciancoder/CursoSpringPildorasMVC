package es.pildoras.spring.mvc;

import org.hibernate.validator.constraints.Email;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//Esto es un bean!!!
public class Alumno {
	
	@NotNull
	@Size(min=2,message="Campo requerido de minimo dos letras")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

	public String getOptativa() {
		return optativa;
	}
	
	

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}



	public String getCiudadEstudios() {
		return ciudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}



	public String getIdiomasAlumno() {
		return idiomasAlumno;
	}

	public void setIdiomasAlumno(String idiomasAlumno) {
		this.idiomasAlumno = idiomasAlumno;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@NotNull
	@Size(min=2,message="Campo requerido de minimo dos letras")
	private String nombre;
	
	private String apellido;
	
	private String optativa;
	
	private String ciudadEstudios;
	
	private String idiomasAlumno;
	
	@Min(value=10, message="No se permiten menores de 10 años")
	@Max(value=100, message="No se permiten mayores de 100 años")
	private int edad;
	
	@Email
	private String email;

}
