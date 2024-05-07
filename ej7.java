import java.util.HashMap;
import java.util.Map;

public class ej7 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        String[] nombres = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};

        for (int i = 0; i <= 10; i++) {
            mapa.put(nombres[i], i);
        }

        System.out.println("Contenido del mapa:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
