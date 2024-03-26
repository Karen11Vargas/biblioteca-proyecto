/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author Karen.Vargas
 */
public class Prestamo {
    
    private int documentoUser;
    private String nombreLibro;

    public Prestamo(int documentoUser, String nombreLibro) {
        this.documentoUser = documentoUser;
        this.nombreLibro = nombreLibro;
    }

    public int getDocumentoUser() {
        return documentoUser;
    }

    public void setDocumentoUser(int documentoUser) {
        this.documentoUser = documentoUser;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
  
    
    
}
