/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.pkg1eda;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author facun
 */
public class Pilas {

    Stack<Integer> pila = new Stack<Integer>();

    Stack<Integer> pila1 = new Stack<Integer>();

    public Pilas() {
    }

    public Stack<Integer> getPila1() {
        return pila1;
    }

    public void setPila1(Stack<Integer> pila1) {
        this.pila1 = pila1;
    }

    public Stack<Integer> getPila() {
        return pila;
    }

    public void setPila(Stack<Integer> pila) {
        this.pila = pila;
    }

    public void metodoPush() {
        //Pila 1
        
        pila.push(10);
        pila.push(7);
        pila.push(6);
        pila.push(5);
        System.out.println("Pila 1");
         for(int i=0;i>=0; ++i){
             
             System.out.println(pila);
             break;
         }
            
        
        //Pila 2
        pila1.push(13);
        pila1.push(12);
        pila1.push(11);
        pila1.push(8);
        System.out.println("Pila 2");
       for(int i=0;i>=0; ++i){
             System.out.println(pila1);
             break;
         }
            
    }

}
