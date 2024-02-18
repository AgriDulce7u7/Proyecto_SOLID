package co.edu.uniquindio.SOLID.SOLID.O;


import co.edu.uniquindio.SOLID.SOLID.O.Enum.TipoBebidaAlcoholica;

public class BebidaAlcoholica extends Bebida {
    private int gradoAlcohol;
    private TipoBebidaAlcoholica tipoBebidaAlcoholica;

    /*Constructor*/
    public BebidaAlcoholica() {
    }

    /*Getters and setters*/
    public int getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(int gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public TipoBebidaAlcoholica getTipoBebidaAlcoholica() {
        return tipoBebidaAlcoholica;
    }

    public void setTipoBebidaAlcoholica(TipoBebidaAlcoholica tipoBebidaAlcoholica) {
        this.tipoBebidaAlcoholica = tipoBebidaAlcoholica;
    }

    @Override
    public double calcularPrecio() {
        int precioBase = getValor();
        double impuestoNacional= 0.0;
        double precioFinal = 0.0;
        if (tipoBebidaAlcoholica == TipoBebidaAlcoholica.NACIONAL) {
            if (gradoAlcohol <= 50) {
                impuestoNacional = gradoAlcohol * 0.02;
                precioFinal= precioBase * (1 + impuestoNacional);
            }
        }
        else if (tipoBebidaAlcoholica == TipoBebidaAlcoholica.IMPORTADA){
            precioFinal = (precioBase * 1.3) * (0.3 * gradoAlcohol);
        }
        return precioFinal;
    }
}
