import java.util.Scanner;

public class Empresas {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        int n, entre100y300 = 0, masde300 = 0;
        float sueldo, total = 0;

        System.out.print("ingrese la cantidad de empleados: ");
        n = miobj.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("ingrese el sueldo del empleado " + i + ": ");
            sueldo = miobj.nextFloat();

            if (sueldo >= 100 && sueldo <= 300) {
                entre100y300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                masde300++;
            }

            total += sueldo;
        }

        System.out.println("empleados que cobran entre $100 y $300: " + entre100y300);
        System.out.println("empleados que cobran más de $300: " + masde300);
        System.out.println("importe total en sueldos: $" + total);

        miobj.close();
    }
}
