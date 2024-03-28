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
        System.out.println("Libro \"" + libro.getTitulo() + "\" ingresado con Exito");
    }
    
    public void eliminarLibro(String nombreLibro) {
       
       for (Libro libro : libros) {
          
           if (libro.getTitulo().equals(nombreLibro)) {
               libros.remove(libro);
               System.out.println("Libro eliminado: " + libro.getTitulo());
               return; 
           }
       }
   
       System.out.println("El libro \"" + nombreLibro + "\" no fue encontrado en la lista.");
      
       
    }
     
    // Buscar un libro por título
    public Libro buscarLibroNombre(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                 System.out.println(libro);
                return libro;
            }
        }
       System.out.println("El libro \"" + titulo + "\" no fue encontrado en la lista.");
        return null; // Si no se encuentra el libro
    }
    
    // Lista todos
    public Libro buscarLibro() {
        for (Libro libro : libros) {
            System.out.println(libros);
            return libro;
        }
         System.out.println("No hay libros registrados");
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
        System.out.println("Usuario \"" + usuario.getNombre() + "\" ingresado con Exito");

    }
     
     
    public void eliminarUsuario(int documento) {
    
        for (Usuario usuario : usuarios) {
            
            if (usuario.getDocumento() == documento) {
                usuarios.remove(usuario);
               System.out.println("Usuario eliminado: " + usuario.getNombre());
                return;
            }
        }
        System.out.println("El usuario \"" + documento + "\" no fue encontrado en la lista.");
    }
    
    
 
    public Usuario buscarUser(int documento) {
        for (Usuario usuario : usuarios) {
            if (usuario.getDocumento() == documento) {
                System.out.println(usuario);
                return usuario;
            }
        }
       System.out.println("El usuario \"" + documento + "\" no fue encontrado en la lista.");
        return null; 
    }
    
    // Lista todos
    public Usuario buscarAll() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuarios);
            return usuario;
        }
         System.out.println("No hay usuarios registrados");
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
         System.out.println("El usuario con documento \"" + documento + "\" no está registrado.");
         return; 
     }

     for (Libro libro : libros) {
         if (libro.getTitulo().equals(nombreLibro)) {
             libroExiste = true;
             break;
         }
     }

     if (!libroExiste) {
         System.out.println("El libro \"" + nombreLibro + "\" no está registrado.");
         return; 
     }

     // Verificar si el préstamo ya está registrado
     for (Prestamo prestamo : prestamos) {
         if (prestamo.getDocumentoUser() == documento && prestamo.getNombreLibro().equals(nombreLibro)) {
             System.out.println("El préstamo para el usuario con documento \"" + documento + "\" y el libro \"" + nombreLibro + "\" ya está registrado.");
             return;
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
           System.out.println("El usuario con documento \"" + documento + "\" tiene los siguientes préstamos: ");
           for (String nombreLibro : prestamosUsuario) {
               System.out.println(nombreLibro + ", ");
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
           System.out.println("El libro \"" + nombre + "\" tiene prestamo con los siguientes documentos: ");
           for (Integer documento : prestamosLibro) {
               System.out.println(documento + " ");
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
