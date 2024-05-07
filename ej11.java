import java.io.*;
import java.util.*;

public class ej11 {
    public static void main(String[] args) {
        try {
            File archivoEntrada = new File("entrada.txt");
            File archivoSalida = new File("salida.txt");

            List<String> lineas = new ArrayList<>();
            try (BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada))) {
                String linea;
                while ((linea = lector.readLine()) != null) {
                    lineas.add(linea);
                }
            }

            Collections.sort(lineas);

            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida))) {
                for (String linea : lineas) {
                    escritor.write(linea);
                    escritor.newLine();
                }
            }

            System.out.println("Archivo ordenado creado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
