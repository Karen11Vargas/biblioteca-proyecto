/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
abstract class Nodo {
    private String id;
    private Nodo siguienteNodo;
    private Arista primeraArista;

    public Nodo(String id) {
        this.id = id;
        this.siguienteNodo = null;
        this.primeraArista = null;
    }

    public String getId() {
        return id;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public Arista getPrimeraArista() {
        return primeraArista;
    }

    public void setPrimeraArista(Arista primeraArista) {
        this.primeraArista = primeraArista;
    }
}
