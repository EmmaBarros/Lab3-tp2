
package Models;
import Consola.Consola;

/**
 *
 * @author emami
 */
public class PagoEfectivo extends Pago {

    
    public PagoEfectivo(double monto) {
        super(monto);
    }

    public PagoEfectivo() {
    }
    
    @Override
    public void procesar(){
        
    }

    @Override
    public String toString() {
        return super.toString() + " / pago Efectivo";
    }

    @Override
    public void mostrarComprobante() {
        
    }
    
    
}
