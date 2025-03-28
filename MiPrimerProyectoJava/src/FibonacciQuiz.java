import java.util.Scanner;

public class FibonacciQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un número de usaario: ");
        int limite = scanner.nextInt();
        if (limite < 0) {
            System.out.println("ingrsar un número entero positivo.");
            return;
        }
        int num1 = 0, num2 = 1;
        int suma = 0;
        int contador = 0;
        System.out.println("Suma de la secuencia " + limite);
        while (num1 <= limite) {
            System.out.print(num1);
            suma += num1;
            contador++;

            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
        System.out.println("los numeros generados son: " + contador);
        System.out.println("la suma de los números generados es: " + suma);
       
    }
}