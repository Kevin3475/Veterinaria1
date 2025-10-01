package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Consulta {
    private String id;
    private LocalDate fecha;
    private Gato[] listGatos;
    private Perro[] listPerros;
    private Ave[] listAves;
    private Reptil[] listReptiles;
    private TipoConsulta tipoConsulta;

    public Consulta(String id,LocalDate fecha,TipoConsulta tipoConsulta){
        this.id = id;
        this.fecha = fecha;
        this.tipoConsulta = tipoConsulta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}
