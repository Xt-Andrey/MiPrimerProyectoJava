import java.util.Scanner;

public class Inout {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = input.nextInt();
        
        if (num <= 0) {
            System.out.println("Número no válido");
        } else {
            for (int k = 1; k <= num; k++) {
                for (int j = 1; j <= k; j++) {
                    if (j % 2 == 1) {
                        System.out.print(k);
                    } else {
                        System.out.print(k * -1);
                    }
                    if (j < k) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
