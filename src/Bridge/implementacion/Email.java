package Bridge.implementacion;

//Sub clase implementación
public class Email implements Canal {
    @Override
    public String AplicartipoCanal(){
        return "Email";
    }
}
