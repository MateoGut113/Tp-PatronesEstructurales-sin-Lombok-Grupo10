package Proxy;

import java.util.Set;
import java.util.HashSet;

public class ArchivoProxy implements Archivo {
    private ArchivoReal archivoReal;
    private String nombreArchivo;
    private static final Set<String> usuariosPermitidos = new HashSet<>(); //En este HashSet guardaremos todos los usuarios con permisos.

    // Usuarios con permiso
    static {
        usuariosPermitidos.add("admin");
        usuariosPermitidos.add("profesor");
        usuariosPermitidos.add("ayudante_catedra");
    }

    public ArchivoProxy(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void abrir(String nombreUsuario) {
        if (usuariosPermitidos.contains(nombreUsuario)) {
            archivoReal = new ArchivoReal(nombreArchivo);
            archivoReal.abrir(nombreUsuario);
        } else {
            System.out.println("\n⛔ Acceso denegado para el usuario: " + nombreUsuario);
        }
    }
}
