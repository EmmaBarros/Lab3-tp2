
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
    public void cargarDatos(){
    super.cargarDatos();
    ingresarNivel();
    }
    
    private void ingresarNivel(){
        int nv;
        do{
            Consola.emitirMensajeLN("ingresar el nivel de la pocion");
            nv = Consola.leerInt();
            if(!validar100(nv)){
                Consola.emitirMensajeLN("igreso incorrecto , el nivel debve ser 0-100");
            }
        }while(!validar100(nv));
        setNivel(nv);
    }
      private boolean validar100(int d){
       return d <= 100 && d > 0;
   } 
    
    
    @Override
    public void usar() {
    Consola.emitirMensajeLN("se a tirado la pocion de nivel"+nivel);
    }

    @Override
    public void mostrarInfo() {
        Consola.emitirMensajeLN(toString());
        }

    @Override
    public String toString() {
        return super.toString()+ "tipo : Pocion | nivel = " + nivel;
    }

    public int getNivel() {
        return nivel;
    }

    private void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
}
