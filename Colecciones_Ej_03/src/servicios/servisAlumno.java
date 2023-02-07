
package servicios;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class servisAlumno {
    
    Scanner sc= new Scanner(System.in);
    
    ArrayList<Alumnos> lista = new ArrayList();
    
    ArrayList<Integer> nota = new ArrayList();
    
    public void crearAlumno(){
        
        
        System.out.println("- Ingrese nombre del alumno");
        String nombre = sc.next();
        
        System.out.println("Ingrese la primer nota");
        nota.add(sc.nextInt());
        
        System.out.println("Ingrese la segunda nota");
        nota.add(sc.nextInt());
        
        System.out.println("Ingrese la tercer nota");
        nota.add(sc.nextInt());
        
        Alumnos AN = new Alumnos(nombre, nota);
        lista.add(AN);
        
        for (Alumnos aux : lista) {
            System.out.println(aux);
            
        }
    }
    
    public void nuevoAlumno(){
        
        System.out.println("¿Quiere agregar otro alumno? (si / no)");
        String elegir = sc.next();
        
        if(elegir.equals("si")){
            crearAlumno();
        }
        
    
    }
    
    public double notaFinal(ArrayList<Integer> nota){
        double notaFinal = 0;
        System.out.println("Promedio de notas del alumno");
        
        for (Integer aux : nota) {
            notaFinal += aux;
        }
        notaFinal/=3;
        return notaFinal;
    }

    

   
}
