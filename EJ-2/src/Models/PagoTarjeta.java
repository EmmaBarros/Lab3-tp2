package Models;
import Consola.Consola;
/**
 *
 * @author emami
 */
public class PagoTarjeta extends Pago{

    public PagoTarjeta(double monto) {
        super(monto);
    }

    public PagoTarjeta() {
    }
   @Override
   public void procesar(){
    Consola.emitirMensajeLN("Pago de ; $"+monto+" Realizado con Exito");
   }

    @Override
    public String toString() {
        return super.toString()+"Pago : Tarjeta";
    }
   
}
