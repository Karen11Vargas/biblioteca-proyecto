/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class NodoUsuario extends Nodo {
    private String nombre;

    public NodoUsuario(String id, String nombre) {
        super(id);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
