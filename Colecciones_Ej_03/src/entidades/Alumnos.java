
package entidades;

import java.util.ArrayList;


public class Alumnos {
    
    public String nombre;
    public ArrayList<Integer> nota;

    public Alumnos() {
    }

    public Alumnos(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
    
}
