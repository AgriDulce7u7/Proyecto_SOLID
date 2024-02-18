package co.edu.uniquindio.SOLID.Services;

import co.edu.uniquindio.SOLID.Model.Cafeteria;
import co.edu.uniquindio.SOLID.Model.Cliente;
import co.edu.uniquindio.SOLID.Model.Factura;
import co.edu.uniquindio.SOLID.Model.Producto;

public interface ICafeteria {
    Factura crearFactura(int numeroFactura, Cliente cliente, Cafeteria cafeteria);
    void crearDetalleFactura(Factura factura, Producto producto, int cantidad);
    Cliente obtenerCliente(String cedula);
    Producto obtenerProducto(String nombre);
    void calcularTotalFactura(Factura factura);

    void calcularTotalProductos(Factura factura);
}
