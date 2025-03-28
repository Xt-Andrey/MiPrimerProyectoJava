import java.util.Scanner;
public class Ejer5 {

    public static void main(String[] args) {
        Scanner miobj= new Scanner(System.in);
        System.out.println("ingrese un numero");
        Float num1=miobj.nextFloat();
        System.out.println("ingrese un segundo numero");
        float num2=miobj.nextFloat();
        if (num1>num2) {
            System.out.println("el primer numero es mayor");
            
        } else if(num1<num2){
            System.out.println("el segundo numeroes mayor");
        }else{
            System.out.println("los numeros son iguales");
        }
    }
}