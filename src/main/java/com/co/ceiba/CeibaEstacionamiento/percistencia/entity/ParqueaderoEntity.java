package com.co.ceiba.ceibaestacionamiento.percistencia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parqueadero")
public class ParqueaderoEntity {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	private String nombre;
	private int limiteMotos;
	private int limiteCarros;
	private int totalMotosParqueadas;
	private int totalCarrosParqueados;
	
	public ParqueaderoEntity(String nombre, int limiteMotos, int limiteCarros, int totalMotosParqueadas,
			int totalCarrosParqueados) {
		super();
		this.nombre = nombre;
		this.limiteMotos = limiteMotos;
		this.limiteCarros = limiteCarros;
		this.totalMotosParqueadas = totalMotosParqueadas;
		this.totalCarrosParqueados = totalCarrosParqueados;
	}

	public ParqueaderoEntity(String nombre, int limiteMotos, int limiteCarros) {
		super();
		this.nombre = nombre;
		this.limiteMotos = limiteMotos;
		this.limiteCarros = limiteCarros;
		totalMotosParqueadas = 0;
		totalCarrosParqueados = 0;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLimiteMotos() {
		return limiteMotos;
	}

	public void setLimiteMotos(int limiteMotos) {
		this.limiteMotos = limiteMotos;
	}

	public int getLimiteCarros() {
		return limiteCarros;
	}

	public void setLimiteCarros(int limiteCarros) {
		this.limiteCarros = limiteCarros;
	}

	public int getTotalMotosParqueadas() {
		return totalMotosParqueadas;
	}

	public void setTotalMotosParqueadas(int totalMotosParqueadas) {
		this.totalMotosParqueadas = totalMotosParqueadas;
	}

	public int getTotalCarrosParqueados() {
		return totalCarrosParqueados;
	}

	public void setTotalCarrosParqueados(int totalCarrosParqueados) {
		this.totalCarrosParqueados = totalCarrosParqueados;
	}

}
