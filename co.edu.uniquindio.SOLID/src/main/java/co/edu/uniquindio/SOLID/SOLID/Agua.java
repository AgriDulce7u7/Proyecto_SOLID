package co.edu.uniquindio.SOLID.SOLID;

public class Agua extends Bebida{

    /*Constructor*/
    public Agua() {
    }

    @Override
    public double calcularPrecio() {
        int precio = getValor();
        return precio;
    }
}
