import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays para almacenar la información básica de productos
        String[] nombres = new String[100];
        int[] cantidades = new int[100];
        double[] precios = new double[100];
        double[] valoresTotales = new double[100];
        int totalProductos = 0;
        String opcion;

        // MATRIZ para representar productos por categoría (opcional)
        // Por ejemplo, [0] = Alimentos, [1] = Aseo, [2] = Bebidas...
        String[][] categorias = new String[100][2]; // [nombre][categoría]

        System.out.println("=== Sistema de Inventario de Productos ===");
        
        // === MIEMBRO 1: Entrada de datos inicial ===
        do {
            System.out.println("\nIngrese el nombre del producto:");
            nombres[totalProductos] = sc.nextLine();

            System.out.println("Ingrese la cantidad en inventario:");
            cantidades[totalProductos] = sc.nextInt();

            System.out.println("Ingrese el precio por unidad:");
            precios[totalProductos] = sc.nextDouble();
            sc.nextLine(); // Limpiar buffer

            // Preguntar la categoría del producto (opcional)
            System.out.println("Ingrese la categoría del producto:");
            categorias[totalProductos][0] = nombres[totalProductos];
            categorias[totalProductos][1] = sc.nextLine();

            totalProductos++;

            System.out.print("¿Desea ingresar otro producto? (s/n): ");
            opcion = sc.nextLine();

        } while (opcion.equalsIgnoreCase("s"));

        // === MIEMBRO 2: Cálculo de valores ===
        double valorInventario = 0;
        for (int i = 0; i < totalProductos; i++) {
            valoresTotales[i] = cantidades[i] * precios[i];
            valorInventario += valoresTotales[i];
        }

        // === MIEMBRO 3: Actualización de cantidades y reporte final ===
        System.out.print("\n¿Desea actualizar cantidades de productos? (s/n): ");
        String actualizar = sc.nextLine();
        while (actualizar.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el nombre del producto a actualizar: ");
            String nombreActualizar = sc.nextLine();
            boolean encontrado = false;

            for (int i = 0; i < totalProductos; i++) {
                if (nombres[i].equalsIgnoreCase(nombreActualizar)) {
                    System.out.print("Ingrese la nueva cantidad: ");
                    cantidades[i] = sc.nextInt();
                    sc.nextLine();
                    // Actualizamos el valor total
                    valoresTotales[i] = cantidades[i] * precios[i];
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Producto no encontrado.");
            }

            System.out.print("¿Desea actualizar otro producto? (s/n): ");
            actualizar = sc.nextLine();
        }

        // Calcular nuevamente el total del inventario tras las actualizaciones
        valorInventario = 0;
        for (int i = 0; i < totalProductos; i++) {
            valorInventario += valoresTotales[i];
        }

        // Mostrar el reporte final
        System.out.println("\n=== Reporte Final de Inventario ===");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("Producto: " + nombres[i] +
                               " - Categoría: " + categorias[i][1] +
                               " - Cantidad: " + cantidades[i] +
                               " - Precio por unidad: " + precios[i] +
                               " - Valor total: " + valoresTotales[i]);
        }
        System.out.println("Valor total del inventario: " + valorInventario);
    }
}
