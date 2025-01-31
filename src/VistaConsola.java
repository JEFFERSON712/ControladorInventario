import java.util.List;
import java.util.Scanner;

public class VistaConsola {
    public Scanner scanner;

    public VistaConsola() {
        scanner = new Scanner(System.in);
    }

    public void imprimirMenu(){
         System.out.println("1. Registrar Producto");
            System.out.println("2. Actualizar Inventario");
            System.out.println("3. Consultar Productos");
            System.out.println("4. Calcular Valor Total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
    }
    public void mostrarProductos(List<Producto> productos) {
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Cantidad: " + producto.getCantidad());
        }
    }

    public void mostrarValorTotal(double valorTotal) {
        System.out.println("Valor total del inventario: " + valorTotal);
    }

    public String solicitarNombreProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        return scanner.nextLine();
    }

    public double solicitarPrecioProducto() {
        System.out.print("Ingrese el precio del producto: ");
        return scanner.nextDouble();
    }

    public int solicitarCantidadProducto() {
        System.out.print("Ingrese la cantidad del producto: ");
        return scanner.nextInt();
    }

    public int solicitarNuevaCantidad() {
        System.out.print("Ingrese la nueva cantidad del producto: ");
        return scanner.nextInt();
    }

    public void limpiarBuffer() {
        scanner.nextLine(); // Limpiar el buffer
    }
}