package co.edu.uniquindio.SOLID.SOLID.L;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Profesor());
        listaClientes.add( new Estudiante());
        imprimirDescuentoCliente(listaClientes);
    }

    /* Función para imprimir el descuento del cliente */
    public static void imprimirDescuentoCliente(List<Cliente> listaClientes){
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.valorDescuento());
        }
    }
}
