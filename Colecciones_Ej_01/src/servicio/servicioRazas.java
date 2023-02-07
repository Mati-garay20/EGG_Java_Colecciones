
package servicio;

import entidad.Razas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class servicioRazas {
    
    Scanner sc = new Scanner(System.in);
    
     ArrayList<Razas> lista = new ArrayList();   
    
    public Razas crearPerro(){
        
        System.out.println("Ingrese la raza del perro");
        String perro = sc.nextLine();
        
        
        return new Razas(perro);
    }
    
    public void agregarPerro( Razas perro){
        
        lista.add(perro);
        
    }
    
    public void mostrarPerro(){
        
        lista.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    public void eliminarRaza(){
        
        System.out.println("¿Cuál raza va a eliminar?");
        String sacar = sc.nextLine();
        
        Iterator iterator = lista.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            
            if(sacar.equals(next)){
                iterator.remove();
            } 
                
            
            
        }
    }
    
}
