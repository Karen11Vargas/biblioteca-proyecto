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
public class ArbolUsuario {
     public  UsuarioNodo Raiz;
    public ArbolUsuario () { 
        Raiz = null;
    }
    public boolean estaVacio(){
        return Raiz == null;
    }

 
    
    public void InsertarDatos(int documento,String nom){
        UsuarioNodo nuevo = new UsuarioNodo(documento,nom);
        if (estaVacio()){
            Raiz = nuevo;
              JOptionPane.showMessageDialog(null, "Usuario \"" + nuevo.Dato + "\" ingresado con Exito");

        }else {
            UsuarioNodo aux = Raiz, Padre;
            while (true) {
                Padre = aux;
                if (documento < aux.Dato){
                    aux = aux.HijoIzq;
                    if (aux == null){
                        Padre.HijoIzq = nuevo;
                        JOptionPane.showMessageDialog(null, "Usuario \"" + nuevo.Dato + "\" ingresado con Exito");

                        return;
                    }
                } else {
                    aux = aux.HijoDer;
                    if (aux == null){
                        Padre.HijoDer = nuevo;
                        JOptionPane.showMessageDialog(null, "Usuario \"" + nuevo.Dato + "\" ingresado con Exito");

                        return;
                    }
                }
            }
        }
    }

    public void inOrder (UsuarioNodo Nodo) {
        if (Nodo != null){
            inOrder(Nodo.HijoIzq);
            /*System.out.println(Nodo.Dato);*/
            
            System.out.println(Nodo.Dato +" "+Nodo.Nombre );
            inOrder(Nodo.HijoDer);
        }
    }
    
    
    public UsuarioNodo buscarUsuarios(UsuarioNodo nodo, int documento) {
        if (nodo != null) {
            UsuarioNodo encontrado = buscarUsuarios(nodo.HijoIzq, documento);
            if (encontrado != null) {
                return encontrado;
            }
            if (nodo.Dato == documento) {
                 inOrder(nodo.HijoIzq);
                System.out.println("Documento: " + nodo.Dato + " Nombre: " + nodo.Nombre );
                return nodo;
            }
            return buscarUsuarios(nodo.HijoDer, documento);
        }
        return null; 
    }
    
     public void eliminar(int dato) {
        Raiz = eliminarRecursivo(Raiz, dato);
    }

    private UsuarioNodo eliminarRecursivo(UsuarioNodo nodo, int dato) {
        if (nodo == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el usuario", "Error de Eliminación", JOptionPane.WARNING_MESSAGE);
            return nodo;
        }

        if (dato < nodo.Dato) {
            nodo.HijoIzq = eliminarRecursivo(nodo.HijoIzq, dato);
            JOptionPane.showMessageDialog(null, "Usuario " + dato + " eliminado exitosamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        }
        else if (dato > nodo.Dato) {
            nodo.HijoDer = eliminarRecursivo(nodo.HijoDer, dato);
            JOptionPane.showMessageDialog(null, "Usuario " + dato + " eliminado exitosamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        }
        else {
            if (nodo.HijoIzq == null) {
            JOptionPane.showMessageDialog(null, "Usuario " + dato + " eliminado exitosamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

                return nodo.HijoDer;
            } else if (nodo.HijoDer == null) {
            JOptionPane.showMessageDialog(null, "Usuario " + dato + " eliminado exitosamente", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

                return nodo.HijoIzq;
            }

            nodo.Dato = encontrarMenorValor(nodo.HijoDer);

            nodo.HijoDer = eliminarRecursivo(nodo.HijoDer, nodo.Dato);
        }
        return nodo;
    }

    private int encontrarMenorValor(UsuarioNodo nodo) {
        int minimo = nodo.Dato;
        while (nodo.HijoIzq != null) {
            minimo = nodo.HijoIzq.Dato;
            nodo = nodo.HijoIzq;
        }
        return minimo;
    }


}
