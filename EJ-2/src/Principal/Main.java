
package Principal;
import Controllers.GestorPagos;
import Menu.Menu;
import Consola.Consola;
public class Main {

    public static void main(String[] args) {
    GestorPagos app = new GestorPagos();
    
    Menu menu = new Menu("Sistema de Pagos");
    
    menu.agregarItem("pagar con tarjeta");
    menu.agregarItem("pagar con efectivo");
    menu.agregarItem("ver historial de pagos...");
    
    int op;
    do{
        op = menu.ejecutar();
        switch(op){
            case 1:
                app.registrarPagoTarjeta();
                break;
            case 2:
                app.registrarPagoEfectivo();
                break;
            case 3:
                app.mostrarHistorial();
                break;
            case 0: Consola.emitirMensajeLN("saliendo..");
            break;
        } 
    }while(op!= 0);  
    }

} 

