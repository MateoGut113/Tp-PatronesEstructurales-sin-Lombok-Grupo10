package Facade.compraSubSistem;

public class Envio {

    public void agregarDireccionEnvio(String direccion ){

        if (direccion.equals(null)){
            System.out.println("\sSe ha indicado una direccion invalida");
        }else {
            System.out.println("\sSu pedido esta listo se enviara a : " + direccion);
        }

    }

}
