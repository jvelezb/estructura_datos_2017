/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.por.zoom;

/**
 *
 * @author juanvelezballesteros
 */
public class Arreglo3 {
    
    public static void main(String[] args) {
      
        double[] miArreglo = { 1.0, 2.0, 43.0, 2.0, 4.0, 23.0, 2.0,
                           23.0,32.0,600.0 };
        for(int cont = 0 ; cont< miArreglo.length ; cont++){
                System.out.println("valor"+ miArreglo[cont]);
        }
        System.out.println("---------------------");
        for (double temp : miArreglo){
            System.out.println("valor 2->"+temp);
        }
    }
    
    
}
