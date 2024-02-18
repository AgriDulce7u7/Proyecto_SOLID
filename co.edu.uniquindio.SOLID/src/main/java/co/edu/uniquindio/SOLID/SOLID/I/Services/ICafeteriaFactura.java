package co.edu.uniquindio.SOLID.SOLID.I.Services;

import co.edu.uniquindio.SOLID.SOLID.I.CafeteriaFactura;
import co.edu.uniquindio.SOLID.SOLID.I.Cliente;
import co.edu.uniquindio.SOLID.SOLID.I.Factura;

public interface ICafeteriaFactura {
    Factura crearFactura(int numeroFactura, Cliente cliente, CafeteriaFactura cafeteria);
    void calcularTotalFactura(Factura factura);
}
