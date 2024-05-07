import java.util.*;

public class ej13 {
    public static void main(String[] args) {
        int[] numerosAleatorios = generarNumerosAleatorios(1000000);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        long inicio = System.currentTimeMillis();
        for (int num : numerosAleatorios) {
            treeSet.add(num);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo empleado para insertar en TreeSet: " + (fin - inicio) + " ms");

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        inicio = System.currentTimeMillis();
        for (int num : numerosAleatorios) {
            arrayList.add(num);
        }
        Collections.sort(arrayList);
        fin = System.currentTimeMillis();
        System.out.println("Tiempo empleado para insertar y ordenar en ArrayList: " + (fin - inicio) + " ms");


        inicio = System.currentTimeMillis();
        Arrays.sort(numerosAleatorios);
        fin = System.currentTimeMillis();
        System.out.println("Tiempo empleado para ordenar con Arrays: " + (fin - inicio) + " ms");
    }

    private static int[] generarNumerosAleatorios(int cantidad) {
        int[] numeros = new int[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt();
        }
        return numeros;
    }
}
