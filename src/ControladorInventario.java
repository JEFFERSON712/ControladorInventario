public class ControladorInventario {
    private final Inventario inventario;
    private final VistaConsola vista;

    public ControladorInventario(Inventario inventario, VistaConsola vista) {
        this.inventario = inventario;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
           vista.imprimirMenu();
            int opcion = vista.scanner.nextInt();
            vista.limpiarBuffer();
            switch (opcion) {
                case 1 -> registrarProducto();
                case 2 -> actualizarInventario();
                case 3 -> consultarProductos();
                case 4 -> calcularValorTotal();
                case 5 -> salir = true;
                default -> System.out.println("Opcion no valida.");
            }
        }
    }

    private void registrarProducto() {
        String nombre = vista.solicitarNombreProducto();
        double precio = vista.solicitarPrecioProducto();
        int cantidad = vista.solicitarCantidadProducto();
        Producto producto = new Producto(nombre, precio, cantidad);
        inventario.agregarProducto(producto);
    }

    private void actualizarInventario() {
        String nombre = vista.solicitarNombreProducto();
        int nuevaCantidad = vista.solicitarNuevaCantidad();
        inventario.actualizarInventario(nombre, nuevaCantidad);
    }

    private void consultarProductos() {
        vista.mostrarProductos(inventario.consultarProductos());
    }

    private void calcularValorTotal() {
        double total = inventario.calcularValorTotal();
        vista.mostrarValorTotal(total);
    }
}