package co.edu.uniquindio.SOLID.SOLID.I;

import co.edu.uniquindio.SOLID.SOLID.I.Services.IFruta;

public class Fruta extends Producto implements IFruta {
    private final double PRECIO_BASE = 7.0;

    /*Constructor*/
    public Fruta() {
    }


    @Override
    public double calcularPrecio(int pesoKilo) {
        double impuesto = calcularImpuesto(pesoKilo);
        double precio = 0.0;
        double precioFinal = 0.0;
        precio = pesoKilo * (getValor() * 2);
        precioFinal = precio + (precio * impuesto);
        return precioFinal;
    }

    private  double calcularImpuesto(int pesoKilo) {
        double impuesto = PRECIO_BASE;
        int resultado = 0;
        if (pesoKilo > 3){
            resultado =  pesoKilo - 3;
            if(resultado >= 7){
                impuesto = 0;
            }else{
                impuesto = impuesto - resultado;
            }
        }

        return  impuesto/100;
    }
}
