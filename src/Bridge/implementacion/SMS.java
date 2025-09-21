package Bridge.implementacion;

//Sub clase implementación
public class SMS implements Canal {
    @Override
    public String AplicartipoCanal (){
        return "SMS";
    }
}
