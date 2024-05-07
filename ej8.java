import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Character> mapa = new HashMap<>();

        while (true) {
            System.out.println("\n1. Introducir un par número/letra");
            System.out.println("2. Recuperar una letra a partir de un número");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int numero = scanner.nextInt();
                    System.out.print("Introduce una letra: ");
                    char letra = scanner.next().charAt(0);
                    mapa.put(numero, letra);
                    System.out.println("Par añadido.");
                    break;
                case 2:
                    System.out.print("Introduce un número para buscar la letra correspondiente: ");
                    int numBusqueda = scanner.nextInt();
                    char letraEncontrada = mapa.getOrDefault(numBusqueda, ' ');
                    if (letraEncontrada != ' ') {
                        System.out.println("La letra correspondiente al número " + numBusqueda + " es: " + letraEncontrada);
                    } else {
                        System.out.println("No se encontró una letra para el número dado.");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}
