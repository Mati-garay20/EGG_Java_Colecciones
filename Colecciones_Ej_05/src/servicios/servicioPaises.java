
package servicios;

import entidades.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class servicioPaises {
    
    TreeSet <String> lista = new TreeSet();
    
    Scanner leer = new Scanner(System.in);
    
    public void ingresarPais(){
        int opcion;
        String nombre;
        do{
        
        System.out.println("Ingrese un país");
        nombre = leer.next();
        
        Paises P1 = new Paises(nombre);
        lista.add(nombre);
        
            System.out.println("¿Quiere ingresar otro país? (1- No / 2-Si)");
            opcion = leer.nextInt();
        
        }while(opcion == 2);
    }
    
    public void mostrarLista(){
        
        System.out.println("-- Lista de Países --");
        
        lista.forEach((aux) -> {
            System.out.println(aux);
        });
        
    }
    
    public void eliminarPais(){
        
        System.out.println("Elija el País que quiere eliminar");
        String sacar = leer.next();
        
        Iterator <String> borrar = lista.iterator();
        
        while(borrar.hasNext()){
            if(borrar.next().equalsIgnoreCase(sacar)){
                borrar.remove();
            }else{
                System.out.println("¡No se encontro el país!");
            }
        }
        
        
    }
    
}
