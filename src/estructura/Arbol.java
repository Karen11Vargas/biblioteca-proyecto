/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author karen_b
 */
public class Arbol {
     public  LibroNodo Raiz;
    public Arbol () { 
        Raiz = null;
    }
    public boolean estaVacio(){
        return Raiz == null;
    }

 
    
    public void InsertarDatos(int dato,String nom, String autor){
        LibroNodo nuevo = new LibroNodo(dato,nom, autor);
        if (estaVacio())
            Raiz = nuevo;
        else {
            LibroNodo aux = Raiz, Padre;
            while (true) {
                Padre = aux;
                if (dato < aux.Dato){
                    aux = aux.HijoIzq;
                    if (aux == null){
                        Padre.HijoIzq = nuevo;
                        return;
                    }
                } else {
                    aux = aux.HijoDer;
                    if (aux == null){
                        Padre.HijoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder (LibroNodo Nodo) {
        if (Nodo != null){
            inOrder(Nodo.HijoIzq);
            /*System.out.println(Nodo.Dato);*/
            System.out.println("Libro: " +Nodo.Dato +" Nombre: "+Nodo.Nombre + "Autor: " +Nodo.Autor );
            inOrder(Nodo.HijoDer);
        }
    }

    public LibroNodo buscarLibroPorNombre(LibroNodo nodo, String nombre) {
        if (nodo != null) {
            LibroNodo encontrado = buscarLibroPorNombre(nodo.HijoIzq, nombre);
            if (encontrado != null) {
                return encontrado;
            }
            if (nodo.Nombre.equals(nombre)) {
                 inOrder(nodo.HijoIzq);
                System.out.println("Libro: " + nodo.Dato + " Nombre: " + nodo.Nombre + "  Autor: " + nodo.Autor);
                return nodo;
            }
            return buscarLibroPorNombre(nodo.HijoDer, nombre);
        }
        return null; 
    }

    
    public void eliminar(int dato) {
        Raiz = eliminarRecursivo(Raiz, dato);
    }

    private LibroNodo eliminarRecursivo(LibroNodo nodo, int dato) {
        if (nodo == null) {
            return nodo;
        }

        if (dato < nodo.Dato) {
            nodo.HijoIzq = eliminarRecursivo(nodo.HijoIzq, dato);
        }
        else if (dato > nodo.Dato) {
            nodo.HijoDer = eliminarRecursivo(nodo.HijoDer, dato);
        }
        else {
            if (nodo.HijoIzq == null) {
                return nodo.HijoDer;
            } else if (nodo.HijoDer == null) {
                return nodo.HijoIzq;
            }

            nodo.Dato = encontrarMenorValor(nodo.HijoDer);

            nodo.HijoDer = eliminarRecursivo(nodo.HijoDer, nodo.Dato);
        }
        return nodo;
    }

    private int encontrarMenorValor(LibroNodo nodo) {
        int minimo = nodo.Dato;
        while (nodo.HijoIzq != null) {
            minimo = nodo.HijoIzq.Dato;
            nodo = nodo.HijoIzq;
        }
        return minimo;
    }

   

}
