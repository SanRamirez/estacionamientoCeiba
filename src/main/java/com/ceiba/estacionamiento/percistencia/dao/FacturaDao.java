package com.ceiba.estacionamiento.percistencia.dao;

import java.util.List;

import com.ceiba.estacionamiento.modelo.Vehiculo;
import com.ceiba.estacionamiento.percistencia.entity.FacturaEntity;

public interface FacturaDao {
	
	void guardarFactura(FacturaEntity factura);
	Vehiculo obtenerVeiculoParqueadoPorPlaca(String placa);
	boolean actualizarFactura(FacturaEntity factura);
	List<Vehiculo> obtenerVehiculosPorTipoParqueados(int tipoVehiculo);
	List<Vehiculo> obtenerVehiculosParqueados();
	int contarVehiculosParqueadosPorTipo(int tipoVehiculo);

}
