package com.co.ceiba.ceibaestacionamiento.modelo;

public class Parqueadero {
	
	private int totalCarrosParqueados;
	private int totalMotosParqueadas;
	private int limiteCarros;
	private int limiteMotos;
	
	public Parqueadero(int totalCarrosParqueados, int totalMotosParqueadas, int limiteCarros, int limiteMotos) {
		super();
		this.totalCarrosParqueados = totalCarrosParqueados;
		this.totalMotosParqueadas = totalMotosParqueadas;
		this.limiteCarros = limiteCarros;
		this.limiteMotos = limiteMotos;
	}

	public int getTotalCarrosParqueados() {
		return totalCarrosParqueados;
	}

	public void setTotalCarrosParqueados(int totalCarrosParqueados) {
		this.totalCarrosParqueados = totalCarrosParqueados;
	}

	public int getTotalMotosParqueadas() {
		return totalMotosParqueadas;
	}

	public void setTotalMotosParqueadas(int totalMotosParqueadas) {
		this.totalMotosParqueadas = totalMotosParqueadas;
	}

	public int getLimiteCarros() {
		return limiteCarros;
	}

	public void setLimiteCarros(int limiteCarros) {
		this.limiteCarros = limiteCarros;
	}

	public int getLimiteMotos() {
		return limiteMotos;
	}

	public void setLimiteMotos(int limiteMotos) {
		this.limiteMotos = limiteMotos;
	}
	
	
	
	
	
	

}
