import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Introducir una cadena");
            System.out.println("2. Eliminar el último dato introducido");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(cadena);
                    mostrarLista(lista);
                    break;
                case 2:
                    if (!lista.isEmpty()) {
                        lista.remove(lista.size() - 1);
                        mostrarLista(lista);
                    } else {
                        System.out.println("La lista está vacía.");
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }

    private static void mostrarLista(List<String> lista) {
        System.out.println("Contenido de la lista:");
        for (String cadena : lista) {
            System.out.println(cadena);
        }
    }
}
