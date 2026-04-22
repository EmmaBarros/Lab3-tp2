
package Models;
import Consola.Consola;
/**
 *
 * @author emami
 */
public class Arma extends Item {
    private int daño;

    public Arma() {     
    }

    public Arma(int daño, String nombre) {
        super(nombre);
        this.daño = daño;
    }
    
    
    
    @Override
    public void usar(){
   Consola.emitirMensajeLN("se esta usando el arma quitando "+daño+"de daño de ataque por cada rafaga!");
    }

    @Override
    public void mostrarInfo() {
        toString();
    }

    @Override
    public String toString() {
        return super.toString() + "Arma daño = "+daño;
    }
    
}
