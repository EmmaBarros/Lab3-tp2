package Models;

import Consola.Consola;
import ED.Lista;
import ED.Nodo;
/**
 *
 * @author emami
 */
public class Caja <T extends Item> {
    
  private Lista<T> inventario;
  private String nombreInventario;

    public Caja(String nombre) {
    this.nombreInventario = nombre;
    this.inventario = new Lista<>();
    }
       
    public void guardarObjeto(T obj){
        if (obj != null) {
            inventario.insertarPri(obj);
            Consola.emitirMensajeLN(obj.getNombre()+ "guardado en "+nombreInventario);
        }
    }
    public void obtenerObjeto(T obj){
        
    }
    
    public void mostrarCaja(){
        Consola.emitirMensajeLN(nombreInventario);
        if(inventario.listaVacia()){
            Consola.emitirMensajeLN("el inventario esta vacio!");
            return ;
        }
        Nodo<T> p = inventario.inicio();
        while(p!=null){
            p.getDato().mostrarInfo();
            p.getDato().usar();
            Consola.emitirMensajeLN("---------");
            p = p.getPs();
        }
        
    }

    public Lista<T> getInventario() {
        return inventario;
    }

    public void setInventario(Lista<T> inventario) {
        this.inventario = inventario;
    }

    public String getNombreInventario() {
        return nombreInventario;
    }

    public void setNombreInventario(String nombreInventario) {
        this.nombreInventario = nombreInventario;
    }
    
    
    
    
    
    
    
    
}
