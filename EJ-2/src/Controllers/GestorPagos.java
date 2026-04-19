
package Controllers;
import Models.*;
import ED.ListaEncadenada;
import ED.Nodo;
import Consola.Consola;
        
/**
 *
 * @author emami
 */
public class GestorPagos {
    private ListaEncadenada<Pago> listaPagos;

    public GestorPagos() {
        this.listaPagos = new ListaEncadenada<>();
    }
    
    public void registrarPagoTarjeta(){
        Consola.emitirMensajeLN("Monto a pagar");
        double m = Consola.leerDouble();
        
        PagoEfectivo pe = new PagoEfectivo(m);
        pe.procesar();
        
        listaPagos.insertarPri(pe);
    }
    public void registrarPagoEfectivo(){
        Consola.emitirMensajeLN("Monto a pagar");
        double m = Consola.leerDouble();
        PagoEfectivo pe = new PagoEfectivo(m);
         pe.procesar();
         
         listaPagos.insertarPri(pe);
        
    }
    
    public void mostrarHistorial(){
        Consola.emitirMensajeLN("Historial de pagos");
        Nodo<Pago> p = listaPagos.inicio();
        
        if(p==null){
            Consola.emitirMensajeLN("no hay pago registrados");
            return;
        }
        while(p!=null){
            Consola.emitirMensajeLN(p.getDato().toString());
            p = p.getPs();
        }
    }
    
    
    
}
