package operacionesListaLigada;

/**
 *
 * @author hheri
 */
public class Main {
    public static void main(String[] args) {
        ListaLigada ls = new ListaLigada();
        
        // Insertar al inicio de la lista
        ls.insertarAlInicio(93);
        ls.insertarAlInicio(23);
        
        // Obtener tamaño de la lista
        System.out.println(ls.getTamaño());
        
        // Recorrer y mostrar la lista
        ls.recorrer();
    }
}
