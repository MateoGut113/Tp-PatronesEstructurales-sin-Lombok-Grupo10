package Bridge.abstraccion;

import Bridge.implementacion.*;

// Sub clase abstracción
public class Recordatorio extends Notificacion {

    public Recordatorio(Canal canal){
        super(canal);
    }
    @Override
    public void GenerarNotificacion (){
        System.out.println("El recordatorio se enviara mediante un "+canal.AplicartipoCanal());
    }
}
