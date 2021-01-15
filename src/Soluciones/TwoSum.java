/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soluciones;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ups_c
 */
public class TwoSum {

    /**
     * Enunciado del Problema:
     * Dado un array de números enteros y un entero objetivo, 
     * devuelve los índices de los dos números que al sumarse dan como resultado
     * el objetivo.
     * Se puede asumir que cada entrada tiene exactamente una solución,
     * y no se puede usar el mismo elemento dos veces.
     * Puedes devolver la respuesta en cualquier orden.
     */
   
    public static int[] twoSumSol(int[] nums, int objetivo) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complemento = objetivo - nums[i];
        if (map.containsKey(complemento)) {
            return new int[] { map.get(complemento), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No tiene solucion");
}/**
 * ANALISIS
 * La complejidad en tiempo de nuestra solución es O(n) dado que solo recorrimos
 * la lista que contiene n elementos una vez y cada consulta a la tabla cuesta 
 * solo O(1).
 * 
 * El espacio de complejidad tambien es O(n) ya que depende del número 
 * de elementos almacenados en la tabla hash el cual es como máximo de n 
 * elementos.
 * 
 * NOTA: Esta solución no es la única tambien es posible resolver el problema 
 * por fuerza bruta usando dos ciclos anidados o usando la misma lógica de esta
 * solución pero desarrollando dos pasos(ciclos separados) uno para llenar la 
 * tabla y otro para consultar si existe el complemento.
 */
    
    /**
     * @param args
     */
    public static void main(String[] args){
        //Caso de prueba de ejemplo
        int[] nums = new int[]{2,8,7,15};// arreglo de ejemplo
        int[] respuesta = new int[2]; // arreglo que tendra las pocisiones de la solucion
        int objetivo = 9;// numero objetivo        
        respuesta = twoSumSol(nums,objetivo); //llamamos a nuestro método y almacenamos la respuesta
        System.out.println("["+respuesta[0]+","+respuesta[1]+"]");// mostramos respuesta en pantalla 
    }
    
}
