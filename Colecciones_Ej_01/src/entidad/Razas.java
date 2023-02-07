
package entidad;


public class Razas {
    
    private String razas;

    public Razas() {
    }

    public Razas(String razas) {
        this.razas = razas;
    }

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    @Override
    public String toString() {
        return "Razas{" + "razas=" + razas + '}';
    }
    
    
    
}
