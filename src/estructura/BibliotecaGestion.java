/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    */
    
    public void agregarLibro(String nombre, String autor, int ano) {
        Libro libro = new Libro(nombre, autor, ano);
        libros.add(libro);
    }
    
    public void eliminarLibro(String nombreLibro) {
       
        // Iterar sobre la lista de libros
       for (Libro libro : libros) {
           // Si el nombre del libro coincide, eliminarlo de la lista
           if (libro.getTitulo().equals(nombreLibro)) {
               libros.remove(libro);
               System.out.println("Libro eliminado: " + libro.getTitulo());
               return; // Importante salir del método después de eliminar el libro
           }
       }
       // Si no se encuentra el libro con el nombre proporcionado
       System.out.println("El libro \"" + nombreLibro + "\" no fue encontrado en la lista.");
      
       
    }
     
    // Buscar un libro por título
    public Libro buscarLibroNombre(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                 System.out.print(libro);
                return libro;
            }
        }
       System.out.println("El libro \"" + titulo + "\" no fue encontrado en la lista.");
        return null; // Si no se encuentra el libro
    }
    
    // Lista todos
    public Libro buscarLibro() {
        for (Libro libro : libros) {
            System.out.print(libros);
            return libro;
        }
         System.out.println("No hay libros");
        return null; // Si no se encuentra el libro
    }
    
     /**
        *Usuario
        *Metodos: Agregar,buscar
    */
    
     public void agregarUsuario(int documento, String nombre) {
        Usuario usuario = new Usuario(documento, nombre);
        usuarios.add(usuario);
    }
     
     
    public void eliminarUsuario(int documento) {
    
        for (Usuario usuario : usuarios) {
            
            if (usuario.getDocumento() == documento) {
                usuarios.remove(usuario);
                System.out.println("Usuario eliminado: " + usuario);
                return;
            }
        }
        // Si no se encuentra el usuario con el nombre proporcionado
        System.out.println("El usuario \"" + documento + "\" no fue encontrado en la lista.");
    }
    
    
    // Buscar un libro por título
    public Usuario buscarUser(int documento) {
        for (Usuario usuario : usuarios) {
            if (usuario.getDocumento() == documento) {
                System.out.print(usuario);
                return usuario;
            }
        }
       System.out.println("El usuario \"" + documento + "\" no fue encontrado en la lista.");
        return null; 
    }
    
    // Lista todos
    public Usuario buscarAll() {
        for (Usuario usuario : usuarios) {
            System.out.print(usuarios);
            return usuario;
        }
         System.out.println("No hay usuarios");
        return null;
    }
     /**
        *Prestamo
        *Metodos: Agregar, ver prestamo, eliminar prestamo(devolucion) 
     * @param documento
     * @param nombreLibro
    */
    public void agregarPrestamo(int documento, String nombreLibro) {
     // Verificar si el usuario existe
     boolean usuarioExiste = false;
     for (Usuario usuario : usuarios) {
         if (usuario.getDocumento() == documento) {
             usuarioExiste = true;
             break;
         }
     }

     if (!usuarioExiste) {
         System.out.println("El usuario con documento \"" + documento + "\" no está registrado.");
         return; // Salir del método si el usuario no está registrado
     }

     // Verificar si el libro existe
     boolean libroExiste = false;
     for (Libro libro : libros) {
         if (libro.getTitulo().equals(nombreLibro)) {
             libroExiste = true;
             break;
         }
     }

     if (!libroExiste) {
         System.out.println("El libro \"" + nombreLibro + "\" no está registrado.");
         return; // Salir del método si el libro no está registrado
     }

     // Verificar si el préstamo ya está registrado
     for (Prestamo prestamo : prestamos) {
         if (prestamo.getDocumentoUser() == documento && prestamo.getNombreLibro().equals(nombreLibro)) {
             System.out.println("El préstamo para el usuario con documento \"" + documento + "\" y el libro \"" + nombreLibro + "\" ya está registrado.");
             return; // Salir del método si el préstamo ya está registrado
         }
     }

     // Si el préstamo no está registrado, agregarlo
     Prestamo nuevoPrestamo = new Prestamo(documento, nombreLibro);
     prestamos.add(nuevoPrestamo);
     System.out.println("Préstamo registrado exitosamente para el usuario con documento \"" + documento + "\" y el libro \"" + nombreLibro + "\".");
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
           System.out.print("El usuario con documento \"" + documento + "\" tiene los siguientes préstamos: ");
           for (String nombreLibro : prestamosUsuario) {
               System.out.print(nombreLibro + ", ");
           }
           System.out.println();
       } else {
           System.out.println("El usuario con documento \"" + documento + "\" no tiene préstamos.");
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
           System.out.print("El libro \"" + nombre + "\" tiene los siguientes préstamos: ");
           for (Integer documento : prestamosLibro) {
               System.out.print(documento + " ");
           }
           System.out.println();
       } else {
           System.out.println("El libro \"" + nombre + "\" no tiene préstamos.");
       }
       return prestamosLibro;
   }
    
     public void devolucion(int documento, String nombreLibro) {
        Iterator<Prestamo> iterator = prestamos.iterator();
        while (iterator.hasNext()) {
            Prestamo prestamo = iterator.next();
            if (prestamo.getDocumentoUser() == documento && prestamo.getNombreLibro().equals(nombreLibro)) {
                iterator.remove();
                System.out.println("Libro \"" + prestamo.getNombreLibro() + "\" devuelto");
                return;
            }
        }
        System.out.println("El usuario con documento \"" + documento + "\" no tiene el libro \"" + nombreLibro + "\" por devolver.");
    }
    
}
