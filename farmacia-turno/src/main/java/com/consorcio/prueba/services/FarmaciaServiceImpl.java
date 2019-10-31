package com.consorcio.prueba.services;

import com.consorcio.prueba.domain.FarmaciaTurnoResponse;
import com.consorcio.prueba.model.Farmacias;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FarmaciaServiceImpl implements FarmaciaService {

    private static final String URL = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7" ;
    private static final String APPLICATION = "application/json";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Farmacias> getFarmaciasTurno(int comunaId, String nombreFarmacia) {

        String url = URL;
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add(HttpHeaders.CONTENT_TYPE, APPLICATION);
        HttpEntity <String> entity = new HttpEntity<String>(requestHeaders);

        ResponseEntity<String> st = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        Gson g = new Gson();
        FarmaciaTurnoResponse[] response = g.fromJson(st.getBody(), FarmaciaTurnoResponse[].class);

        List<Farmacias> farmaciasList = new ArrayList<>();


        for (FarmaciaTurnoResponse farmaciaTurnoResponse: response  ) {
            Farmacias farmacias = new Farmacias();

            if(farmaciaTurnoResponse.getFk_comuna().contains(String.valueOf(comunaId)) ||
                    farmaciaTurnoResponse.getLocal_nombre().contains(nombreFarmacia.toUpperCase()) ){
                farmacias.setNombreLocal(farmaciaTurnoResponse.getLocal_nombre());
                farmacias.setDireccion(farmaciaTurnoResponse.getLocal_direccion());
                farmacias.setTelefono(farmaciaTurnoResponse.getLocal_telefono());
                farmacias.setLatitud(farmaciaTurnoResponse.getLocal_lat());
                farmacias.longitud(farmaciaTurnoResponse.getLocal_lng());

                farmaciasList.add(farmacias);

            }

        }


        //FarmaciaTurnoResponse response = restTemplate.getForObject(url, FarmaciaTurnoResponse.class);

        return farmaciasList;

    }
}
