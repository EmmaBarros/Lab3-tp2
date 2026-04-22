
package Models;
import Consola.Consola;
/**
 *
 * @author emami
 */
public class Pocion extends Item {
    private int nivel;

    public Pocion() {
    }

    public Pocion(String nombre,int nivel) {
        super(nombre);
        this.nivel = nivel;
    }

    
    
    @Override
    public void usar() {
    Consola.emitirMensajeLN("se a tirado la pocion de nivel"+nivel);
    }

    @Override
    public void mostrarInfo() {
        toString();
    }

    @Override
    public String toString() {
        return "Pocion nivel = " + nivel;
    }
    
    
    
}
