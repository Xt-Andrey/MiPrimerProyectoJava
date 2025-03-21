import java.util.Scanner;
public class Ejer6 {
    public static void main(String[] args) {
        Scanner miobj= new Scanner(System.in);
        System.out.println("ingrese un nuemro");
        int num=miobj.nextInt();
        if (num>0) {
            System.out.println("su numero es positivo");
        } else if(num<0){
            System.out.println("su numeroe es negativo");
        }else{
            System.out.println("su numero es cero");
        }

    }
    
}
