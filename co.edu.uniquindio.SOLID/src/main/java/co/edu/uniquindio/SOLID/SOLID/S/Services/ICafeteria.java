package co.edu.uniquindio.SOLID.SOLID.S.Services;

import co.edu.uniquindio.SOLID.SOLID.S.Cliente;
import co.edu.uniquindio.SOLID.SOLID.S.Factura;
import co.edu.uniquindio.SOLID.SOLID.S.Cafeteria;
import co.edu.uniquindio.SOLID.SOLID.S.Producto;

public interface ICafeteria {
    Factura crearFactura(int numeroFactura, Cliente cliente, Cafeteria cafeteria);
    void calcularTotalFactura(Factura factura);
}
