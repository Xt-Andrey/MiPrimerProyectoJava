import java.util.Scanner;
public class Ejer3 {
    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        while (true) {
        System.out.println("ingrese su numero");
        int num=miobj.nextInt(); 
            
        if (num<100 && num>0) {
            if (num>9) {
                System.out.println("su numero tiene 2 digitos");
            }else{
                System.out.println("su numero tiene 1 digito");
            }break;
        }else{
            System.out.println("no esta en el rango");
        }
}}
}
