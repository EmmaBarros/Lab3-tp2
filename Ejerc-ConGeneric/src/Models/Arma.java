
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
   public void cargarDatos(){
       super.cargarDatos();
       
   }
   private void ingresarDaño(){
       int d;
       do{
           Consola.emitirMensajeLN("ingrese el daño del arma");
           d = Consola.leerInt();
           if(!validar100(d)){
               Consola.emitirMensajeLN("ingreso incorrecto , el daño debe ser menos de 100 y mayor a 0");
           }
       }while(!validar100(d));
       setDaño(d);
   }
   private boolean validar100(int d){
       return d <= 100 && d > 0;
   } 
    
    @Override
    public void usar(){
   Consola.emitirMensajeLN("se esta usando el arma quitando "+daño+"de daño de ataque por cada rafaga!");
    }

    @Override
    public void mostrarInfo() {
        Consola.emitirMensajeLN(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Arma daño = "+daño;
    }

    public int getDaño() {
        return daño;
    }

    private void setDaño(int daño) {
        this.daño = daño;
    }

   
    
    
}
