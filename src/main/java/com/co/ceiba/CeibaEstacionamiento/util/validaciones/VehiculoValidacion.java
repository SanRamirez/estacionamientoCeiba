package com.co.ceiba.ceibaestacionamiento.util.validaciones;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.ceiba.ceibaestacionamiento.percistencia.dao.FacturaDao;
import com.co.ceiba.ceibaestacionamiento.util.Constantes;


@Component
public class VehiculoValidacion {
	
	private static final Logger LOGGER = Logger.getLogger(VehiculoValidacion.class);
	
	@Autowired
	FacturaDao factDao;
	
	
	public VehiculoValidacion() {
		super();
		BasicConfigurator.configure();
	}

	public boolean placaIniciaConletraA(String placaVehiculo) {
		placaVehiculo = placaVehiculo.toUpperCase();
		return placaVehiculo.startsWith("A");
	}
	
	public boolean diaEsDomingoOLunes(Date fecha) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		int diaSemana =  calendar.get(Calendar.DAY_OF_WEEK);
		
		if(diaSemana==Calendar.SUNDAY || diaSemana==Calendar.MONDAY){
		   LOGGER.debug("fecha ingresada es un domingo o un lunes");
		   return true;
		}
		return false;
	}
	
	public boolean tipoVehiculoEsValido(int tipoVehiculo){
		if(tipoVehiculo==Constantes.CODIGO_VEHICULO_MOTO || tipoVehiculo==Constantes.CODIGO_VEHICULO_CARRO) {
			LOGGER.debug("El tipo de vehiculo ingrasado es valido");
			return true;
		}
		return false;
	}
	
	public boolean espacioParaParqueoDisponible(int tipoVehiculo) {
		if (factDao.contarVehiculosParqueadosPorTipo(tipoVehiculo)< Constantes.limitePorTipoVehiculo(tipoVehiculo)) {
			LOGGER.debug("Se cuenta con espacio disponible para parqueo de ese vehiculo");
			return true;
		}
		return false;
	}
	

}
