import java.util.Scanner;
public class Ejer1 {
    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        float num1=15;
        float num2=10;

        if (num1>num2) {
            System.out.println("la suma es :"+(int)(num1+num2));
            System.out.println("la suma es :"+(int)(num1-num2));
        } else { 
            System.out.println("la suma es :"+(int)(num1*num2));
            System.out.println("la suma es :"+(num1/num2));
        }
    }
    
}