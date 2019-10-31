package com.consorcio.prueba.api;

import com.consorcio.prueba.model.Farmacias;
import com.consorcio.prueba.services.FarmaciaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T01:27:49.516Z")

@Controller
public class FarmaciasApiController implements FarmaciasApi {

    private static final Logger log = LoggerFactory.getLogger(FarmaciasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private FarmaciaService farmaciaService;

    @org.springframework.beans.factory.annotation.Autowired
    public FarmaciasApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> getFarmaciaTurno(@ApiParam(value = "Id de comuna") @Valid @RequestParam(value = "comunaId", required = false) Integer comunaId,@ApiParam(value = "Nombre del local") @Valid @RequestParam(value = "nombreLocal", required = false) String nombreLocal) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                List<Farmacias> response = farmaciaService.getFarmaciasTurno(comunaId, nombreLocal);

                return new ResponseEntity<Object>(response, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
