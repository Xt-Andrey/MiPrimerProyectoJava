import java.util.Scanner;

public class program3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el  primer numero");  
        int num1= scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = scanner.nextInt();
        if (num1>num2) {
            System.out.println("el primer numero es mayor ");
            
        } else if (num1<num2) {
            System.out.println("el segundo numero es mayo  ");
        }
    


    }
}