
package entidad;

import java.util.HashMap;


public class Producto {
    
   public HashMap <String,Double> producto;

    public Producto() {
    }

    public Producto(HashMap<String, Double> producto) {
        this.producto = producto;
    }

    public HashMap<String, Double> getProducto() {
        return producto;
    }

    public void setProducto(HashMap<String, Double> producto) {
        this.producto = producto;
    }
   
   
    
}
