package Factory_Method;

public class Barco implements Transporte {

    @Override
    public void arrancar() {
        System.out.println("...Arrancando los motores del barco");
    }

    @Override
    public void detener() {
        System.out.println("...Deteniendo los motores del barco");
    }

    @Override
    public String tipo() {
        return "Barco";
    }

    @Override
    public String area() {
        return "Marítimo";
    }
    
}
