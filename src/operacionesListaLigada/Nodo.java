package operacionesListaLigada;

/**
 *
 * @author hheri
 */
public class Nodo {
    int dato;
    Nodo sig;

    // Constructor de la clase

    
    public Nodo( int dato ) {
        this.dato = dato;
        this.sig = null;
    }
    
    // Para este constructor, se necesita recibir un dato y el nodo siguiente
    public Nodo ( int dato, Nodo sig ) {
        this.dato = dato;
        this.sig = sig;
    }
    
    
    
    
}
