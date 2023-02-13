
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    */

public class servicioProducto {
    
    Scanner sc = new Scanner(System.in);
    
    HashMap P1 = new HashMap();
    
    public Double crearProducto() {
        
        HashMap<String,Double> P1 = new HashMap();
        
        int opcion;
        do{
        
        System.out.println("Ingrese un producto");
        String producto = sc.nextLine();
        
        System.out.println("Ingrese el precio");
        Double precio = sc.nextDouble();
        
            System.out.println("¿Quiere agregar otro producto? (1-Si / 2-NO) ");
            opcion = sc.nextInt();
            
        }while(opcion == 1);
    
        return P1.put(producto, precio);
}
    
}
