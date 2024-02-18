package co.edu.uniquindio.SOLID.SOLID.L;



public class Estudiante extends Cliente {
    private int semestreCursado;

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

    @Override
    public double valorDescuento() {
        return 8000;
    }
}
