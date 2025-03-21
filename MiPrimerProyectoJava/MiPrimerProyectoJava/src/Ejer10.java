import java.util.Scanner;
public class Ejer10 {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);
        System.out.println("ingrese la cantidad de meses");
        int meses=miobj.nextInt();
        System.out.println("cantidad de sueldo");
        int sueldo = miobj.nextInt();
        if (meses>0 && sueldo>0) {
            if (meses >= 10 && sueldo <= 500) {
                System.out.println(sueldo +(sueldo*0.2));
            }else if (meses < 10 && sueldo<=500) {
                System.out.println(sueldo+(sueldo*0.05));
            }else{
                System.out.println("ningun cambio "+ sueldo);
            }
        }else{System.out.println("ingrese una cantidad valida");}
    }
}