import java.util.Scanner;

public class Operariosueldo {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        float sueldo, sueldofinal;
        int antiguedad;

        System.out.print("ingrese el sueldo del operario: ");
        sueldo = miobj.nextFloat();

        System.out.print("ingrese los años de antigüedad: ");
        antiguedad = miobj.nextInt();

        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldofinal = sueldo * 1.20f;
                System.out.printf("sueldo con aumento del 20%", sueldofinal);
            } else {
                sueldofinal = sueldo * 1.05f;
                System.out.printf("sueldo con aumento del 5%", sueldofinal);
            }
        } else {
            System.out.printf("sueldo sin cambios", sueldo);
        }

        miobj.close();
    }
}
