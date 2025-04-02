import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se crea una nueva instancia de la clase pila y se le asigna una variable llamada "pila"
        Pila pila = new Pila();
        int opcion = 0;
        //Se crea un bucle do-while para que permite ejecutar un bloque de código al menos
        // una vez y luego repetirlo mientras se cumpla una condición.
        do {
            //Se crea un estructura try-catch se utiliza para manejar excepciones, permitiendo
            // capturar y gestionar errores que pueden ocurrir durante la ejecución del código.
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Seleccione una opción del menú: \n "
                                + "1. Agragar una cancion. \n"
                                + "2. Eliminar una canción. \n"
                                + "3. Buscar una canción por el título. \n"
                                + "4. Buscar una canción por la duración. \n"
                                + "5. Buscar una canción por su autor. \n"
                                + "6. Buscar una canción por el album al que pertenece. \n"
                                + "7. Mostrar todas las canciones \n"
                                + "8. Salir del menú."));
                //Indicar como tiene que reaccionar segun lo que el usuario elija, en este caso la OPCION que elija
                switch (opcion){
                    case 1:
                        String titulo = JOptionPane.showInputDialog("Ingrese el nombre de la canción: ");
                        double duracion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duración de la canción: "));
                        String autor = JOptionPane.showInputDialog("Ingrese el nombre del autor de la canción: ");
                        String album = JOptionPane.showInputDialog(null, "Ingrese el nombre del Album al que pertenece la canción: ");
                        Cancion cancion = new Cancion(titulo, duracion, autor, album);
                        pila.agregarCancion(cancion);
                        JOptionPane.showMessageDialog(null, "La canción fue agragada exitosamente. ");
                        break;

                    case 2:
                        Cancion eliminada = pila.eliminarCancion();
                        if (eliminada != null){
                            JOptionPane.showMessageDialog(null, "La canción " + eliminada + " se ha eliminado  correctamente.");
                        } else { JOptionPane.showMessageDialog(null, "No se encontró la canción en la lista de canciones.");}
                        break;

                    case 3:
                        String tituloBuscar = JOptionPane.showInputDialog( "Ingrese el título de la canción que desea buscar: ");
                        Cancion cancionT = pila.buscarCancionPorTitulo(tituloBuscar);
                        if (cancionT != null){
                            JOptionPane.showMessageDialog(null, "La canción que busca es: " + cancionT);
                        }else {JOptionPane.showMessageDialog(null, "La canción que busca no fue encontrada. ");}
                        break;

                    case 4:
                        double duracionBuscar = Double.parseDouble(JOptionPane.showInputDialog( "Ingrese la duración de la canción que desea buscar: "));
                        Cancion cancionD = pila.buscarCancionPorDuración(duracionBuscar);
                        if (cancionD != null){
                            JOptionPane.showMessageDialog(null, "La canción que busca es: " + cancionD);
                        }else {JOptionPane.showMessageDialog(null, "La canción que busca no fue encontrada. ");}
                        break;

                    case 5:
                        String autorBuscar = JOptionPane.showInputDialog( "Ingrese el nombre del autor de la canción que desea buscar: ");
                        Cancion cancionA = pila.buscarCancionPorAutor(autorBuscar);
                        if (cancionA != null){
                            JOptionPane.showMessageDialog(null, "La canción que busca es: " + cancionA);
                        }else {JOptionPane.showMessageDialog(null, "La canción que busca no fue encontrada. ");}
                        break;

                    case 6:
                        String albumBuscar = JOptionPane.showInputDialog( "Ingrese el nombre el album al que pertenece la canción que desea buscar: ");
                        Cancion cancionAl = pila.buscarCancionPorAlbum(albumBuscar);
                        if (cancionAl != null){
                            JOptionPane.showMessageDialog(null, "La canción que busca es: " + cancionAl);
                        }else {JOptionPane.showMessageDialog(null, "La canción que busca no fue encontrada. ");}
                        break;

                    case 7:
                        String Lista = pila.obtenerLista();
                        if (Lista != null){
                            JOptionPane.showMessageDialog(null, "Las canciones que tienes guardadas son: \n" + Lista);
                        } else {JOptionPane.showMessageDialog(null, "No hay canciones guardadas aún.");}

                            break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "La opción seleccionada es inválida. Inténtelo nuevamente. ");
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada no válida. Ingrese un número: ");

            }
        }
        //Crear un bucle que se ejecute sin fin para hacer el menu
        while (opcion != 8);
    }
}