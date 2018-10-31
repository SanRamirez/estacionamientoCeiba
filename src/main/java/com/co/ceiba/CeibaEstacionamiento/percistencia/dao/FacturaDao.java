package com.co.ceiba.ceibaestacionamiento.percistencia.dao;

import java.util.List;

import com.co.ceiba.ceibaestacionamiento.modelo.Vehiculo;
import com.co.ceiba.ceibaestacionamiento.percistencia.entity.FacturaEntity;

public interface FacturaDao {
	
	void guardarFactura(FacturaEntity factura);
	Vehiculo obtenerVeiculoParqueadoPorPlaca(String placa);
	boolean actualizarFactura(FacturaEntity factura);
	List<Vehiculo> obtenerVehiculosPorTipoParqueados(int tipoVehiculo);
	List<Vehiculo> obtenerVehiculosParqueados();
	int contarVehiculosParqueadosPorTipo(int tipoVehiculo);

}
