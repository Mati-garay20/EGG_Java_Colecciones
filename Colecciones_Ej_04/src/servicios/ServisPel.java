/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entiddes.Pelicula;
import java.util.Scanner;

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class ServisPel {
    
    Scanner leer = new Scanner(System.in);
    Pelicula Pel = new Pelicula();
    
    public void crearPelicula(){
        
        String titulo, director;
        int duracion;
        
        do{
            
        
            System.out.println("-- Bienvenido --");
            System.out.println("Ingrese el título de la película");
            titulo = leer.nextLine();

            System.out.println("Ingrese el director");
            director = leer.nextLine();

            System.out.println("Ingrese la duración de la pelicula");
            duracion = leer.nextInt();
        
        }while();
        
    }
    
    
    
}
