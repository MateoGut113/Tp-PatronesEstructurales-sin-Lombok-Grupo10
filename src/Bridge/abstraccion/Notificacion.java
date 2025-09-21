package Bridge.abstraccion;

import Bridge.implementacion.*;

// Abstracción
public abstract class Notificacion {
    protected Canal canal;

    public Notificacion(Canal canal) {
        this.canal = canal;
    }


    public abstract void GenerarNotificacion();
}