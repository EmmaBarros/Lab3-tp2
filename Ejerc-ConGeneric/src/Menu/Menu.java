package Menu;

import ED.Lista; // Importamos tu lista genérica
import ED.Nodo;
import Consola.Consola;

public class Menu {
    private String titulo;
    private Lista<String> items; // Cambiamos el arreglo por tu lista
    private int contador; // Para saber cuántas opciones hay

    public Menu(String titulo) {
        this.titulo = titulo;
        this.items = new Lista<>(); // Inicializamos tu lista
        this.contador = 0;
    }

    /**
     * Agrega una opción al menú usando tu lista dinámica.
     */
    public void agregarItem(String item) {
        // Como tu lista suele insertar al principio (insertarPri),
        // pero queremos que el menú se vea en orden, 
        // podrías tener un método insertarFin o simplemente recorrerla.
        items.insertarPri(item); 
        contador++;
    }

    /**
     * Muestra el menú y captura la opción.
     */
    public int ejecutar() {
        Consola.emitirMensajeLN("\n=== " + titulo + " ===");
        
        // Para mostrar las opciones en el orden correcto (1, 2, 3...)
        // vamos a recorrer tu lista. 
        // NOTA: Si usaste insertarPri, el último agregado sale primero.
        Nodo<String> p = items.inicio();
        int i = contador; 
        
        while (p != null) {
            Consola.emitirMensajeLN(i + ". " + p.getDato());
            p = p.getPs();
            i--;
        }
        
        Consola.emitirMensajeLN("0. Salir");
        Consola.emitirMensaje("Seleccione una opción: ");
        
        return Consola.leerInt();
    }
}