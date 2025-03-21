import java.util.Scanner;
public class Ejer15 {
public static void main(String[] args) {
    Scanner miobj=new Scanner(System.in);
    System.out.print("Ingrese el primer nombre: ");
    String nombre1 = miobj.nextLine();
    System.out.print("Ingrese el segundo nombre: ");
    String nombre2 = miobj.nextLine();
    
    if (nombre1.compareToIgnoreCase(nombre2) < 0) {
        System.out.println(nombre1 + "\n" + nombre2);
    } else {
        System.out.println(nombre2 + "\n" + nombre1);
    }
}    
}
