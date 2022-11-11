package operacionesListaLigada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hheri
 */
public class Main {
    public static BufferedReader bf = new BufferedReader ( new InputStreamReader(System.in) );
    public static ListaLigada ls = new ListaLigada();

    public static char getRespuesta() throws IOException {
        String entrada;
        char res;
        
        System.out.println("(s / n)");
        entrada = bf.readLine();
        res = entrada.charAt(0);
        return res;
    }
    
    public static void mostrarOperaciones() {
        System.out.println("========= OPERACIONES CON LISTAS LIGADAS =========");
        System.out.println("Estas son las operaciones que puedes realizar: ");
            System.out.println("\t1. Insertar un nodo al inicio de la lista.");
            System.out.println("\t2. Insertar un nodo al final de la lista.");
            System.out.println("\t3. Recorrer la lista.");
            System.out.println("\t4. Obtener el tamaño de la lista.");
            System.out.println("\t5. Buscar un elemento en la lista.");
            System.out.println("\t6. Eliminar un elemento específico.");
            System.out.println("\t7. Verificar si la lista está vacia.");
    }
    
    public static void getOperacion() throws IOException {
        int elem;
        int op = Integer.parseInt(bf.readLine());
        
        switch ( op ) {
            case 1: System.out.println("Teclea un numero para poder insertarlo: ");
                    elem = Integer.parseInt(bf.readLine());
                    ls.insertarAlInicio( elem );
                    System.out.println("Lista: ");
                    ls.recorrer();
                    break;
            case 2: System.out.println("Teclea un número para poder insertarlo: ");
                    elem = Integer.parseInt( bf.readLine() );
                    ls.insertarAlFinal( elem );
                    System.out.println("Lista: ");
                    ls.recorrer();
                    break;
            case 3: System.out.println("Esta es la lista al momento: ");
                    System.out.println("Lista: ");
                    ls.recorrer();
                    break;
            case 4: System.out.println("Este es el tamaño de la lista: " + ls.getTamaño() + " nodos ");
                    break;
            case 5: System.out.println("Teclea un numero para buscarlo: ");
                    elem = Integer.parseInt( bf.readLine() );
                    
                    if ( ls.buscarElemento( elem ) ) {
                        System.out.println("El elemento existe.");
                    } else {
                        System.out.println("El elemento NO existe.");
                    }
                    break;
            
            case 6: System.out.println("Teclea un numero para eliminar: ");
                    elem = Integer.parseInt( bf.readLine() );
                    ls.eliminarEspecifico( elem );
                    System.out.println("Elemento eliminado");
                    System.out.println("Lista: ");
                    ls.recorrer();
                    break;
            case 7: if ( ls.estaVacia() )
                        System.out.println("La lista está vacía");
                    else
                        System.out.println("La lista no está vacía");
                    break;
            default: System.out.println("Entrada erronea. Intenta otra vez.");
        }
    }
    
    public static void main(String[] args) throws IOException {
        char res;
        
        do {
            mostrarOperaciones();
            System.out.println("Teclea una opción: ");
            getOperacion();
            System.out.println("¿Quieres realizar más operaciones? ");
            res = (char) getRespuesta();
        } while ( res == 'S' || res == 's');
    }
}
