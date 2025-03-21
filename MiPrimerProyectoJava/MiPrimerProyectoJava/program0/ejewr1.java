import java.util.Scanner;
public class ejewr1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingresa un numero ");
        int num= scanner.nextInt();
        if (num>0 && num<10) {
            System.out.println("numero es de una cifra");
            
        } else if(num>=10 && num<100) {
            System.out.println("el numero e de dos cifras ");
        }else if (num>=100 && num<1000) {
            System.out.println("EL NUMERO ES DE TRES  CIFRAS");
            
        } else {
            System.out.println("EL NUMERO NO ES VALIDO");
        }
     
    }
}