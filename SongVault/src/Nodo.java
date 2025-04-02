public class Nodo {

    //Se crea la variable del tipo que se requiera la cual hace referencia a la información que los nodosvan a almacenar
    Cancion cancion;

    // Se rea la variable del tipo que se requiera que cree el apuntador al siguiente numero
    Nodo siguiente;

    //Constructor
    public Nodo (Cancion cancion){
        this.cancion = cancion;
        this.siguiente = null;
    }
    public Cancion getCancion(){
        return cancion;
    }
    public Cancion setCancion(Cancion cancion){
        return this.cancion = cancion;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public Nodo setSiguiente(){
        return this.siguiente = siguiente;
    }
}
