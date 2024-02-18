package co.edu.uniquindio.SOLID.SOLID.I;

import co.edu.uniquindio.SOLID.SOLID.I.Services.ICafeteriaCliente;
import co.edu.uniquindio.SOLID.SOLID.I.Services.ICafeteriaProducto;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaObtener implements ICafeteriaCliente, ICafeteriaProducto {
    List<Cliente> listaClientes = new ArrayList<>();
    List<Producto> listaProductos = new ArrayList<>();

    /* Getters and Setters */
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public Cliente obtenerCliente(String cedula) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    @Override
    public Producto obtenerProducto(String nombre) {
        return getListaProductos().stream()
                .filter(producto -> producto.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void calcularTotalProductos(Factura factura) {
        factura.calcularTotalProductos();
    }
}
