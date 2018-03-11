package aplicacion.android.universidad_distrital.vertex;

import com.orm.SugarRecord;

/**
 * Created by Android on 18/02/2018.
 */






public class RegistroDatos extends SugarRecord {

        String Cedula, nombrev, nomenclatura, lat, log, altura, entidad, tipovertice, datum, departamento, municipio, sitio, estadovertice, describio, fecha, hora;





    public RegistroDatos() {

    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombrev() {
        return nombrev;
    }

    public void setNombrev(String nombrev) {
        this.nombrev = nombrev;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getTipovertice() {
        return tipovertice;
    }

    public void setTipovertice(String tipovertice) {
        this.tipovertice = tipovertice;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getEstadovertice() {
        return estadovertice;
    }

    public void setEstadovertice(String estadovertice) {
        this.estadovertice = estadovertice;
    }

    public String getDescribio() {
        return describio;
    }

    public void setDescribio(String describio) {
        this.describio = describio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public RegistroDatos(String cedula,String nombrev, String nomenclatura, String lat, String log, String altura,
                         String entidad, String tipovertice, String datum, String departamento,
                         String municipio, String sitio, String estadovertice, String describio,
                         String fecha, String hora) {
        Cedula = cedula;
        this.nombrev = nombrev;
        this.nomenclatura = nomenclatura;

        this.lat = lat;
        this.log = log;
        this.altura = altura;
        this.entidad = entidad;
        this.tipovertice = tipovertice;
        this.datum = datum;
        this.departamento = departamento;
        this.municipio = municipio;
        this.sitio = sitio;
        this.estadovertice = estadovertice;
        this.describio = describio;
        this.fecha = fecha;
        this.hora = hora;
    }



}
