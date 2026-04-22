package Models;
import Menu.Menu;
import Consola.Consola;
import ED.ListaEncadenada;
import ED.Nodo;
/**
 *
 * @author emami
 */
public class Caja <T extends Item> {
    
    private T obj;

    public Caja() {
    }
       
    public void guardarObjeto(T obj){
            
       
    }
    public T obtenerObjeto(T obj){
        
    }
    public void mostrarCaja(){
        
    }
    
    
    
    public Caja(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    private void setObj(T obj) {
        this.obj = obj;
    }
    
    
    
    
    
}
