import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> conjunto = new TreeSet<>();

        while (true) {
            System.out.println("\n1. Introducir una cadena");
            System.out.println("2. Eliminar una cadena");
            System.out.println("3. Mostrar conjunto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    conjunto.add(cadena);
                    mostrarConjunto(conjunto);
                    break;
                case 2:
                    System.out.print("Introduce la cadena a eliminar: ");
                    String eliminar = scanner.nextLine();
                    if (conjunto.remove(eliminar)) {
                        mostrarConjunto(conjunto);
                    } else {
                        System.out.println("La cadena no está en el conjunto.");
                    }
                    break;
                case 3:
                    mostrarConjunto(conjunto);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }

    private static void mostrarConjunto(Set<String> conjunto) {
        System.out.println("Contenido del conjunto:");
        for (String cadena : conjunto) {
            System.out.println(cadena);
        }
    }
}
