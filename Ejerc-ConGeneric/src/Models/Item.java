
package Models;
import Consola.Consola;
/**
 *
 * @author emami
 */
public abstract class Item  {
    private String nombre;

    public Item() {

    }

    public Item(String nombre) {
        this.nombre = nombre;
    }
    public void cargarDatos(){
        ingresarNombre();
    }
    public void ingresarNombre(){
        String nom;
        do{
            Consola.emitirMensajeLN("ingrese el nombre del item");
            nom = Consola.leerString();
            if(!validarString(nom)){
                Consola.emitirMensajeLN("ingreso incorrecto , intente nuevamnete");
            }
        }while(!validarString(nom));
        setNombre(nom);
    }
    
   private boolean validarString(String n){
        return n != null && !n.trim().isEmpty() ;
   }
    public abstract void usar();
    public abstract void mostrarInfo();

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    @Override
    public String toString() {
        return "Item "+ nombre;
    }
        
    


    
}
