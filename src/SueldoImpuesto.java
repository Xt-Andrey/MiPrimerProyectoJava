import java.util.Scanner;

public class SueldoImpuesto {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese su sueldo en dólares: ");
        double sueldo = miobj.nextDouble();

        if (sueldo > 3000) {
            System.out.println("debe abonar impuestos");
        }

        miobj.close();
    }
}
