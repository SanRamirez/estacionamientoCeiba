package com.co.ceiba.ceibaestacionamiento.percistencia.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.ceiba.ceibaestacionamiento.exception.EstacionamientoException;

import com.co.ceiba.ceibaestacionamiento.modelo.Vehiculo;
import com.co.ceiba.ceibaestacionamiento.percistencia.dao.FacturaDao;
import com.co.ceiba.ceibaestacionamiento.percistencia.entity.FacturaEntity;
import com.co.ceiba.ceibaestacionamiento.percistencia.repository.FacturaRepository;


@Service
public class FacturaDaoImp implements FacturaDao {
	
	private static final String ERROR_ALMACENAR_FACTURA = "Error al almacenar la factura";
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public boolean guardarFactura(FacturaEntity factura) {
		
		try {
			facturaRepository.save(factura);
			return true;
		} catch (Exception e) {
			throw new EstacionamientoException(ERROR_ALMACENAR_FACTURA);
		}
	}
	
	@Override
	public Vehiculo obtenerVeiculoParqueadoPorPlaca(String placaVehiculo) {
		boolean estaParqueado = true;
		return facturaRepository.findByPlacaVehiculoAndParqueado(placaVehiculo, estaParqueado).getVehiculo();
	}

	@Override
	public boolean actualizarFactura(FacturaEntity factura) {
		return false;
	}

	@Override
	public List<Vehiculo> obtenerVehiculosPorTipoParqueados(int tipoVehiculo) {
		List<Vehiculo> vehiculosDeTipoEspecifico = new ArrayList<>();
		List<FacturaEntity> facturasVehiculosDeTipoEspecifico = facturaRepository.findByTipoVehiculo(tipoVehiculo);
		facturasVehiculosDeTipoEspecifico.forEach(factura ->  vehiculosDeTipoEspecifico.add(factura.getVehiculo()));
		return vehiculosDeTipoEspecifico;
	}

	@Override
	public List<Vehiculo> obtenerVehiculosParqueados() {
		List<Vehiculo> vehiculosParqueados = new ArrayList<>();
		List<FacturaEntity> facturasVehiculosParqueados = facturaRepository.findByParqueado(true);
		facturasVehiculosParqueados.forEach(factura ->  vehiculosParqueados.add(factura.getVehiculo()));
		return vehiculosParqueados;
	}

	@Override
	public int contarVehiculosParqueadosPorTipo(int tipoVehiculo) {
		return facturaRepository.countByTipoVehiculoAndParqueado(tipoVehiculo, true);
	}

}
