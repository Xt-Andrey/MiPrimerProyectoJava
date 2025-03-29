import java.util.Scanner;

public class ParcialArreglar {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("numero de usuarios a ingresar ");
        int numUsuarios = miobj.nextInt();
        miobj.nextLine();

        String[] nombres = new String[numUsuarios];
        int[] edades = new int[numUsuarios];

        for (int i = 0; i < numUsuarios; i++) {
            System.out.print("nombre del usuario ");
            nombres[i] = miobj.nextLine();

            int edad;
            while (true) {
                System.out.print("edad del usuario ");
                if (miobj.hasNextInt()) {
                    edad = miobj.nextInt();
                    miobj.nextLine(); 
                    if (edad >= 1 && edad <= 120) {
                        break;
                    } else {
                        System.out.println("edad no valida debe estar entre 1 y 120");
                    }
                } else {
                    System.out.println("entrada no valida por favor ingrese un numero entero");
                    miobj.next(); 
                }
            }
            edades[i] = edad;

            System.out.println(nombres[i] + (edad >= 18 ? " es mayor de edad" : " es menor de edad"));
        }

        System.out.println("\nresumen");
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("usuario " + (i + 1) + " " + nombres[i] + " edad " + edades[i]);
        }

        miobj.close();
    }
}