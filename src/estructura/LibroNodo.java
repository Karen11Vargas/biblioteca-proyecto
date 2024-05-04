/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class LibroNodo {
    int Dato;
    String Nombre;
    String Autor;
    LibroNodo HijoIzq, HijoDer;

    public LibroNodo() {
    }
    
    public LibroNodo (int Dato,String nom, String autor) {
        this.Dato = Dato;
        this.Nombre=nom;
       this.Autor=autor;
        this.HijoDer = null;
        this.HijoIzq = null;
    }
    public String tostring()
    {
      return Nombre +"Su datos es "+ Dato + "Autor: " + Autor;
    }
}
