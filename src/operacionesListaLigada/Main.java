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

    public static int pedirDato() throws IOException {
        System.out.println("¿Qué numero quieres buscar? ");
        int elemento = Integer.parseInt( bf.readLine() );
        return elemento;
    }
    
    public static void main(String[] args) throws IOException {

        ListaLigada ls = new ListaLigada();
        
        // Insertar al inicio de la lista
        ls.insertarAlInicio(93);
        ls.insertarAlInicio(23);
        ls.insertarAlInicio(45);
        
        // Obtener tamaño de la lista
        System.out.println(ls.getTamaño());
        
        // Recorrer y mostrar la lista
        ls.recorrer();
        
        // Eliminar al inicio
        System.out.println("Elemento eliminado: " + ls.eliminarAlInicio());
        
        // Volver a recorrer para verificar la eliminacion
        ls.recorrer();
        
        // Buscar un elemento
        System.out.println("Que elemento deseas eliminar?");
        int elem = Integer.parseInt(bf.readLine());
        
        if ( !ls.eliminarEspecifico(elem) ) {
            System.out.println("No existe");
        } else 
            System.out.println("Eliminado");
        
        ls.recorrer();
        
        // Insertar al final
        ls.insertarAlFinal(20);
        
        ls.recorrer();
    }
}
