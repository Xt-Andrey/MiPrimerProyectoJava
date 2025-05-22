import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese el primer número: ");
        int numero1 = miobj.nextInt();

        System.out.print("ingrese el segundo número: ");
        int numero2 = miobj.nextInt();

        if (numero1 != numero2) {
            if (numero1 > numero2) {
                System.out.println("el mayor es: " + numero1);
            } else {
                System.out.println("el mayor es: " + numero2);
            }
        } else {
            System.out.println("los números ingresados deben ser distintos");
        }

        miobj.close();
    }
}
