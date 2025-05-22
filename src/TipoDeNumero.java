import java.util.Scanner;

public class TipoDeNumero {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese un número entero: ");
        int numero = miobj.nextInt();

        if (numero > 0) {
            System.out.println("el número es positivo");
        } else if (numero < 0) {
            System.out.println("el número es negativo");
        } else {
            System.out.println("el número es nulo");
        }

        miobj.close();
    }
}
