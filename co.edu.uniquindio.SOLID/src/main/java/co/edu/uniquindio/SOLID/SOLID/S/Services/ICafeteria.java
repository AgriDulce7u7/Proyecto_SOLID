package co.edu.uniquindio.SOLID.SOLID.S.Services;

import co.edu.uniquindio.SOLID.SOLID.S.Cliente;
import co.edu.uniquindio.SOLID.SOLID.S.Factura;
import co.edu.uniquindio.SOLID.SOLID.S.Cafeteria;
import co.edu.uniquindio.SOLID.SOLID.S.Producto;

public interface ICafeteria {
    Factura crearFactura(int numeroFactura, Cliente cliente, Cafeteria cafeteria);
    Cliente obtenerCliente(String cedula);
    Producto obtenerProducto(String nombre);
    void calcularTotalFactura(Factura factura);
}
