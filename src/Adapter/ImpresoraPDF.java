package Adapter;

public class ImpresoraPDF implements Impresora{ //impresora PDF ya implementa  de impresora , por que ya podia imprimir pdf , lo que implemento ahora es q imprima texto.

    private ImpresoraPDFAdapter impresoraPDFAdapter;

    public ImpresoraPDF() {
        impresoraPDFAdapter = new ImpresoraPDFAdapter();
    }

    @Override
    public void imprimir(String tipoImpresion, String nombreArchivo) {
        if(tipoImpresion.equalsIgnoreCase("pdf")) {
            System.out.println("imprimiento pdf : " + nombreArchivo);
        }else {
            impresoraPDFAdapter.imprimir(tipoImpresion, nombreArchivo);
        }
    }
//lo use para cuando impresoraPDF implementara impresora
}
