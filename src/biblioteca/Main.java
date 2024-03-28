/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import estructura.BibliotecaGestion;
import estructura.Libro;
import java.util.Scanner;
//import interfaz.Menu;

/**
 *
 * @author Karen.Vargas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu menu = new Menu();
        //menu.setVisible(true);
        Scanner sc = new Scanner(System.in);
        BibliotecaGestion gestion = new BibliotecaGestion();
        boolean salir = false;
        boolean menu = false;
          
        while (!salir) {
            
             System.out.println("Bienvenido");
            System.out.println("Ingrese una opcion: 1. Libros, 2.Usuarios,3.Prestamo");
            int opcionP = sc.nextInt();

        
            if (opcionP == 1) {
                System.out.println("Ingrese una opcion: 1. Agregar Libro, 2.Ver Libros ,3.Eliminar Libro, 4.Buscar libro");
                int opcion = sc.nextInt();

                switch (opcion) {
                case 1:
                    System.out.println("/////--- Agregar Libro ---- /////");
                    System.out.println("Ingrese nombre libro");
                    String nombre = sc.next();

                    System.out.println("Ingrese nombre autor");
                    String autor = sc.next();

                    System.out.println("Ingrese fecha publicacion");
                    int publicacion = sc.nextInt();

                    if (!nombre.isEmpty() && !autor.isEmpty() ) {
                        gestion.agregarLibro(nombre, autor, publicacion);
                      
                    }else{
                        System.out.println("Ingrese los datos");
                    }

                    break;
                case 2:
                    System.out.println("/////--- Libros ---- /////");
                    gestion.buscarLibro();
                    break;
                case 3:
                  System.out.println("/////--- Eliminar Libro ---- /////");

                  System.out.println("Ingrese nombre libro a eliminar:");
                    String nombreLibroEliminar = sc.next();
                    gestion.eliminarLibro(nombreLibroEliminar);
                    break;

                case 4:
                   System.out.println("/////--- Buscar Libro ---- /////");

                  System.out.println("Ingrese nombre libro a buscar:");
                    String nombreLibro = sc.next();
                    gestion.buscarLibroNombre(nombreLibro);
                break;

                 default:
                   opcionP = 1;
                }
            }else if(opcionP == 2){
                 System.out.println("Ingrese una opcion: 1. Agregar Usuario, 2.Ver Usuarios ,3.Eliminar Usuario, 4.Buscar Usuario");
                int opcion = sc.nextInt();

                switch (opcion) {
                case 1:
                    System.out.println("///// ---- Agregar Usuario ----/////");
                    System.out.println("Ingrese documento");
                    int documento = sc.nextInt();

                    System.out.println("Ingrese nombre");
                    String nombre = sc.next();

                    
                    gestion.agregarUsuario(documento,nombre);
                    
                    break;
                case 2:
                    System.out.println("/////--- Usuarios ---- /////");

                    gestion.buscarAll();
                    break;
                case 3:
                    System.out.println("/////--- Eliminar Usuario---- /////");

                  System.out.println("Ingrese  documento a eliminar:");
                    int docEliminar = sc.nextInt();
                    gestion.eliminarUsuario(docEliminar);
                     
                    break;

                case 4:
                     System.out.println("/////--- Buscar Usuario---- /////");

                  System.out.println("Ingrese documento usuario a buscar:");
                    int documentoUser = sc.nextInt();
                    gestion.buscarUser(documentoUser);
                break;

                 default:
                   
                }
            }else if (opcionP == 3){
                System.out.println("Ingrese una opcion: 1. Hacer Prestamo, 2.Buscar Usuario,3.Devolcuion, 4.Buscar Libros Prestados");
                int opcion = sc.nextInt();

                switch (opcion) {
                case 1:
                     System.out.println("/////--- Realizar Prestamo---- /////");

                    System.out.println("Ingrese documento");
                    int documento = sc.nextInt();

                    System.out.println("Ingrese nombre libro");
                    String nombre = sc.next();

               
                    gestion.agregarPrestamo(documento,nombre);
                  
                    
                    break;
                case 2:
                    System.out.println("/////--- Buscar Prestamos de un Usuario ---- /////");

                    System.out.println("Ingrese documento");
                    int documentoPrestamo = sc.nextInt();
                    
                    gestion.prestamosUser(documentoPrestamo);
                     
                    break;
                case 3:
                    System.out.println("/////--- Devolucion ---- /////");

                    System.out.println("Ingrese documento");
                    int documentoE = sc.nextInt();

                    System.out.println("Ingrese nombre libro");
                    String nombreE = sc.next();

                    
                    gestion.devolucion(documentoE, nombreE);
                     
                    break;

                case 4:
                  System.out.println("/////--- Buscar Libro  Prestado---- /////");

                  System.out.println("Ingrese nombre del Libro");
                    String nombreB = sc.next();
                    gestion.prestamosLibro(nombreB);
                break;

                 default:
                   
                }
            }else{
                salir = true;
            }
            
            
           
        }
            sc.close();
        }
            
           
         
           
        
       
    
    
}
