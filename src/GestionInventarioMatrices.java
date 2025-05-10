import java.util.Scanner;

public class I {
    // Constantes
    private static final double IMPUESTO = 0.12; // 12% de impuesto
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para almacenar los productos (Miembro 1)
        String[] nombres = new String[100]; // Tamaño inicial para 100 productos
        int[] cantidades = new int[100];
        double[] precios = new double[100];
        int numProductos = 0;
        
        // Menú principal
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- SISTEMA DE INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar cantidad de producto");
            System.out.println("3. Generar reporte de inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1: // Agregar producto
                    if (numProductos < nombres.length) {
                        System.out.print("\nIngrese el nombre del producto " + (numProductos + 1) + ": ");
                        nombres[numProductos] = scanner.nextLine();
                        
                        System.out.print("Ingrese la cantidad en inventario: ");
                        cantidades[numProductos] = scanner.nextInt();
                        
                        System.out.print("Ingrese el precio por unidad: ");
                        precios[numProductos] = scanner.nextDouble();
                        
                        numProductos++;
                        System.out.println("Producto agregado exitosamente!");
                    } else {
                        System.out.println("No se pueden agregar más productos. Límite alcanzado.");
                    }
                    break;
                    
                case 2: // Actualizar cantidad (Miembro 3)
                    if (numProductos == 0) {
                        System.out.println("No hay productos registrados.");
                        break;
                    }
                    
                    System.out.println("\nProductos registrados:");
                    for (int i = 0; i < numProductos; i++) {
                        System.out.println((i + 1) + ". " + nombres[i]);
                    }
                    
                    System.out.print("Seleccione el número del producto a actualizar: ");
                    int seleccion = scanner.nextInt() - 1;
                    
                    if (seleccion >= 0 && seleccion < numProductos) {
                        System.out.print("Ingrese la nueva cantidad para " + nombres[seleccion] + ": ");
                        cantidades[seleccion] = scanner.nextInt();
                        System.out.println("Cantidad actualizada exitosamente!");
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;
                    
                case 3: // Generar reporte (Miembro 2 y 3)
                    if (numProductos == 0) {
                        System.out.println("No hay productos registrados.");
                        break;
                    }
                    
                    System.out.println("\n--- REPORTE FINAL ---");
                    double valorTotalInventario = 0;
                    
                    for (int i = 0; i < numProductos; i++) {
                        double valorTotalProducto = cantidades[i] * precios[i];
                        valorTotalInventario += valorTotalProducto;
                        
                        System.out.printf("Producto: %s - Cantidad: %d - Precio por unidad: %.2f - Valor total: %.2f%n",
                                nombres[i], cantidades[i], precios[i], valorTotalProducto);
                    }
                    
                    double impuestoTotal = valorTotalInventario * IMPUESTO;
                    System.out.printf("\nValor total del inventario (sin impuestos): %.2f%n", valorTotalInventario);
                    System.out.printf("Impuestos (12%%): %.2f%n", impuestoTotal);
                    System.out.printf("Valor total del inventario (con impuestos): %.2f%n", valorTotalInventario + impuestoTotal);
                    break;
                    
                case 4: // Salir
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
}