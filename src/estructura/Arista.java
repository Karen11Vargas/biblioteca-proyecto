/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class Arista {
    private NodoLibro nodoDestino;
    private String fechaPrestamo;
    private Arista siguienteArista;

    public Arista(NodoLibro nodoDestino, String fechaPrestamo) {
        this.nodoDestino = nodoDestino;
        this.fechaPrestamo = fechaPrestamo;
        this.siguienteArista = null;
    }

    public NodoLibro getNodoDestino() {
        return nodoDestino;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Arista getSiguienteArista() {
        return siguienteArista;
    }

    public void setSiguienteArista(Arista siguienteArista) {
        this.siguienteArista = siguienteArista;
    }
}
