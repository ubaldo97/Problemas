/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soluciones;

/**
 *
 * @author ups_c
 */
public class EsUnico {
     /**
     * Enunciado del Problema:
  implementar un algoritmo para determinar si una cadena tiene solo caracteres únicos(sin repetir). 
     *  ¿Qué pasa si no puede utilizar estructuras de datos adicionales? (restriccion)
     */
   
    //Solución
    private static boolean esUnico(String prueba) {
       if(prueba.length()>128) return false;
       //El numero 128 se obtiene de la tabla ascii ya que solo existen 128 caracteres posibles
       //significa que si la cadena tiene una longitud mayor a 128 obligatoriamente debe haber 
       //algún caracter repetido.
       boolean[] conjuntoCaracteres = new boolean[128];
       for(int i=0;i<prueba.length();i++){
           int val = prueba.charAt(i);
           if(conjuntoCaracteres[val]){// Para saber si ya encontro el char en la cadena
               return false;
           }
           conjuntoCaracteres[val]=true;
       }
        return true;
    }
    /**
 * ANALISIS
 * La complejidad en tiempo de nuestra solución es O(n) donde n es la 
 * logitud de la cadena dada.
 * El espacio de complejidad es O(1)
 
 NOTA: Tambien se podría argumentar que el tiempo de complejidad es O(1)
 ya que ciclo for nunca itera más de 128 veces, en este caso se puede expresar
 el tiempo de complejidad como O(c) siendo "c" el tamaño del conjunto de caracteres
 */
    
     public static void main(String[] args){
        //Casos de prueba de ejemplo
        String prueba = "Hola mundo"; //(contiene 2 "o" por lo tanto no es unico)
        String prueba2 = "abcde(fg)h$#^";//(es unico ya que no se repiten caracteres)
        boolean respuesta;
        respuesta = esUnico(prueba); //llamamos a nuestro método y almacenamos la respuesta
        System.out.println(respuesta);// mostramos respuesta en pantalla 
        respuesta = esUnico(prueba2); //llamamos a nuestro método y almacenamos la respuesta2
        System.out.println(respuesta);// mostramos respuesta en pantalla 
    }

    
}
