/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Method;

/**Integrantes del grupo: 
 * Dilan Méndez
 * Ivan Ortiz
 * Brayan Segura
 * Rayner Navarro 
 */
public class Aplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear instancias
        Transporte t1 = Fabrica.construir("Camión");
        t1.arrancar();
        t1.detener();
        System.out.println("Tipo: " + t1.tipo() + ", Area: " + t1.area()+"\n");
    
        
        Transporte t2 = Fabrica.construir("Barco");
        t2.arrancar();
        t2.detener();
        System.out.println("Tipo: "+t2.tipo()+", Area: "+t2.area());
    
    
    
    }

}
