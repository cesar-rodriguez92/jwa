package com.tecsup.javawebavanzado.sesion03.modelo;

public class Persona {

	String codPersona;
	String apePaterno;
	String apeMaterno;
	String nombres;
	String direccion;
	String correo;

	public String getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String codPersona, String apePaterno, String apeMaterno, String nombres, String direccion,
			String correo) {
		super();
		this.codPersona = codPersona;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.nombres = nombres;
		this.direccion = direccion;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [codPersona=" + codPersona + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno
				+ ", nombres=" + nombres + ", direccion=" + direccion + ", correo=" + correo + "]";
	}

}
