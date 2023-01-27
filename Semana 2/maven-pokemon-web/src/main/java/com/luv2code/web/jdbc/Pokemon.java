package com.luv2code.web.jdbc;

public class Pokemon {

	private int id;
	private String nombre;
	private String tipo;
	private String region;

	public Pokemon(String nombre, String tipo, String region) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.region = region;
	}

	public Pokemon(int id, String nombre, String tipo, String region) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", region=" + region + "]";
	}

	
}
