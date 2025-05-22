import java.util.Scanner;

public class CifrasNumero {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese un número entero positivo de hasta tres cifras: ");
        int numero = miobj.nextInt();

        if (numero > 0 && numero < 10) {
            System.out.println("el número tiene 1 cifra");
        } else if (numero >= 10 && numero < 100) {
            System.out.println("el número tiene 2 cifras");
        } else if (numero >= 100 && numero < 1000) {
            System.out.println("el número tiene 3 cifras");
        } else {
            System.out.println("error: el número debe tener como máximo 3 cifras y ser positivo");
        }

        miobj.close();
    }
}
