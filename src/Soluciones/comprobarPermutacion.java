/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soluciones;
import java.util.*;
/**
 *
 * @author ups_c
 */
public class comprobarPermutacion {
     /*
     * Enunciado del Problema:
        Dadas dos cadenas, escribe un metodo para decidir si 
        una es permutación de la otra.
     */
    
    //Solucion 1 -  Ordenar las cadenas
     public static  String OrdenarCadena(String s){
         char[] contenido = s.toCharArray();
         Arrays.sort(contenido);
         return new String(contenido);
     }
     
     public static boolean permutacion(String s, String t){
         
         if(s.length() != t.length()){
             return false;
         }
         
         return OrdenarCadena(s).equals(OrdenarCadena(t));
     }


    
    
    public static void main(String[] args){
      String s1 = "arroz";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
      String s2 = "zorra";
      
      System.out.println(permutacion(s1,s2));
    
    }

}
