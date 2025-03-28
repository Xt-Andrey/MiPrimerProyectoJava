import java.util.Scanner;

public class Ejer11 {

    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);
        int countHigh = 0, countLow = 0;
        
        System.out.println("Ingrese 10 notas de alumnos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            int nota = miobj.nextInt();
            
            if (nota >= 7) {
                countHigh++;
            } else {
                countLow++;
            }
        }
        
        System.out.println("Cantidad de alumnos con nota mayor o igual a 7: " + countHigh);
        System.out.println("Cantidad de alumnos con nota menor a 7: " + countLow);
        
        miobj.close();
    }
}