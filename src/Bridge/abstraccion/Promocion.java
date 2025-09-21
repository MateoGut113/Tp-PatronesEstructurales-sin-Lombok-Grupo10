package Bridge.abstraccion;

import Bridge.implementacion.*;

// Sub clase abstraccion
public class Promocion extends Notificacion {
    public Promocion(Canal canal){
        super(canal);
    }

    @Override
    public void GenerarNotificacion (){
        System.out.println("La promoción se enviara mediante un "+canal.AplicartipoCanal());
    }
}

