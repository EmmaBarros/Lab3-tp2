package Models;
import Consola.Consola;
/**
 *
 * @author emami
 */
public class PagoTarjeta extends Pago {
    private int nroTarjeta;
    
    public PagoTarjeta(double monto) {
        super(monto);
    }

    public PagoTarjeta() {
    }
   @Override
   public void procesar(){
   }

    @Override
    public String toString() {
        return super.toString()+"Pago : Tarjeta";
    }

    @Override
    public void mostrarComprobante() {
    }
   
}
