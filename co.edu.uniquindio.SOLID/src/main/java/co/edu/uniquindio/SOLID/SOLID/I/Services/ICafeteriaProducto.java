package co.edu.uniquindio.SOLID.SOLID.I.Services;

import co.edu.uniquindio.SOLID.SOLID.I.Producto;
import co.edu.uniquindio.SOLID.SOLID.I.Factura;

public interface ICafeteriaProducto {
    Producto obtenerProducto(String nombre);
    void calcularTotalProductos(Factura factura);
}
