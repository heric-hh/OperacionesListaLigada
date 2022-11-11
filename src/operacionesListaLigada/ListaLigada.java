package operacionesListaLigada;

/**
 *
 * @author hheri
 */
public class ListaLigada {
    private Nodo inicio; // Referencia de tipo Nodo. Apunta al primer elemento
    private int tam; // Indica cuantos nodos contiene la lista.
    private Nodo fin;
    
    // Constructor de la clase
    
    /*
        Si una lista es creada sin elementos, entonces el inicio debe ser null
        porque no hay elementos en la lista, además de que el tamaño es cero.
    */
    public ListaLigada() {
        this.inicio = null;
        this.fin = null;
        tam = 0;
    }
    
    /* === METODOS DE LA CLASE === */
    
    // Regresar el tamaño de la lista
    
    public int getTamaño() { return this.tam; } 
    
  
    // Insertar un elemento al inicio de la lista
   
    public void insertarAlInicio( int elemento ) {
        /* 
        Al crear este objeto, hacemos uso del segundo constructor de la clase Nodo
        donde se recibe un dato y el enlace al nodo siguiente. En este caso se apunta hacia el inicio de la lista.
        */
        inicio = new Nodo( elemento, inicio );
        if ( tam == 0 ) {
            fin = inicio;
        }
        tam++;
    }
    
    /*
        Recorrer la lista
        Para recorrer la lista es necesario crear una referencia auxiliar para que pueda moverse entre los nodos.
    */
    public void recorrer() {
        Nodo aux = inicio; // aux es de tipo Nodo porque es una referencia y debe ser igual a inicio porque apunta al 1er elemento
        while ( aux != null ) { // Si existe un nodo, imprimelo
            System.out.println(aux.dato);
            aux = aux.sig; //Avanza al siguiente nodo
        }
    }
    
    // Verificar si la lista está vacia
    
    public boolean estaVacia() { return ( inicio == null ); }
    
    // Metodo para eliminar un nodo al inicio de la lista
    
    public int eliminarAlInicio() {
        if ( !estaVacia() ) {
            int dato = inicio.dato; // Almacenamos el dato del nodo para retornarlo
            inicio = inicio.sig; // Con esto estamos avanzando a inicio al nodo siguiente. Asi el nodo inicial queda sin referenciar
            tam--;
            if ( tam == 0 )
                fin = null;
            return dato;
        }
        return 0;
    }
    
    // Método para buscar un elemento en la lista.
    
    private Nodo[] buscarNodo( int elemento ) {
        Nodo paux = null; // paux sirve como auxiliar del nodo predecesor
        // Se necesita un auxiliar como referencia para ir avanzando entre los nodos y realizar la comparacion
        Nodo aux = inicio;
        while ( aux != null ) { // Recorre mientras la lista no este vacia o no haya llegado al final
            if ( aux.dato == elemento ) {
                Nodo[] datos = new Nodo[2];
                datos[0] = paux;
                datos[1] = aux;
                return datos;
            } else {
                paux = aux;
                aux = aux.sig;
            }
        }
        return null;
    }
    
    // Método para eliminar un dato especifico
    public boolean eliminarEspecifico ( int elemento ) {
        Nodo[] res = buscarNodo( elemento );
        if ( res == null )
            return false;
        else {
            if ( res[0] == null ) { //Verificamos si hay un predecesor de un nodo
                eliminarAlInicio();
            } else {
                res[0].sig = res[1].sig; // El predecesor apunta al siguiente nodo del que hay en medio.
                tam--;
            }
            return true;
        }
    }
    
    public void insertarAlFinal( int elemento )  {
        if ( estaVacia() ) {
            insertarAlInicio( elemento );
        } else {
            fin.sig = new Nodo( elemento );
        }
    
    }
    
    
    
    
    
    // La clase Nodo funciona como una clase interna de la clase ListaLigada
    
    private class Nodo {
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
}
