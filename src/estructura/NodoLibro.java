/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class NodoLibro extends Nodo {
    private String titulo;

    public NodoLibro(String id, String titulo) {
        super(id);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}