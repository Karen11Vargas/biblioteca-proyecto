/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class PrestamoNodo {
    
    int documento;
    String nombre;
    PrestamoNodo HijoIzq, HijoDer;
    
    public PrestamoNodo (int docummento, String nombre) {
        this.documento=docummento;
        this.nombre=nombre;
        this.HijoDer = null;
        this.HijoIzq = null;
    }
    
    public String tostring()
    {
      return documento +"Su prestamo es "+ nombre;
    }
}
