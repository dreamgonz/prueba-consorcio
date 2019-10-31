/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.consorcio.prueba.api;

import com.consorcio.prueba.model.Farmacias;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T01:27:49.516Z")

@Api(value = "farmacias", description = "the farmacias API")
public interface FarmaciasApi {

    @ApiOperation(value = "consulta cuantas farmacias hay de turno", nickname = "getFarmaciaTurno", notes = "", response = Farmacias.class, tags={ "getFarmaciaTurno", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Farmacias.class) })
    @RequestMapping(value = "/farmacias",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> getFarmaciaTurno(@ApiParam(value = "Id de comuna") @Valid @RequestParam(value = "comunaId", required = false) Integer comunaId,@ApiParam(value = "Nombre del local") @Valid @RequestParam(value = "nombreLocal", required = false) String nombreLocal);

}
