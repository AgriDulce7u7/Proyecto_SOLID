package co.edu.uniquindio.SOLID.SOLID.S;

import co.edu.uniquindio.SOLID.SOLID.S.Services.ICafeteria;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria implements ICafeteria {
    private String nombre;
    List<Cliente> listaClientes = new ArrayList<>();
    List<Factura> listaFactura = new ArrayList<>();
    List<Producto> listaProductos = new ArrayList<>();

    /*Constructor*/
    public Cafeteria() {
    }

    /*Getters and Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


    @Override
    public Factura crearFactura(int numeroFactura, Cliente cliente, Cafeteria cafeteria) {
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
