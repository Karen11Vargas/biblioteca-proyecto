package biblioteca;

import estructura.Arbol;
import estructura.ArbolPrestamo;
import estructura.ArbolUsuario;
import estructura.LibroNodo;
import estructura.PrestamoNodo;
import estructura.UsuarioNodo;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        ArbolUsuario arbolU = new ArbolUsuario();
        ArbolPrestamo arbolP = new ArbolPrestamo();

        short opcion = 0;

        do {
            try {
                opcion = Short.parseShort(JOptionPane.showInputDialog(null, 
                        "Escoja lo que desea hacer:\n"
                        + "1. Agregar libro\n"
                        + "2. Mostrar libros\n"
                        + "3. Agregar Usuario\n"
                        + "4. Mostrar usuarios\n"
                        + "5. Agregar Prestamos\n"
                        + "6. Mostrar préstamos\n"
                        + "8. Buscar Libro\n"      
                        + "9. Buscar Usuario\n"  
                        + "10. Eliminar Libro\n" 
                        + "11. Eliminar Usuario\n" 

                        + "7. Salir", 
                        "Biblioteca", JOptionPane.PLAIN_MESSAGE));
                
                switch (opcion) {
                    case 1:
                        int idLibro = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingrese el ID del libro", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE));
                        String titulo = JOptionPane.showInputDialog(null, 
                                "Ingrese el título del libro", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE);
                        String autor = JOptionPane.showInputDialog(null, 
                                "Ingrese el autor del libro", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE);
                        
                        arbol.InsertarDatos(idLibro,titulo, autor);
                        JOptionPane.showMessageDialog(null, "Agregado Exitosamente");

                        break;
                        
                    case 2:
                        if (!arbol.estaVacio()){
                            JOptionPane.showMessageDialog(null, "Los Libros se mostraran en consola a continuacion:\n", "Arbolo", JOptionPane.PLAIN_MESSAGE);
                            arbol.inOrder(arbol.Raiz);
                        }
                        else 
                            JOptionPane.showMessageDialog(null, "No hay libros", "Arbol", JOptionPane.INFORMATION_MESSAGE);
                        ; 
                        break;
                        
                    case 3:
                        int documento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingrese el documento del usuarios", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE));
                        String nombre = JOptionPane.showInputDialog(null, 
                                "Ingrese el nombre del usuario", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE);
                       
                        arbolU.InsertarDatos(documento,nombre);
                        JOptionPane.showMessageDialog(null, "Agregado exitosamente");

                        break;
                        
                    case 4:
                        if (!arbolU.estaVacio()){
                            JOptionPane.showMessageDialog(null, "Los Usuarios se mostraran en consola a continuacion:\n", "Arbolo", JOptionPane.PLAIN_MESSAGE);
                            arbolU.inOrder(arbolU.Raiz);
                        }
                        else 
                            JOptionPane.showMessageDialog(null, "No hay usuarios", "Arbol", JOptionPane.INFORMATION_MESSAGE);
                        ; 
                        break;
                    case 5:
                        int documentoPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingrese el documento del usuarios", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE));
                        String nombreLibro = JOptionPane.showInputDialog(null, 
                                "Ingrese el nombre del libro a prestar", 
                                "Agregando libro", JOptionPane.PLAIN_MESSAGE);
                       
                        arbolP.InsertarDatos(documentoPrestamo,nombreLibro);
                        JOptionPane.showMessageDialog(null, "Agregado exitosamente");

                        break;
                        
                    case 6:
                        if (!arbolP.estaVacio()){
                            JOptionPane.showMessageDialog(null, "Los Prestamos se mostraran en consola a continuacion:\n", "Arbolo", JOptionPane.PLAIN_MESSAGE);
                            arbolP.inOrder(arbolP.Raiz);
                        }
                        else 
                            JOptionPane.showMessageDialog(null, "No hay prestamos en el arbol", "Arbol", JOptionPane.INFORMATION_MESSAGE);
                        ; 
                        break;
                     case 8:
                            String nombreBuscar = JOptionPane.showInputDialog(null, 
                                "Ingrese el nombre del libro", 
                                "Buscando libro", JOptionPane.PLAIN_MESSAGE);
                       
                            LibroNodo libroEncontrado =  arbol.buscarLibroPorNombre(arbol.Raiz, nombreBuscar);

                            if (libroEncontrado != null) {
                                JOptionPane.showMessageDialog(null, "El libro se mostrara en consola a continuación:\n", "Árbol", JOptionPane.PLAIN_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se encontro el libro en el árbol", "Árbol", JOptionPane.INFORMATION_MESSAGE);
                            }
                         break;
                    case 9:
                        int docBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "Ingrese el documento del usuario", 
                            "Buscando Usuario", JOptionPane.PLAIN_MESSAGE));

                        UsuarioNodo usuarioEncontrado =  arbolU.buscarUsuarios(arbolU.Raiz, docBuscar);

                        if (usuarioEncontrado != null) {
                            JOptionPane.showMessageDialog(null, "El usuario se mostrarán en consola a continuación:\n", "Árbol", JOptionPane.PLAIN_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro el usuario en el árbol", "Usuario", JOptionPane.INFORMATION_MESSAGE);
                        }
                     break;
                    case 10:
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "Ingrese el id del libro", 
                            "Buscando Usuario", JOptionPane.PLAIN_MESSAGE));

                           arbol.eliminar(id);

                            JOptionPane.showMessageDialog(null, "Eliminado");
                      
                     break;
                     case 11:
                        int doc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "Ingrese el id del libro", 
                            "Buscando Usuario", JOptionPane.PLAIN_MESSAGE));

                           arbolU.eliminar(doc);

                            JOptionPane.showMessageDialog(null, "Eliminado");
                      
                     break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación. ¡Hasta luego!");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida", 
                                "Error", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar datos numéricos", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 7);
    }
}
