package co.edu.uniquindio.SOLID.SOLID.O;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Dulce());
        listaProductos.add( new Agua());
        listaProductos.add( new BebidaAlcoholica());
        imprimirPrecioProducto(listaProductos);
    }

    /* Función para imprimir el precio del producto */
    public static void imprimirPrecioProducto(List<Producto> listaProductos){
        for (Producto producto : listaProductos) {
            System.out.println(producto.calcularPrecio());
        }
    }
}
