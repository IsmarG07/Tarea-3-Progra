
package com.mycompany.tarea3;

import EstructuraNoLineales.Arbol;


public class Tarea3 {

    public static void main(String[] args) {
        
        Arbol arbol=new Arbol();
        arbol.insertar(56);
        arbol.insertar(10);
        arbol.insertar(16);
        arbol.insertar(12);
        arbol.insertar(15);
        arbol.insertar(33);
        arbol.insertar(49);
        System.out.println("INORDEN: ");
        arbol.dispararInorden();
        System.out.println(" ");
        System.out.println("POSTORDEN: ");
        arbol.dispararPostorden();
         System.out.println(" ");
        System.out.println("PREORDEN: ");
        arbol.dispararPreorden();
        
        
    }
}
