/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class UsuarioNodo {
    int Dato;
    String Nombre;

    public UsuarioNodo() {
    }
   
    UsuarioNodo HijoIzq, HijoDer;
    public UsuarioNodo (int Dato,String nom) {
        this.Dato = Dato;
        this.Nombre=nom;
        this.HijoDer = null;
        this.HijoIzq = null;
    }
    public String tostring()
    {
      return Nombre +"Su datos es "+ Dato;
    }
}
