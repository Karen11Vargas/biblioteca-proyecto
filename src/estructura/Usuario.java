/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author Karen.Vargas
 */
public class Usuario {
    private int documento;
    private String nombre;

    public Usuario(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "documento=" + documento + ", nombre=" + nombre + '}';
    }
    
    
    
}
