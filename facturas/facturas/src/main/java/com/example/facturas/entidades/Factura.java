package com.example.facturas.entidades;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Factura {
    private int numero;
    private String concepto;
    @JsonIgnore
    private List<LineaFactura> lineas= new ArrayList<>();

    public Factura(int numero, String concepto) {
        this.numero = numero;
        this.concepto = concepto;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public List<LineaFactura> getLineas() {
        return lineas;
    }
    public void setLineas(List<LineaFactura> linea) {
        this.lineas = linea;
    }
    public void addLinea(LineaFactura linea) {
        this.lineas.add(linea);
    }

}
