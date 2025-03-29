import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el numero de inicio");
        int inicio = input.nextInt();
        System.out.println("ingrese el numero fin");
        int fin = input.nextInt();

        if (inicio > fin) {
            System.out.println("entrada no valida");
            input.close();
            return;
        }

        boolean encontrar = false;

        for (int i = Math.max(2, inicio); i < fin; i++) {
            int contadorDivisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                }
            }

            if (contadorDivisores == 2) { 
                System.out.println(i + " es un numero primo");
                encontrar = true;
            }
        }

        if (!encontrar) {
            System.out.println("no se encontraron numeros primos en el rango");
        }

        input.close();
    }
}