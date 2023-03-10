
package colecciones_ej_03;

import entidades.Alumnos;
import java.util.ArrayList;
import servicios.servisAlumno;


public class Colecciones_Ej_03 {

    /*
    3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */
    public static void main(String[] args) {
        
        servisAlumno sa = new servisAlumno();
        ArrayList<Alumnos> lista = new ArrayList();
        
        sa.crearAlumno();
        
        sa.nuevoAlumno();
        
        sa.notaFinal(lista);
        
        
    }
    
}
