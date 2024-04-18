/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.pkg2;

/**
 *
 * @author facun
 */
public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;

    }
    //insertar dentro de la pila

    public void Insertar(char valor) {
        Nodo new_nodo = new Nodo();
        new_nodo.informacion = valor;

        if (UltimoValorIngresado == null) {

            new_nodo.siguiente = null;
            UltimoValorIngresado = new_nodo;

        } else {

            new_nodo.siguiente = UltimoValorIngresado;
            UltimoValorIngresado = new_nodo;

        }
    }
    //Extraer de la pila

    public char extraer() {
        if (UltimoValorIngresado != null) {
            char informacion = UltimoValorIngresado.informacion;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;
            return informacion;
        } else {
            return Character.MAX_VALUE;
        }

    }

    public boolean PilaVacia() {
        return UltimoValorIngresado == null;

    }
}
