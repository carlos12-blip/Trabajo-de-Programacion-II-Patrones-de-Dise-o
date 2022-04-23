package Factory_Method;

public class Fabrica {

    //declarar un metodo estatico, se encargar de construir los objetos segun
    //el parametro
    public static Transporte construir(String tipo) {
        switch(tipo){//crea una instancia dependiendo del tipo
            case "Camión": return new Camion();
                            
            case "Barco": return new Barco();
            
            default: return null;
        }
    }
}
