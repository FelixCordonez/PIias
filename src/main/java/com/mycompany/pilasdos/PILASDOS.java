
package com.mycompany.pilasdos;

import java.util.Stack;// Es libreria implementa todo lo que emos echo en esa clase se la utiliza creando un objeto
public class PILASDOS {

    public static void main(String[] args) {
        Stack<Integer> pila = new  Stack<>();
         pila.push(14);
         pila.push(12);
         pila.push(23);
          
        int Elementosuperior = pila.peek();
        
        System.out.println("El elemeto superior es: "+Elementosuperior);
        
        boolean Pilavacia =pila.isEmpty();
        System.out.println("La pila esta vacia "+ Pilavacia);
        
        
        System.out.println("EL elemeto eliminado es : "+pila.pop());
        System.out.println(" Los elementos de la pila son: "+pila);// mostrar los elementos 
        
        
        
    }
}
