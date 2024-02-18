package co.edu.uniquindio.SOLID.Model;

public class Producto {
    private String nombre;
    private int valor;
    Cafeteria ownedByCafeteria;

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

    public Cafeteria getOwnedByCafeteria() {
        return ownedByCafeteria;
    }

    public void setOwnedByCafeteria(Cafeteria ownedByCafeteria) {
        this.ownedByCafeteria = ownedByCafeteria;
    }


    public double calcularPrecio() {
        return 0.0;
    }

}
