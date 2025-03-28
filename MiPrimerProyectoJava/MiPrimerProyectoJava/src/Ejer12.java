import java.util.Scanner;

public class Ejer12 {

    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);
        int countLow = 0, countHigh = 0;
        double totalSueldo = 0;
        
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = miobj.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            double sueldo = miobj.nextDouble();
            
            if (sueldo >= 100 && sueldo <= 300) {
                countLow++;
            } else if (sueldo > 300) {
                countHigh++;
            }
            totalSueldo += sueldo;
        }
        
        System.out.println("Cantidad de empleados con sueldo entre $100 y $300: " + countLow);
        System.out.println("Cantidad de empleados con sueldo mayor a $300: " + countHigh);
        System.out.println("Gasto total en sueldos: $" + totalSueldo);
        
        miobj.close();
    }
}
