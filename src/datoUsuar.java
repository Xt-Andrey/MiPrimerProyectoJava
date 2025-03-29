import java.util.Scanner;

public class datoUsuar {
  public static void main(String[] args) {
    System.out.println("ingrese tres numeros:");
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese el primer numero: ");
      int num1 = scanner.nextInt();
      System.out.println("ingrese el segundo numero:");
      int num2 = scanner.nextInt();
      System.out.println("ingrese el tercer numero:");
      int num3 = scanner.nextInt();
      boolean reultedo = (num1>num2) && (num1<num3);
      System.out.println("cuales numeros son mayores :");
  }
}
     