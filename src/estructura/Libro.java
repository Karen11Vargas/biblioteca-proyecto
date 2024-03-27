/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author Karen.Vargas
 */
public class Libro {
    private String titulo;
    private String autor;
    private int publicacion;
    

    public Libro(String titulo, String autor, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    

    public String getAutor() {
        return autor;
    }

    

    public int getPublicacion() {
        return publicacion;
    }

     @Override
    public String toString() {
        return "Libro: " + titulo + " - Autor: " + autor + " - Publicación: " + publicacion;
    }
   
   
}
