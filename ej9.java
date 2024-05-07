import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Persona> personas = new TreeSet<>();

        while (true) {
            System.out.print("\nIntroduce un nombre y un apellido (o \"fin\" para terminar): ");
            String nombre = scanner.next();
            if (nombre.equals("fin")) break;
            String apellido = scanner.next();
            personas.add(new Persona(nombre, apellido));
        }

        System.out.println("\nPersonas ordenadas alfabéticamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
    }
}

class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        int resultado = this.apellido.compareTo(otraPersona.apellido);
        if (resultado == 0) {
            resultado = this.nombre.compareTo(otraPersona.nombre);
        }
        return resultado;
    }
}
