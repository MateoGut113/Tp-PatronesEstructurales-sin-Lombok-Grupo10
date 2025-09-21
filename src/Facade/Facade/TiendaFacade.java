package Facade.Facade;


import Facade.compraSubSistem.*;

public class TiendaFacade {
    private Carrito carrito;
    private Envio envio;
    private Pago pago;

    // Facade para ocultar la complejidad de cada Clase y se presenta al cliente una interfaz simplificada
    // usando solo dos metodos agregarProductos y realizar compra -> Creando la fachada para el cliente

    public TiendaFacade(Carrito carrito, Envio envio, Pago pago) {
        this.carrito = carrito;
        this.envio = envio;
        this.pago = pago;
    }

    // metodos publicos para listar productos -> accesibles por el cliente : agregarProducto y realizarCompra
    public void agregarProducto(String producto){
        System.out.println("\nAgregando Productos\n");
        carrito.agregarProducto(producto);
    }

    public void realizarCompra (String metodoPago, String direccionEnvio){

        System.out.println("Realizando Compra\n");
        carrito.mostrarProductos();
        carrito.carritoCompleto();
        System.out.println("Procesando el  Metodo de Pago\n");
        pago.metodoPago(metodoPago);
        pago.RealizarPago();
        System.out.println("Procesando el Envio\n");
        envio.agregarDireccionEnvio(direccionEnvio);

        System.out.println("Compra Finalizada\n");

    }
}
