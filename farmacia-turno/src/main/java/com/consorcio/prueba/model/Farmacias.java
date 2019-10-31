package com.consorcio.prueba.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Farmacias
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-30T01:27:49.516Z")

public class Farmacias   {
  @JsonProperty("nombreLocal")
  private String nombreLocal = null;

  @JsonProperty("direccion")
  private String direccion = null;

  @JsonProperty("telefono")
  private String telefono = null;

  @JsonProperty("latitud")
  private String latitud = null;

  @JsonProperty("longitud")
  private String longitud = null;

  public Farmacias nombreLocal(String nombreLocal) {
    this.nombreLocal = nombreLocal;
    return this;
  }

  /**
   * Get nombreLocal
   * @return nombreLocal
  **/
  @ApiModelProperty(value = "")


  public String getNombreLocal() {
    return nombreLocal;
  }

  public void setNombreLocal(String nombreLocal) {
    this.nombreLocal = nombreLocal;
  }

  public Farmacias direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * Get direccion
   * @return direccion
  **/
  @ApiModelProperty(value = "")


  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Farmacias telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
  **/
  @ApiModelProperty(value = "")


  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Farmacias latitud(String latitud) {
    this.latitud = latitud;
    return this;
  }

  /**
   * Get latitud
   * @return latitud
  **/
  @ApiModelProperty(value = "")


  public String getLatitud() {
    return latitud;
  }

  public void setLatitud(String latitud) {
    this.latitud = latitud;
  }

  public Farmacias longitud(String longitud) {
    this.longitud = longitud;
    return this;
  }

  /**
   * Get longitud
   * @return longitud
  **/
  @ApiModelProperty(value = "")


  public String getLongitud() {
    return longitud;
  }

  public void setLongitud(String longitud) {
    this.longitud = longitud;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Farmacias farmacias = (Farmacias) o;
    return Objects.equals(this.nombreLocal, farmacias.nombreLocal) &&
        Objects.equals(this.direccion, farmacias.direccion) &&
        Objects.equals(this.telefono, farmacias.telefono) &&
        Objects.equals(this.latitud, farmacias.latitud) &&
        Objects.equals(this.longitud, farmacias.longitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreLocal, direccion, telefono, latitud, longitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Farmacias {\n");
    
    sb.append("    nombreLocal: ").append(toIndentedString(nombreLocal)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

