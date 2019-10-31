package com.consorcio.prueba.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FarmaciaTurnoResponse {

    @SerializedName("fecha")
    private String fecha;

    @SerializedName("local_id")
    private String local_id;

    @SerializedName("local_nombre")
    private String local_nombre;

    @SerializedName("comuna_nombre")
    private String comuna_nombre;

    @SerializedName("localidad_nombre")
    private String localidad_nombre;

    @SerializedName("local_direccion")
    private String local_direccion;

    @SerializedName("funcionamiento_hora_apertura")
    private String funcionamiento_hora_apertura;

    @SerializedName("funcionamiento_hora_cierre")
    private String funcionamiento_hora_cierre;

    @SerializedName("local_telefono")
    private String local_telefono;

    @SerializedName("local_lat")
    private String local_lat;

    @SerializedName("local_lng")
    private String local_lng;

    @SerializedName("funcionamiento_dia")
    private String funcionamiento_dia;

    @SerializedName("fk_region")
    private String fk_region;

    @SerializedName("fk_comuna")
    private String fk_comuna;

    private final List<FarmaciaTurnoResponse> farmaciaTurnoResponseList;

    public FarmaciaTurnoResponse(String fecha, String local_id, String local_nombre, String comuna_nombre, String localidad_nombre, String local_direccion, String funcionamiento_hora_apertura, String funcionamiento_hora_cierre, String local_telefono, String local_lat, String local_lng, String funcionamiento_dia, String fk_region, String fk_comuna, List<FarmaciaTurnoResponse> farmaciaTurnoResponseList, List<FarmaciaTurnoResponse> farmaciaTurnoResponseList1) {
        this.fecha = fecha;
        this.local_id = local_id;
        this.local_nombre = local_nombre;
        this.comuna_nombre = comuna_nombre;
        this.localidad_nombre = localidad_nombre;
        this.local_direccion = local_direccion;
        this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
        this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
        this.local_telefono = local_telefono;
        this.local_lat = local_lat;
        this.local_lng = local_lng;
        this.funcionamiento_dia = funcionamiento_dia;
        this.fk_region = fk_region;
        this.fk_comuna = fk_comuna;
        this.farmaciaTurnoResponseList = farmaciaTurnoResponseList1;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    public String getLocal_nombre() {
        return local_nombre;
    }

    public void setLocal_nombre(String local_nombre) {
        this.local_nombre = local_nombre;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public String getLocalidad_nombre() {
        return localidad_nombre;
    }

    public void setLocalidad_nombre(String localidad_nombre) {
        this.localidad_nombre = localidad_nombre;
    }

    public String getLocal_direccion() {
        return local_direccion;
    }

    public void setLocal_direccion(String local_direccion) {
        this.local_direccion = local_direccion;
    }

    public String getFuncionamiento_hora_apertura() {
        return funcionamiento_hora_apertura;
    }

    public void setFuncionamiento_hora_apertura(String funcionamiento_hora_apertura) {
        this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
    }

    public String getFuncionamiento_hora_cierre() {
        return funcionamiento_hora_cierre;
    }

    public void setFuncionamiento_hora_cierre(String funcionamiento_hora_cierre) {
        this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
    }

    public String getLocal_telefono() {
        return local_telefono;
    }

    public void setLocal_telefono(String local_telefono) {
        this.local_telefono = local_telefono;
    }

    public String getLocal_lat() {
        return local_lat;
    }

    public void setLocal_lat(String local_lat) {
        this.local_lat = local_lat;
    }

    public String getLocal_lng() {
        return local_lng;
    }

    public void setLocal_lng(String local_lng) {
        this.local_lng = local_lng;
    }

    public String getFuncionamiento_dia() {
        return funcionamiento_dia;
    }

    public void setFuncionamiento_dia(String funcionamiento_dia) {
        this.funcionamiento_dia = funcionamiento_dia;
    }

    public String getFk_region() {
        return fk_region;
    }

    public void setFk_region(String fk_region) {
        this.fk_region = fk_region;
    }

    public String getFk_comuna() {
        return fk_comuna;
    }

    public void setFk_comuna(String fk_comuna) {
        this.fk_comuna = fk_comuna;
    }

    @Override
    public String toString() {
        return "FarmaciaTurnoResponse{" +
                "fecha='" + fecha + '\'' +
                ", local_id='" + local_id + '\'' +
                ", local_nombre='" + local_nombre + '\'' +
                ", comuna_nombre='" + comuna_nombre + '\'' +
                ", localidad_nombre='" + localidad_nombre + '\'' +
                ", local_direccion='" + local_direccion + '\'' +
                ", funcionamiento_hora_apertura='" + funcionamiento_hora_apertura + '\'' +
                ", funcionamiento_hora_cierre='" + funcionamiento_hora_cierre + '\'' +
                ", local_telefono='" + local_telefono + '\'' +
                ", local_lat='" + local_lat + '\'' +
                ", local_lng='" + local_lng + '\'' +
                ", funcionamiento_dia='" + funcionamiento_dia + '\'' +
                ", fk_region='" + fk_region + '\'' +
                ", fk_comuna='" + fk_comuna + '\'' +
                '}';
    }
}
