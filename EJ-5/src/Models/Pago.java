
package Models;
import Consola.Consola;
/**
 *
 * @author emami
 */
public class Pago implements Comparable<Pago>{
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }
    
    public Pago() {
    }
    
    public void procesar(){
        Consola.emitirMensajeLN("procesando el pago de : $"+monto);
    }

    @Override
    public String toString() {
        return "Monto : "+monto;
    }

    public double getMonto() {
        return monto;
    }

    private void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public int compareTo(Pago o) {
        if(this.monto == o.getMonto()){
        return 0;    
        }else
            if(this.monto > o.monto){
            return 1;
        }else{
                return -1;
            }
        
    
   
}
}
