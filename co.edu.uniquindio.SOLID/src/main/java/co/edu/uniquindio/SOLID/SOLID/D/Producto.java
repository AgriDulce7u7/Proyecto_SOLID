package co.edu.uniquindio.SOLID.SOLID.D;


import co.edu.uniquindio.SOLID.SOLID.D.Services.IProducto;

public abstract class Producto implements IProducto {
    private String nombre;
    private int valor;

    /*Constructor*/
    public Producto() {
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPrecio() {
        return 0.0;
    }
}
