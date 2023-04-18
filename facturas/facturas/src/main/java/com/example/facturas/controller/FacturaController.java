package com.example.facturas.controller;

import com.example.facturas.entidades.Factura;
import com.example.facturas.entidades.LineaFactura;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class FacturaController {
    static List<Factura> lista= new ArrayList<>();

    static {

        Factura f= new Factura(1,"informatica");

        f.addLinea(new LineaFactura(1,"auricular",200));
        f.addLinea(new LineaFactura(2,"telefono",300));


        Factura f2= new Factura(2,"alimentacion");

        f2.addLinea(new LineaFactura(1,"galletas",2));
        f2.addLinea(new LineaFactura(2,"leche",1));

        Factura f3= new Factura(1,"limpieza");

        f3.addLinea(new LineaFactura(1,"gel",2));
        f3.addLinea(new LineaFactura(2,"jabon",4));
        lista.add(f);
        lista.add(f2);
        lista.add(f3);

    }
    @RequestMapping
    public List<Factura> buscarTodas() {
        return lista;
    }
    
}
