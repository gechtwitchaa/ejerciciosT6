import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ej3 {
    public static void main(String[] args) {

        List<ej1<Integer>> lista1 = new ArrayList<>();
        llenarLista(lista1);

        System.out.println("Elementos en ArrayList de Parejas:");
        mostrarLista(lista1);

        List<ej1<Integer>> lista2 = new LinkedList<>();
        llenarLista(lista2);

        System.out.println("\nElementos en LinkedList de Parejas:");
        mostrarLista(lista2);
    }

    private static void llenarLista(List<ej1<Integer>> lista) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            lista.add(new ej1<>(random.nextInt(100), random.nextInt(100)));
        }
    }

    private static void mostrarLista(List<ej1<Integer>> lista) {
        for (ej1<Integer> pareja : lista) {
            System.out.println(pareja.getPrimero() + ", " + pareja.getSegundo());
        }
    }
}

