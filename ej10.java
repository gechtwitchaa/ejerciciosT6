import java.util.*;

public class ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Venta> ventas = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Registrar una venta");
            System.out.println("2. Mostrar ventas ordenadas por fecha");
            System.out.println("3. Mostrar ventas ordenadas por nombre de cliente");
            System.out.println("4. Mostrar ventas ordenadas por precio");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Precio de la transacción: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Fecha de la transacción (DD/MM/AAAA): ");
                    String fecha = scanner.next();
                    ventas.add(new Venta(producto, cliente, precio, fecha));
                    break;
                case 2:
                    Collections.sort(ventas, Comparator.comparing(Venta::getFecha));
                    mostrarVentas(ventas);
                    break;
                case 3:
                    Collections.sort(ventas, Comparator.comparing(Venta::getCliente));
                    mostrarVentas(ventas);
                    break;
                case 4:
                    Collections.sort(ventas, Comparator.comparing(Venta::getPrecio));
                    mostrarVentas(ventas);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }

    private static void mostrarVentas(List<Venta> ventas) {
        System.out.println("Registro de ventas:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}

class Venta {
    private String producto;
    private String cliente;
    private double precio;
    private String fecha;

    public Venta(String producto, String cliente, double precio, String fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public String getCliente() {
        return cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "producto='" + producto + '\'' +
                ", cliente='" + cliente + '\'' +
                ", precio=" + precio +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
