
import Adapter.ImpresoraPDF;
import Bridge.abstraccion.*;
import Bridge.implementacion.*;
import Composite.Menu;
import Composite.Plato;
import Decorator.*;
import Facade.Facade.*;
import Facade.compraSubSistem.*;
import Proxy.Archivo;
import Proxy.ArchivoProxy;

public class Main {
    public static void main(String[] args) {

        //-----PATRON ADAPTER-----
        System.out.println("\n->PROBAMOS PATRON ADAPTER:");

        ImpresoraPDF file1 = new ImpresoraPDF();

        file1.imprimir("pdf","Patrones de Diseño");
        file1.imprimir("foto","foto familiar");
        file1.imprimir("texto plano","texto plano");



        //-----PATRON COMPOSITE-----
        System.out.println("\n->PROBAMOS PATRON COMPOSITE:");

        //Creamos los submenus
        Menu subMenuEntrada = new Menu("Submenú de Entrada");
        Menu subMenuPrincipal = new Menu("Submenu Plato Principal");
        Menu subMenuPostre = new Menu("Submenu Postres");

        //Creamos los platos
        //Platos que corresponden a la categoria de entrada
        Plato empanada1 = new Plato("Empanada de Carne", 1500);
        Plato empanada2 = new Plato("Empanada de Jamón y Queso", 1500);
        Plato ensalada1 = new Plato("Ensalada Simple", 1600);

        //Platos que corresponden a la categoria de Plato principal
        Plato milanesa1 = new Plato("Milanesa Napolitana", 5000);
        Plato milanesa2 = new Plato("Milanesa A Caballo", 6000);
        Plato hamburguesa1 = new Plato("Hamburguesa Clásica", 5000);
        Plato hamburguesa2 = new Plato("Hamburguesa Doble carne", 6000);

        //Platos que corresponden a la categoria de Postres
        Plato cassata1 = new Plato("Helado Cassata", 500);
        Plato almendrado1 = new Plato("Helado Almendrado", 500);
        Plato flan1 = new Plato("Flan", 550);

        //Dividimos a los platos según a la categoria que correspondan
        //Submenu de Entrada
        subMenuEntrada.agregarElemento(empanada1);
        subMenuEntrada.agregarElemento(empanada2);
        subMenuEntrada.agregarElemento(ensalada1);

        //Submenu Plato principal
        subMenuPrincipal.agregarElemento(milanesa1);
        subMenuPrincipal.agregarElemento(milanesa2);
        subMenuPrincipal.agregarElemento(hamburguesa1);
        subMenuPrincipal.agregarElemento(hamburguesa2);

        //Submenu Postre
        subMenuPostre.agregarElemento(cassata1);
        subMenuPostre.agregarElemento(almendrado1);
        subMenuPostre.agregarElemento(flan1);

        //Creamos el menu principal
        Menu menuPrincipal = new Menu("Menu Principal de la casa");
        menuPrincipal.agregarElemento(subMenuEntrada);
        menuPrincipal.agregarElemento(subMenuPrincipal);
        menuPrincipal.agregarElemento(subMenuPostre);

        //Mostramos todos los elementos del menu principal de manera uniforme.
        menuPrincipal.mostrar();



        //-----PATRON PROXY-----
        System.out.println("\n->PROBAMOS PATRON PROXY:");

        Archivo archivo1 = new ArchivoProxy("PatronesEstructurales_1.pdf");
        // Usuario permitido
        archivo1.abrir("admin");

        // Usuario denegado
        archivo1.abrir("alumno");



        //-----PATRON DECORATOR-----
        System.out.println("\n->PROBAMOS PATRON DECORATOR:");

        Plan BHD = new DescargasOffline(new PlanHD(new PlanBasico()));
        System.out.println("descripcion : " +BHD.nombrePlan());
        System.out.println("Monto total: " + BHD.precio());

        Plan BH = new PlanHD(new PlanBasico());
        System.out.println("descripcion : " +BH.nombrePlan());
        System.out.println("Monto total: " + BH.precio());

        /*
        clases
            plan basico
            hd
            untraHD
            offline
         */



        //-----PATRON FACADE-----
        System.out.println("\n->PROBAMOS PATRON FACADE:");

        // Interaccion entre el Cliente y nuestro Sistema Tienda Online
        // Solo interactua con la fachada (TiendaFacade) Ocultando la complejidad addicional

        // creacion de clases
        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();

        // Clase que interactua con el cliente -> Facade
        TiendaFacade tienda = new TiendaFacade(carrito,envio,pago);

        // agregar lista de productos
        tienda.agregarProducto("impresora");
        tienda.agregarProducto("tinta r/b");
        tienda.agregarProducto("hojas A4");
        tienda.agregarProducto("teclado");
        tienda.agregarProducto("mouse inalambrico");
        // gestion de metodo de pago y envio
        tienda.realizarCompra("efectivo", "Calle Siempreviva 2000");



        //-----PATRON BRIDGE-----
        System.out.println("\n->PROBAMOS PATRON BRIDGE:");

        Notificacion AlertaEmail = new Alerta(new Email());
        Notificacion RecordatorioEmail = new Recordatorio(new Email());
        Notificacion PromocionSMS = new Promocion(new SMS());

        AlertaEmail.GenerarNotificacion();
        RecordatorioEmail.GenerarNotificacion();
        PromocionSMS.GenerarNotificacion();

        // Para este ejercicio primero identificamos y separamos los tipos de jerarquía
        // "ABSTRACCIÓN"--> Notificación (que) e "IMPLEMENTACIÓN"--> implementacion.Canal (como se envia)

        //Ahora usando el patron bridge podemos relacionar ambas jerarquias para que cada tipo
        // de notificacion se pueda ralacionar con un tipo de canal de envio por el cual se enviara.
        // Con esto evitamos la multiplicación de conbinación de clases.
    }
}