import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Introducir una cadena en una posición");
            System.out.println("2. Eliminar una cadena por posición");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cadena: ");
                    String cadena = scanner.nextLine();
                    System.out.print("Introduce la posición: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    if (posicion >= 0 && posicion <= lista.size()) {
                        lista.add(posicion, cadena);
                        mostrarLista(lista);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 2:
                    System.out.print("Introduce la posición a eliminar: ");
                    int posEliminar = scanner.nextInt();
                    scanner.nextLine();
                    if (posEliminar >= 0 && posEliminar < lista.size()) {
                        lista.remove(posEliminar);
                        mostrarLista(lista);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 3:
                    mostrarLista(lista);
                    break;
                case 4:
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

