package Entrega2Personas;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // Construye los objetos
        Personas persona1 = new Personas("Augusto", "Otturi");
        Personas persona2 = new Personas("Ricardo", "Perez");
        Personas persona3 = new Personas("Juana", "Molina");
        Personas persona4 = new Personas("Ricardo", "Mollo");
        Personas persona5 = new Personas("Pity", "Fernandez");

        // Lista de personas
        List<Personas> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        // Ordena la lista de personas

        System.out.println("Inicio del programa");
        System.out.println("--------------------");
        System.out.println("Personas ordenadas por apellido y nombre:");

        for (Personas persona : listaPersonas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
    }
}