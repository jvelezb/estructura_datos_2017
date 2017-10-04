/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.por.zoom;

import java.lang.Math;

/**
 *
 * @author juanvelezballesteros
 */
public class Arreglos2 {
    
    public static void main(String[] args) {
        String[] arrStr = new String[15];
        for(int i = 0; i <arrStr.length; i++){
            arrStr[i] = "Alumno "+(int)((Math.random()*1000)-500);
        }//la inicializacion y le setteando una valor 
        for(int i = 0; i<arrStr.length; i++){
            System.out.println(arrStr[i]);// imprimiendo el valor del arreglo
        }
        System.out.println("----------------------");
        for(String valor: arrStr){
            System.out.println(valor);
        }
    }
    
}
