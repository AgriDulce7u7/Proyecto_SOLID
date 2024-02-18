package co.edu.uniquindio.SOLID.SOLID;

import co.edu.uniquindio.SOLID.SOLID.S.Cliente;

public class Estudiante extends Cliente {
    private int semestreCursado;
    private double descuentoBase;

    /*Constructor*/
    public Estudiante() {
    }

    /*Getters and setters*/
    public int getSemestreCursado() {
        return semestreCursado;
    }

    public void setSemestreCursado(int semestreCursado) {
        this.semestreCursado = semestreCursado;
    }

    public double getDescuentoBase() {
        return descuentoBase;
    }

    public void setDescuentoBase(double descuentoBase) {
        this.descuentoBase = descuentoBase;
    }
}
