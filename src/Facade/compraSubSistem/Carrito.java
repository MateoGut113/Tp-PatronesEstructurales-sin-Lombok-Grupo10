package Facade.compraSubSistem;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List <String> listaCompra = new ArrayList<>();


    public void agregarProducto(String producto){

        listaCompra.add(producto);
        System.out.println("\sProducto agregado exitosamente: " + producto);
    }

    public void mostrarProductos(){

        while ( listaCompra.isEmpty()){
            System.out.println(listaCompra.iterator());
        }
        System.out.println("\nNo existen mas productos en su carrito");
    }

    public void carritoCompleto(){
        System.out.println("\nLista de compras finalizada -> Ir a pagr");
    }

}