package co.edu.uniquindio.SOLID.SOLID.O;

import co.edu.uniquindio.SOLID.SOLID.O.Bebida;

public class Agua extends Bebida {

    /*Constructor*/
    public Agua() {
    }

    @Override
    public double calcularPrecio() {
        int precio = getValor();
        return precio;
    }
}
