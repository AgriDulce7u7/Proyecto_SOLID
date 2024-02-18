package co.edu.uniquindio.SOLID.Model;

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
