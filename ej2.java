import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ej2 {
    public static void main(String[] args) {
        List<Double> lista1 = new ArrayList<>();
        llenarLista(lista1);

        System.out.println("Elementos en ArrayList:");
        mostrarLista(lista1);

        List<Double> lista2 = new LinkedList<>();
        llenarLista(lista2);

        System.out.println("\nElementos en LinkedList:");
        mostrarLista(lista2);
    }

    private static void llenarLista(List<Double> lista) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            lista.add(random.nextDouble());
        }
    }

    private static void mostrarLista(List<Double> lista) {
        for (Double valor : lista) {
            System.out.println(valor);
        }
    }
}
