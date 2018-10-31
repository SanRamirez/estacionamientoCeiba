package com.co.ceiba.ceibaestacionamiento.modelo;

import java.util.Date;

public class Factura {
	
	private String placaVehiculo;
	private int cilindrajeVehiculo;
	private int tipoVehiculo;
	
	private Date fechaIngreso;
	private Date fechaSalida;
	
	private double valor;
	private int totalDias;
	private int totalHoras;
	
	private boolean parqueado;
	
	public Factura(Vehiculo vehiculo, Date fechaIngreso) {
		super();
		this.placaVehiculo = vehiculo.getPlaca();
		this.cilindrajeVehiculo = vehiculo.getCilindraje();
		this.tipoVehiculo = vehiculo.getTipo();
		this.fechaIngreso = fechaIngreso;
	}

	public Vehiculo getVehiculo() {
		return new Vehiculo(placaVehiculo, cilindrajeVehiculo, tipoVehiculo);
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.placaVehiculo = vehiculo.getPlaca();
		this.cilindrajeVehiculo = vehiculo.getCilindraje();
		this.tipoVehiculo = vehiculo.getTipo();
	}
	
	

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public int getCilindrajeVehiculo() {
		return cilindrajeVehiculo;
	}

	public void setCilindrajeVehiculo(int cilindrajeVehiculo) {
		this.cilindrajeVehiculo = cilindrajeVehiculo;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getTotalDias() {
		return totalDias;
	}

	public void setTotalDias(int totalDias) {
		this.totalDias = totalDias;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public boolean isParqueado() {
		return parqueado;
	}

	public void setParqueado(boolean parqueado) {
		this.parqueado = parqueado;
	}
	
	
	
	
	
}