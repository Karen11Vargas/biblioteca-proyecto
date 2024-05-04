/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

import javax.swing.JOptionPane;

/**
 *
 * @author karen_b
 */
public class ArbolPrestamo {
    public PrestamoNodo Raiz;
    
    public ArbolPrestamo () { 
        Raiz = null;
    }
    public boolean estaVacio(){
        return Raiz == null;
    }

 
    
    public void InsertarDatos(int documento,String nom){
        
        PrestamoNodo nuevo = new PrestamoNodo(documento,nom);
        if (estaVacio()){
            Raiz = nuevo;
            JOptionPane.showMessageDialog(null, "Prestamo a \"" + nuevo.documento + "\" ingresado con Exito");

        }else {
            PrestamoNodo aux = Raiz, Padre;
            while (true) {
                Padre = aux;
                if (documento < aux.documento){
                    aux = aux.HijoIzq;
                    if (aux == null){
                        Padre.HijoIzq = nuevo;
                        JOptionPane.showMessageDialog(null, "Prestamo a \"" + nuevo.documento + "\" ingresado con Exito");

                        return;
                    }
                } else {
                    aux = aux.HijoDer;
                    if (aux == null){
                        Padre.HijoDer = nuevo;
                        JOptionPane.showMessageDialog(null, "Prestamo a \"" + nuevo.documento + "\" ingresado con Exito");

                        return;
                    }
                }
            }
        }
    }

    public void inOrder (PrestamoNodo Nodo) {
        if (Nodo != null){
            inOrder(Nodo.HijoIzq);
            System.out.println(Nodo.documento +" "+Nodo.nombre );
            inOrder(Nodo.HijoDer);
        }
    }
    
     public PrestamoNodo buscarPrestamo(PrestamoNodo nodo, int documento) {
        if (nodo != null) {
            PrestamoNodo encontrado = buscarPrestamo(nodo.HijoIzq, documento);
            if (encontrado != null) {
                return encontrado;
            }
            if (nodo.documento == documento) {
                 inOrder(nodo.HijoIzq);
                System.out.println("Documento: " + nodo.documento + " Nombre: " + nodo.nombre );
                return nodo;
            }
            return buscarPrestamo(nodo.HijoDer, documento);
        }
        return null; 
    }
}
