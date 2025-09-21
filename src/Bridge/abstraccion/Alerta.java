package Bridge.abstraccion;

import Bridge.implementacion.Canal;

// Sub clase abstraccion
public class Alerta extends Notificacion {
    public Alerta(Canal canal ){
        super(canal);
    }
    @Override
    public void GenerarNotificacion (){
        System.out.println("La Alerta se eniviara mediante un "+canal.AplicartipoCanal());
    }
}
