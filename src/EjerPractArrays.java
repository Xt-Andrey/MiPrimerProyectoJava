import java.util.Scanner;

public class EjerPractArrays {

    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma = 0;
        
        System.out.println("ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("número " + (i + 1));
            numeros[i] = miobj.nextDouble();
            suma += numeros[i];
        }
        
        double promedio = suma / 5;
        System.out.println("el promedio es: " + promedio);
        
    
    }
}
