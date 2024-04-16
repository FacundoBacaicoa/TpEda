package trabajopractico3.pkg1eda;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {

    Stack<Integer> pila = new Stack<Integer>();

    Stack<Integer> pila1 = new Stack<Integer>();
    
    Stack<Integer> pila2= new Stack<Integer>();

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

    public Stack<Integer> getPila2() {
        return pila2;
    }

    public void setPila2(Stack<Integer> pila2) {
        this.pila2 = pila2;
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
       System.out.println("-----------------------");
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
    
    public void pilaResult(){
                while (!pila.isEmpty() && !pila1.isEmpty()) {
            int elemento = pila.pop();
            pila2.push(elemento);
            elemento=pila1.pop();
            pila2.push(elemento);
        }
    }
    
    public void ordenarPila(){
         int i, j, temp = 0;
         int tamaño=pila2.size();
 for (i = 0; i < tamaño; i++) {
 for (j = 0; j < tamaño-1; j++) {
 if (pila2.get(j) < pila2.get(j+1)) {
     temp = pila2.get(j);
      pila2.set(j, pila2.get(j + 1));
      pila2.set(j + 1, temp);
 }
      } 
    }
        System.out.println("Pila 3");
        System.out.println(pila2);
  }
}

