import javax.swing.*;

public class Pila {

    // crear un atributo para el ultimo valor ingresado
    private Nodo cabeza;

    // constructor
    public Pila(){

        //Se llama el objeto cabeza para asignarle valor de arranque que es null
        cabeza = null;
    }

    //Se agragan todos los métodos que se requieran
    public void agregarCancion(Cancion cancion){
        //Se crea un nuevo objeto de tipo Nodo
        Nodo nuevaCancion = new Nodo(cancion);
        nuevaCancion.setCancion(cancion);
        if (cabeza == null){
            //Se actualiza la información
             cabeza = nuevaCancion;
        }else {
            //Se utiliza el nodo recien creado para asignar que ahora es el ultimo valor ingresado
            nuevaCancion.siguiente = cabeza;
            cabeza = nuevaCancion;
        }
    }
    public Cancion eliminarCancion(){
        if (cabeza == null){
            return null;
        }else {
            //Se declara una variable del tipo que se requiera y dentro de ella se va a
            // indicar que va a guardar el ultimo valor agragado con su información
            Cancion auxiliar = cabeza.getCancion();
            //Se dice que dentro de ese mismo objeto cabeza se va a guardar el mismo
            // objeto cabeza pero con su campo siguiente
            cabeza = cabeza.getSiguiente();
            return auxiliar;
        }
    }
    public Cancion buscarCancionPorTitulo(String titulo){
        Nodo cancionActual = cabeza;
        while (cancionActual != null){
            if(cancionActual.getCancion().getTitulo().equalsIgnoreCase(titulo)){
                return cancionActual.getCancion();
            }
            cancionActual = cancionActual.getSiguiente();
        }return null;
    }
    public Cancion buscarCancionPorDuración(double duracion){
        Nodo cancionActual = cabeza;
        while (cancionActual != null){
            if(cancionActual.getCancion().getDuracion() == (duracion)){
                return cancionActual.getCancion();
            }
            cancionActual = cancionActual.getSiguiente();
        }return null;
    }
    public Cancion buscarCancionPorAutor(String autor){
        Nodo cancionActual = cabeza;
        while (cancionActual != null){
            if(cancionActual.getCancion().getAutor().equalsIgnoreCase(autor)){
                return cancionActual.getCancion();
            }
            cancionActual = cancionActual.getSiguiente();
        }return null;
    }
    public Cancion buscarCancionPorAlbum(String album){
        Nodo cancionActual = cabeza;
        while (cancionActual != null){
            if(cancionActual.getCancion().getAlbum().equalsIgnoreCase(album)){
                return cancionActual.getCancion();
            }
            cancionActual = cancionActual.getSiguiente();
        }return null;
    }
    //Se crea metodo obtener lista para recopilar todas las canciones que estan en la pila en una lista
    public String obtenerLista(){
        //Se inicializa una cadena vacía "contenido" que se usará para construir la representación de la pila e inicialmente está vacía.
        StringBuilder contenido = new StringBuilder();
        Nodo cancionActual = cabeza;
        if (cabeza == null){
            return "La pila está vacía.";
        }
            while (cancionActual != null){
                //Se añade el dato del nodo actual a la cadena "contenido", seguido de un espacio para
                // separar los datos de cada nodo.
                contenido.append(cancionActual.getCancion().toString()).append("\n");
                cancionActual = cancionActual.getSiguiente();
        }
            return contenido.toString();
    }

}
