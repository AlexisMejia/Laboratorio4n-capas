package com.uca.capas.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class Producto {
	
	
	@Size(max=15, message="*El nombre debe tener 15 digitos*")
	@NotEmpty(message="*Campo obligatorio*")
	private String nombre;
	

	@Size(max =30, message="Maximo de 30 caracteres")
	@NotEmpty(message= "*Campo obligatorio*")
	private String descripcion;
	
	
	@NotNull(message="Campo obligatorio")
	@Min(value =0, message="El precio no debe ser negativo")
	private Double precio;
	
	
	@NotEmpty(message= "*Campo obligatorio*")
	@Pattern(regexp="^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", message="El formato debe ser dd/MM/aaaa")
	private String vencimiento;


	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Producto(String nombre, String descripcion, Double precio, String vencimiento) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	

}
