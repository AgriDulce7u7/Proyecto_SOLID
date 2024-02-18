package co.edu.uniquindio.SOLID.SOLID.I;

import co.edu.uniquindio.SOLID.SOLID.I.Services.ICafeteriaFactura;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaFactura implements ICafeteriaFactura{
    private String nombre;
    List<Factura> listaFactura = new ArrayList<>();

    /*Constructor*/
    public CafeteriaFactura() {
    }

    /*Getters and Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    @Override
    public Factura crearFactura(int numeroFactura, Cliente cliente, CafeteriaFactura cafeteria) {
        Factura factura = new Factura();
        factura.setClienteAsociado(cliente);
        factura.setNumeroFactura(numeroFactura);
        factura.setOwnedByCafeteria(cafeteria);
        return factura;
    }

    @Override
    public void calcularTotalFactura(Factura factura) {
        factura.calcularTotal();
    }
}
