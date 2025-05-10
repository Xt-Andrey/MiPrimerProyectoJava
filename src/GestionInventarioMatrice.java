import java.util.Scanner;

public class GestionInventarioMatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definición de categorías fijas
        final String[] CATEGORIAS = {"Electrónicos", "Ropa", "Alimentos", "Hogar"};
        final int MAX_PRODUCTOS = 100;
        
        // Matriz para almacenar productos por categoría (filas: categorías, columnas: productos)
        String[][][] productos = new String[CATEGORIAS.length][MAX_PRODUCTOS][4];
        // Dimensiones: [categoría][producto][atributos: 0=código, 1=nombre, 2=precio, 3=cantidad]
        
        // Array para contar productos por categoría
        int[] contadorPorCategoria = new int[CATEGORIAS.length];
        
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE INVENTARIO CON MATRICES ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario completo");
            System.out.println("3. Mostrar productos por categoría");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Buscar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    // Agregar nuevo producto
                    System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
                    
                    // Mostrar categorías disponibles
                    System.out.println("Categorías disponibles:");
                    for (int i = 0; i < CATEGORIAS.length; i++) {
                        System.out.println((i+1) + ". " + CATEGORIAS[i]);
                    }
                    
                    System.out.print("Seleccione categoría (1-" + CATEGORIAS.length + "): ");
                    int catIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar buffer
                    
                    if (catIndex < 0 || catIndex >= CATEGORIAS.length) {
                        System.out.println("Categoría no válida!");
                        break;
                    }
                    
                    if (contadorPorCategoria[catIndex] >= MAX_PRODUCTOS) {
                        System.out.println("Esta categoría está llena. No se pueden agregar más productos.");
                        break;
                    }
                    
                    System.out.print("Código: ");
                    productos[catIndex][contadorPorCategoria[catIndex]][0] = scanner.nextLine();
                    
                    System.out.print("Nombre: ");
                    productos[catIndex][contadorPorCategoria[catIndex]][1] = scanner.nextLine();
                    
                    System.out.print("Precio unitario: ");
                    productos[catIndex][contadorPorCategoria[catIndex]][2] = scanner.nextLine();
                    
                    System.out.print("Cantidad en stock: ");
                    productos[catIndex][contadorPorCategoria[catIndex]][3] = scanner.nextLine();
                    
                    contadorPorCategoria[catIndex]++;
                    System.out.println("Producto agregado correctamente a " + CATEGORIAS[catIndex] + "!");
                    break;
                    
                case 2:
                    // Mostrar inventario completo
                    System.out.println("\n--- INVENTARIO COMPLETO ---");
                    for (int i = 0; i < CATEGORIAS.length; i++) {
                        System.out.println("\nCATEGORÍA: " + CATEGORIAS[i].toUpperCase());
                        if (contadorPorCategoria[i] == 0) {
                            System.out.println("No hay productos en esta categoría.");
                            continue;
                        }
                        
                        System.out.printf("%-10s %-20s %-10s %-8s %-12s%n", 
                                "Código", "Nombre", "Precio", "Cantidad", "Valor Total");
                        
                        for (int j = 0; j < contadorPorCategoria[i]; j++) {
                            double precio = Double.parseDouble(productos[i][j][2]);
                            int cantidad = Integer.parseInt(productos[i][j][3]);
                            double valorTotal = precio * cantidad;
                            
                            System.out.printf("%-10s %-20s %-10.2f %-8d %-12.2f%n", 
                                    productos[i][j][0], productos[i][j][1], 
                                    precio, cantidad, valorTotal);
                        }
                    }
                    break;
                    
                case 3:
                    // Mostrar productos por categoría específica
                    System.out.println("\nCategorías disponibles:");
                    for (int i = 0; i < CATEGORIAS.length; i++) {
                        System.out.println((i+1) + ". " + CATEGORIAS[i]);
                    }
                    
                    System.out.print("Seleccione categoría (1-" + CATEGORIAS.length + "): ");
                    int catSeleccionada = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar buffer
                    
                    if (catSeleccionada < 0 || catSeleccionada >= CATEGORIAS.length) {
                        System.out.println("Categoría no válida!");
                        break;
                    }
                    
                    System.out.println("\n--- PRODUCTOS EN " + CATEGORIAS[catSeleccionada].toUpperCase() + " ---");
                    if (contadorPorCategoria[catSeleccionada] == 0) {
                        System.out.println("No hay productos en esta categoría.");
                        break;
                    }
                    
                    System.out.printf("%-10s %-20s %-10s %-8s %-12s%n", 
                            "Código", "Nombre", "Precio", "Cantidad", "Valor Total");
                    
                    double totalCategoria = 0;
                    for (int j = 0; j < contadorPorCategoria[catSeleccionada]; j++) {
                        double precio = Double.parseDouble(productos[catSeleccionada][j][2]);
                        int cantidad = Integer.parseInt(productos[catSeleccionada][j][3]);
                        double valorTotal = precio * cantidad;
                        totalCategoria += valorTotal;
                        
                        System.out.printf("%-10s %-20s %-10.2f %-8d %-12.2f%n", 
                                productos[catSeleccionada][j][0], productos[catSeleccionada][j][1], 
                                precio, cantidad, valorTotal);
                    }
                    
                    System.out.printf("\nTotal en %s: %.2f\n", CATEGORIAS[catSeleccionada], totalCategoria);
                    break;
                    
                case 4:
                    // Calcular valor total del inventario
                    double valorTotalInventario = 0;
                    
                    for (int i = 0; i < CATEGORIAS.length; i++) {
                        double totalCategoria = 0;
                        for (int j = 0; j < contadorPorCategoria[i]; j++) {
                            double precio = Double.parseDouble(productos[i][j][2]);
                            int cantidad = Integer.parseInt(productos[i][j][3]);
                            totalCategoria += precio * cantidad;
                        }
                        valorTotalInventario += totalCategoria;
                        System.out.printf("%-15s: %.2f%n", CATEGORIAS[i], totalCategoria);
                    }
                    
                    System.out.printf("\nVALOR TOTAL DEL INVENTARIO: %.2f%n", valorTotalInventario);
                    break;
                    
                case 5:
                    // Buscar producto
                    System.out.print("\nIngrese código o nombre del producto a buscar: ");
                    String busqueda = scanner.nextLine();
                    boolean encontrado = false;
                    
                    System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
                    for (int i = 0; i < CATEGORIAS.length; i++) {
                        for (int j = 0; j < contadorPorCategoria[i]; j++) {
                            if (productos[i][j][0].equalsIgnoreCase(busqueda) || 
                                productos[i][j][1].equalsIgnoreCase(busqueda)) {
                                
                                System.out.println("Categoría: " + CATEGORIAS[i]);
                                System.out.println("Código: " + productos[i][j][0]);
                                System.out.println("Nombre: " + productos[i][j][1]);
                                System.out.println("Precio: " + productos[i][j][2]);
                                System.out.println("Cantidad: " + productos[i][j][3]);
                                
                                double precio = Double.parseDouble(productos[i][j][2]);
                                int cantidad = Integer.parseInt(productos[i][j][3]);
                                System.out.println("Valor total: " + (precio * cantidad));
                                
                                encontrado = true;
                                System.out.println("----------------------------");
                            }
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Producto no encontrado en el inventario.");
                    }
                    break;
                    
                case 6:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
}