
package colecciones_ej_01;

import entidad.Razas;
import java.util.Scanner;
import servicio.servicioRazas;


public class Colecciones_Ej_01 {

    /*
     1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
    
    2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no
     */
    public static void main(String[] args) {
        
        servicioRazas sr = new servicioRazas();
        
        Scanner sc = new Scanner(System.in);
        String elegir;
        do{
           
           Razas perro = sr.crearPerro();
           sr.agregarPerro(perro);
                   
            System.out.println("¿Quiere agregar mas razas? (S/N)");
            elegir = sc.nextLine();
           
        }while(elegir.equals("s") );
        
        
        sr.mostrarPerro();
        
        do{
            System.out.println("¿Quiere eliminar una raza? (S/N) ");
            elegir = sc.nextLine();
            
            if(elegir.equals("s")){
            
                sr.eliminarRaza();
                sr.mostrarPerro();
            }else{
                sr.mostrarPerro();
            }
            
            
        }while(elegir.equals("s"));
        
    }
    
}
