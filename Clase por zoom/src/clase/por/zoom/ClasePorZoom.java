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
public class ClasePorZoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] miArreglo;// tipo entero
        miArreglo  = new int[20]; //tamaño de 10 elementos
        //el valor por default de un entero es cero
        miArreglo[0] = 12;
        miArreglo[1] = 13;
        miArreglo[2] = 14;
        miArreglo[3]= 15;
        miArreglo[4]= -2;
        miArreglo[5]= 0;
        miArreglo[6] = 23;
        miArreglo[7] = 34;
        miArreglo[8] = 10;
        miArreglo[9] = 10;
        miArreglo[16] = 900;
        System.out.println("La posicion 0: "+
                miArreglo[0]);
        System.out.println("La posicion 9: "+
                miArreglo[9]);
        
        for(int contador = 0;contador<miArreglo.length; contador++){
            System.out.println("Posicion "+contador+" ="+miArreglo[contador]);
        }
        
    }
    
}
