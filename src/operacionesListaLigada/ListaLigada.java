package operacionesListaLigada;

/**
 *
 * @author hheri
 */
public class ListaLigada {
    private Nodo inicio; // Referencia de tipo Nodo. Apunta al primer elemento
    private int tam; // Indica cuantos nodos contiene la lista.
    
    // Constructor de la clase
    
    /*
        Si una lista es creada sin elementos, entonces el inicio debe ser null
        porque no hay elementos en la lista, además de que el tamaño es cero.
    */
    public ListaLigada() {
        this.inicio = null;
        tam = 0;
    }
    
    // Métodos de la clase
    
    // Regresar el tamaño de la lista
    public int getTamaño() { return this.tam; } 
    
    
    public void insertarAlInicio( int elemento ) {
        inicio = new Nodo( elemento, inicio ); // Al crear este objeto, se apunta al inicio de la lista  
        tam++;
    }
}
