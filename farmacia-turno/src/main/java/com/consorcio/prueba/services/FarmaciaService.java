package com.consorcio.prueba.services;

import com.consorcio.prueba.model.Farmacias;

import java.util.List;

public interface FarmaciaService {

    List<Farmacias> getFarmaciasTurno(int comunaId, String nombreFarmacia);

}
