package Proxy;

public class ArchivoReal implements Archivo {
    private String nombreArchivo;
    //private String tipoArchivo;

    public ArchivoReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void abrir(String nombreUsuario) {
        System.out.println("\nEl archivo '" + nombreArchivo + "' ha sido abierto por el usuario: " + nombreUsuario);
    }

}
