import java.io.File;
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta del directorio a listar: ");
        String directorio = scanner.nextLine();
        File carpeta = new File(directorio);
        if (carpeta.isDirectory()) {
            listarArchivos(carpeta);
            System.out.print("\nIntroduce el nombre del archivo para obtener su ruta completa: ");
            String nombreArchivo = scanner.nextLine();
            buscarArchivo(carpeta, nombreArchivo);
        } else {
            System.out.println("La ruta no corresponde a un directorio válido.");
        }
    }

    private static void listarArchivos(File directorio) {
        System.out.println("Archivos en " + directorio.getAbsolutePath() + ":");
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }
    }

    private static void buscarArchivo(File directorio, String nombreArchivo) {
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                buscarArchivo(archivo, nombreArchivo);
            } else if (archivo.getName().equals(nombreArchivo)) {
                System.out.println("La ruta completa del archivo: " + archivo.getAbsolutePath());
            }
        }
    }
}
