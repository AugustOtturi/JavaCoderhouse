package Entrega2Personas;

//clase personas
public class Personas {

    String nombre;
    String apellido;

    // Constructor
    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // getters y setters (desde acá se obtienen y se setean los atributos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
