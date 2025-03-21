import java.util.Scanner;
public class Ejer12 {
public static void main(String[] args) {
    Scanner miobj=new Scanner(System.in);
    System.out.println("ingrese cantidad de empleados ");
    int empleados =miobj.nextInt();
    int sueldoMin=100;
    int sueldoMax=500;
    int empleadosMay=0;
    int empleadoMen=0;
    
    int[] sueldos = new int[empleados];

    for (int i = 0; i < empleados; i++) {
        System.out.println("ingrese sueldo de empleado"); 
        int sueldoEmp=miobj.nextInt();
       
        sueldos[i] = sueldoEmp;
        
        if (sueldoEmp>300 && sueldoEmp<=sueldoMax) {
            System.out.println("el empleado gana el sueldo mejor pagado");
            empleadosMay++;
        } else if (sueldoEmp<=300 && sueldoEmp>=sueldoMin) {
            System.out.println("el empleado gana lo minimo");
            empleadoMen++;
        }
        
       
    }
    
  
    System.out.println("la cantidad de empleados que ganan mas de 300 es "+empleadosMay);
    System.out.println("la cantidad de empleados que ganan entre 100 y 300 es "+empleadoMen);
    System.out.println("Los sueldos ingresados son:");
    for (int i = 0; i < sueldos.length; i++) {
        System.out.println("Empleado " + (i + 1) + ": " + sueldos[i]);
        

    }
}    
}
