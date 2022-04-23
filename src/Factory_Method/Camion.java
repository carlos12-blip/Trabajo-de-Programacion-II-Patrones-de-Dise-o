package Factory_Method;

public class Camion implements Transporte {

    //sobreescritura de los metodos abstractos
    
    @Override
    public void arrancar() {
        System.out.println("...Arracando el Camión");
    }

    @Override
    public void detener() {
        System.out.println("...Deteniendo el Camión");
    }

    @Override
    public String tipo() {
        return "Camión";
    }

    @Override
    public String area() {
        return "Terrestre";
    }
    
}
