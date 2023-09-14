package Entrega2Personas;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // Construye los objetos
        Personas persona1 = new Personas("Octavio", "Otturi");
        Personas persona2 = new Personas("Walter", "Perez");
        Personas persona3 = new Personas("Juana", "Astarte");
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
        System.out.println("--------------------");

        System.out.println("Orden según nombres");
        listaPersonas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        listaPersonas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        for (Personas PersonasArray : listaPersonas) {
            System.out.println(PersonasArray);
        }
        System.out.println("--------------------");
        System.out.println("--------------------");

        System.out.println("Orden según Apellidos");
        listaPersonas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        listaPersonas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        for (Personas PersonasArray : listaPersonas) {
            System.out.println(PersonasArray);

        }
        System.out.println("--------------------");
        System.out.println("--------------------");

        System.out.println("Orden inverso según Apellidos");
        listaPersonas.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
        listaPersonas.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
        for (Personas PersonasArray : listaPersonas) {
            System.out.println(PersonasArray);
        }
    }
}