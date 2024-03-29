/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen.Vargas
 */
public class BibliotecaGestion {


    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

  
    public BibliotecaGestion() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }
    
    /**
        *Libros
        *Metodos: Agregar, listar, buscar, 
     * @param nombre
     * @param autor
     * @param ano
    */
    
    public void agregarLibro(String nombre, String autor, int ano) {
        Libro libro = new Libro(nombre, autor, ano);
        libros.add(libro);
        JOptionPane.showMessageDialog(null, "Libro \"" + libro.getTitulo() + "\" ingresado con Exito"); 
    }
    
    public void eliminarLibro(String nombreLibro) {
       
       for (Libro libro : libros) {
           if (libro.getTitulo().equals(nombreLibro)) {
               libros.remove(libro);
                 JOptionPane.showMessageDialog(null, "Libro eliminado: \"" + libro.getTitulo() + "\" exitosamente"); 
               return; 
           }
       }
       JOptionPane.showMessageDialog(null, "El libro \"" + nombreLibro + "\" no fue encontrado en la lista.");       
       
    }
     
    // Buscar un libro por título
    public Libro buscarLibroNombre(String titulo) {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Libro:\n");
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                mensaje.append("- ").append(libro).append("\n");
                 JOptionPane.showMessageDialog(null, mensaje.toString());
                return libro;
            }
        }
        JOptionPane.showMessageDialog(null, "El libro \"" + titulo + "\" no fue encontrado en la lista"); 
        return null; 
    }
    
    // Lista todos
    public Libro buscarLibro() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Libros:\n");
        
        if (libros.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay libros registrados");
        return null;
        }
           

        for (Libro libro : libros) {
            mensaje.append("- ").append(libro).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
        return null;
    }
    
     /**
        *Usuario
        *Metodos: Agregar,buscar
     * @param documento
     * @param nombre
    */
    
     public void agregarUsuario(int documento, String nombre) {
        Usuario usuario = new Usuario(documento, nombre);
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario \"" + usuario.getNombre() + "\" ingresado con Exito"); 

    }
     
     
    public void eliminarUsuario(int documento) {
    
        for (Usuario usuario : usuarios) {
            if (usuario.getDocumento() == documento) {
                usuarios.remove(usuario);
                JOptionPane.showMessageDialog(null, "Usuario eliminado: " + usuario.getNombre() + "\" exitosamnte"); 
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El usuario \"" + documento + "\" no fue encontrado en la lista."); 
    }
    
    
 
    public Usuario buscarUser(int documento) {
        
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Documento:\n");
        for (Usuario usuario : usuarios) {
            if (usuario.getDocumento() == documento) {
                mensaje.append("- ").append(usuario).append("\n");
                JOptionPane.showMessageDialog(null, mensaje.toString());
                return usuario;
            }
        }
        JOptionPane.showMessageDialog(null, "El usuario \"" + documento + "\" no fue encontrado.");
        return null; 
    }
    
    // Lista todos
    public Usuario buscarAll() {
        
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Usuarios:\n");
        
        if (usuarios.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        return null;
        }
           

        for (Usuario usuario : usuarios) {
            mensaje.append("- ").append(usuario).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
        return null;
    }
     /**
        *Prestamo
        *Metodos: Agregar, ver prestamo, eliminar prestamo(devolucion) 
     * @param documento
     * @param nombreLibro
    */
    public void agregarPrestamo(int documento, String nombreLibro) {
    
     boolean usuarioExiste = false;
     boolean libroExiste = false;
     
     for (Usuario usuario : usuarios) {
         if (usuario.getDocumento() == documento) {
             usuarioExiste = true;
             break;
         }
     }

     if (!usuarioExiste) {
         JOptionPane.showMessageDialog(null, "El usuario con documento \"" + documento + "\" no está registrado.");
         return; 
     }

     for (Libro libro : libros) {
         if (libro.getTitulo().equals(nombreLibro)) {
             libroExiste = true;
             break;
         }
     }

     if (!libroExiste) {
         JOptionPane.showMessageDialog(null, "El libro \"" + nombreLibro + "\" no está registrado.");
         return; 
     }

     // Verificar si el préstamo ya está registrado
     for (Prestamo prestamo : prestamos) {
         if (prestamo.getDocumentoUser() == documento && prestamo.getNombreLibro().equals(nombreLibro)) {
             
            JOptionPane.showMessageDialog(null, "El préstamo para el usuario con documento \"" + documento + "\" y el libro \"" + nombreLibro + "\" ya está registrado.");
             return;
         }
     }

     // Si el préstamo no está registrado, agregarlo
     Prestamo nuevoPrestamo = new Prestamo(documento, nombreLibro);
     prestamos.add(nuevoPrestamo);
     JOptionPane.showMessageDialog(null, "Préstamo registrado exitosamente para el usuario con documento \"" + documento + "\" y el libro \"" + nombreLibro + "\".");
    }
      
    // Buscar un libro por título
    public List<String> prestamosUser(int documento) {
       List<String> prestamosUsuario = new ArrayList<>();
       for (Prestamo prestamo : prestamos) {
           if (prestamo.getDocumentoUser() == documento) {
               prestamosUsuario.add(prestamo.getNombreLibro());
           }
       }
       if (!prestamosUsuario.isEmpty()) {
           JOptionPane.showMessageDialog(null, "El usuario con documento \"" + documento + "\" tiene los siguientes préstamos:");
           for (String nombreLibro : prestamosUsuario) {
               JOptionPane.showMessageDialog(null, nombreLibro + ", ");
           }
           System.out.println();
       } else {
           JOptionPane.showMessageDialog(null, "El usuario con documento \"" + documento + "\" no tiene préstamos.");
       }
       return prestamosUsuario;
   }

    
    // Buscar un libro por título
    public List<Integer> prestamosLibro(String nombre) {
       List<Integer> prestamosLibro = new ArrayList<>();
       for (Prestamo prestamo : prestamos) {
           if (prestamo.getNombreLibro().equals(nombre)) {
               prestamosLibro.add(prestamo.getDocumentoUser());
           }
       }
       if (!prestamosLibro.isEmpty()) {
           JOptionPane.showMessageDialog(null, "El libro \"" + nombre + "\" tiene prestamo con los siguientes documentos: ");
           for (Integer documento : prestamosLibro) {
               JOptionPane.showMessageDialog(null, documento + ", ");
           }
           System.out.println();
       } else {
           JOptionPane.showMessageDialog(null, "El libro \"" + nombre + "\" no tiene préstamos.");
       }
       return prestamosLibro;
   }
    
    public void devolucion(int documento, String nombreLibro) {
        Iterator<Prestamo> iterator = prestamos.iterator();
        while (iterator.hasNext()) {
            Prestamo prestamo = iterator.next();
            if (prestamo.getDocumentoUser() == documento && prestamo.getNombreLibro().equals(nombreLibro)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "Libro \"" + prestamo.getNombreLibro() + "\" devuelto");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El usuario con documento \"" + documento + "\" no tiene el libro \"" + nombreLibro + "\" por devolver.");

    }
    
}
