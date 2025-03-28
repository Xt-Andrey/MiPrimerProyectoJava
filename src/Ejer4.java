import java.util.Scanner;
public class Ejer4 {

    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        System.out.println("ingrese sueldo");
        int sueldo=miobj.nextInt();
        if (sueldo>3000) {
            System.out.println("debe pagaer impuestos");

            
        } else {
            System.out.println("no debe pagar impuestos");
        }
      
       
            
    }}