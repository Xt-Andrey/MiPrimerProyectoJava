import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el primer número:");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el segundo número:");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("¿Qué operación desea realizar? (+, -, *, /, %, comparar):");
            String operacion = scanner.nextLine();

            if (operacion.equals("+")) {
                System.out.println("Resultado: " + (num1 + num2));
            } else if (operacion.equals("-")) {
                System.out.println("Resultado: " + (num1 - num2));
            } else if (operacion.equals("*")) {
                System.out.println("Resultado: " + (num1 * num2));
            } else if (operacion.equals("/")) {
                if (num2 != 0) {
                    System.out.println("Resultado: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
            } else if (operacion.equals("%")) {
                System.out.println("Resultado: " + (num1 % num2));
            } else if (operacion.equalsIgnoreCase("comparar")) {
                if (num1 > num2) {
                    System.out.println(num1 + " es mayor que " + num2);
                } else if (num1 < num2) {
                    System.out.println(num1 + " es menor que " + num2);
                } else {
                    System.out.println(num1 + " es igual a " + num2);
                }
            } else {
                System.out.println("Operación no válida.");
            }

            System.out.println("¿Desea continuar? (si/no):");
            String continuar = scanner.nextLine();

            if (!continuar.equalsIgnoreCase("si")) {
                break;
            }
        }

        
    }
}