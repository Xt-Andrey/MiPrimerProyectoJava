import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese el primer número: ");
        double numero1 = miobj.nextDouble();

        System.out.print("ingrese el segundo número: ");
        double numero2 = miobj.nextDouble();

        if (numero1 > numero2) {
            double suma = numero1 + numero2;
            double diferencia = numero1 - numero2;
            System.out.println("el primer número es mayor que el segundo.");
            System.out.println("suma: " + suma);
            System.out.println("diferencia: " + diferencia);
        } else {
            double producto = numero1 * numero2;
            if (numero2 != 0) {
                double division = numero1 / numero2;
                System.out.println("el primer número no es mayor que el segundo.");
                System.out.println("producto: " + producto);
                System.out.println("división: " + division);
            } else {
                System.out.println("no se puede dividir por cero.");
                System.out.println("producto: " + producto);
            }
        }

        miobj.close();
    }
}
