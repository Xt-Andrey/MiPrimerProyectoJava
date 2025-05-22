import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese el primer nombre: ");
        String nombre1 = miobj.nextLine();

        System.out.print("ingrese el segundo nombre: ");
        String nombre2 = miobj.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("nombres en orden alfabético:");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else {
            System.out.println("nombres en orden alfabético:");
            System.out.println(nombre2);
            System.out.println(nombre1);
        }

        miobj.close();
    }
}
