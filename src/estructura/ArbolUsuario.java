/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

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
        if (estaVacio())
            Raiz = nuevo;
        else {
            UsuarioNodo aux = Raiz, Padre;
            while (true) {
                Padre = aux;
                if (documento < aux.Dato){
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

    private int encontrarMenorValor(UsuarioNodo nodo) {
        int minimo = nodo.Dato;
        while (nodo.HijoIzq != null) {
            minimo = nodo.HijoIzq.Dato;
            nodo = nodo.HijoIzq;
        }
        return minimo;
    }


}
