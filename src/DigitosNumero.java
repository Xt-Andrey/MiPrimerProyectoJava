import java.util.Scanner;

public class DigitosNumero {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese un número entre 1 y 99: ");
        int numero = miobj.nextInt();

        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("el número tiene un dígito");
            } else {
                System.out.println("el número tiene dos dígitos");
            }
        } else {
            System.out.println("el número ingresado está fuera del rango permitido");
        }

        miobj.close();
    }
}
