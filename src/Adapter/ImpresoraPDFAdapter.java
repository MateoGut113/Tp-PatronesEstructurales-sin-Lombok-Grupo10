package Adapter;

public class ImpresoraPDFAdapter implements Impresora {

    //private ImpresoraPDF impresoraPDF;
    private ImpresoraTexto impresoraTexto;


    public ImpresoraPDFAdapter() {
        // impresoraPDF= new ImpresoraPDF();
        impresoraTexto = new ImpresoraTexto();
    }

    @Override
    public void imprimir(String tipoImpresion, String nombreArchivo) {
        if(tipoImpresion.equalsIgnoreCase("TEXTO PLANO")) {
            impresoraTexto.imprimirTextoPlano(nombreArchivo);
        } else {
            System.out.println("Formato no soportado: " + tipoImpresion);
        }

    }
}
