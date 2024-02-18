package co.edu.uniquindio.SOLID.SOLID;

import co.edu.uniquindio.SOLID.SOLID.S.Producto;

public class Panaderia extends Producto {
    private boolean conservantes;

    /*Constructor*/
    public Panaderia() {
    }

    /*Getters and setters*/
    public boolean getConservantes() {
        return conservantes;
    }

    public void setConservantes(boolean conservantes) {
        this.conservantes = conservantes;
    }


    @Override
    public double calcularPrecio() {
        int precioBase = getValor();
        double impuestoAdicional =0.18;
        if (conservantes = true) {
            return precioBase * (1 + impuestoAdicional);
        }
        else {
            return precioBase;
        }
    }
}