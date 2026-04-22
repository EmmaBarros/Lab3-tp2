
package Models;

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
