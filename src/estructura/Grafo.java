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
public class Grafo {
      private Nodo primerNodo;

    public Grafo() {
        primerNodo = null;
    }

     public void agregarUsuario(String id, String nombre) {
        NodoUsuario usuario = new NodoUsuario(id, nombre);
        if (primerNodo == null) {
            primerNodo = usuario;
        } else {
            Nodo temp = primerNodo;
            while (temp.getSiguienteNodo() != null) {
                temp = temp.getSiguienteNodo();
            }
            temp.setSiguienteNodo(usuario);
        }
    }

    public void agregarLibro(String id, String titulo) {
        NodoLibro libro = new NodoLibro(id, titulo);
        if (primerNodo == null) {
            primerNodo = libro;
        } else {
            Nodo temp = primerNodo;
            while (temp.getSiguienteNodo() != null) {
                temp = temp.getSiguienteNodo();
            }
            temp.setSiguienteNodo(libro);
        }
    }

    public void realizarPrestamo(String usuarioId, String libroId, String fechaPrestamo) {
        NodoUsuario usuarioNodo = (NodoUsuario) buscarNodo(usuarioId, NodoUsuario.class);
        NodoLibro libroNodo = (NodoLibro) buscarNodo(libroId, NodoLibro.class);

        if (usuarioNodo != null && libroNodo != null) {
            Arista nuevaArista = new Arista(libroNodo, fechaPrestamo);
            if (usuarioNodo.getPrimeraArista() == null) {
                usuarioNodo.setPrimeraArista(nuevaArista);
            } else {
                Arista temp = usuarioNodo.getPrimeraArista();
                while (temp.getSiguienteArista() != null) {
                    temp = temp.getSiguienteArista();
                }
                temp.setSiguienteArista(nuevaArista);
            }
        }
    }

    public Nodo buscarNodo(String id, Class<?> tipo) {
        Nodo temp = primerNodo;
        while (temp != null) {
            if (temp.getId().equals(id) && tipo.isInstance(temp)) {
                return temp;
            }
            temp = temp.getSiguienteNodo();
        }
        return null;
    }

    public NodoUsuario buscarUsuario(String id) {
        return (NodoUsuario) buscarNodo(id, NodoUsuario.class);
    }

    public NodoLibro buscarLibro(String id) {
        return (NodoLibro) buscarNodo(id, NodoLibro.class);
    }

    public void obtenerPrestamosUsuario(String usuarioId) {
        NodoUsuario usuarioNodo = buscarUsuario(usuarioId);
        if (usuarioNodo != null) {
            Arista arista = usuarioNodo.getPrimeraArista();
            System.out.println("Préstamos de " + usuarioNodo.getNombre() + ":");
            JOptionPane.showMessageDialog(null, "Préstamos de " + usuarioNodo.getNombre() + ":", "Prestamos", JOptionPane.PLAIN_MESSAGE);

            while (arista != null) {
                System.out.println("Libro: " + arista.getNodoDestino().getTitulo() + " en fecha " + arista.getFechaPrestamo());
                JOptionPane.showMessageDialog(null, "Libro: " + arista.getNodoDestino().getTitulo() + " en fecha " + arista.getFechaPrestamo(), "Prestamos", JOptionPane.PLAIN_MESSAGE);
                arista = arista.getSiguienteArista();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Prestamos", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Usuario no encontrado.");
        }
    }
}
