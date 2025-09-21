package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>(); //List que contendrá los platos o submenus.

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    //Metodo que agrega a la List los objetos de tipo "ElementoMenu", que pueden ser desde un mismo menu o un plato.
    public void agregarElemento(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    //Este metodo realiza una recurción por cada elemento dentro de un menu (ya sea un plato o un submenu)
    //Y mostrará su contenido.
    @Override
    public void mostrar() {
        System.out.println("\nMenú: " + nombre);
        for (ElementoMenu elemento : elementos) {
            elemento.mostrar();
        }
    }
}
