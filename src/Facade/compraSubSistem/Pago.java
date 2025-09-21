package Facade.compraSubSistem;

public class Pago {


    public void metodoPago(String metodoPago) {

        if (metodoPago.equalsIgnoreCase("efectivo")) {
            System.out.println("\sRealizando pago en efectivo.");
        } else if (metodoPago.equalsIgnoreCase("tarjeta")) {
            System.out.println("\sRealizando pago con tarjeta.");
        } else if (metodoPago.equalsIgnoreCase("transferencia")) {
            System.out.println("\sRealizando pago por transferencia.");
        } else {
            System.out.println("\sMétodo de pago no admitido");
        }

    }

    public void RealizarPago(){
        System.out.println("\nPago realizado correctamente \nGracias por su Compra -> Ir a Metodo de Envio \n");
    }

}
