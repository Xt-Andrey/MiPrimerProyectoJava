public class calculadorapersonal {
    public static void main(String[] args) {
        String nombre = "juan";
        int edad = 25;
        double altura = 1.75;
        boolean esestudiante = true;
        
        System.out.println("datos personales:");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad + " anos");
        System.out.println("altura: " + altura + " metros");
        System.out.println("es estudiante: " + esestudiante);
        
        // calculo de imc
        double peso = 70.5;
        double imc = peso / (altura * altura);
        System.out.println("\nimc: " + imc);
        
        // uso de switch
        String estado = "bien";
        switch (estado) {
            case "bien":
                System.out.println("estas en buen estado");
                break;
            case "regular":
                System.out.println("podrias mejorar");
                break;
            case "mal":
                System.out.println("necesitas ayuda");
                break;
        }
        
        // array
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes"};
        System.out.println("\ndias de la semana:");
        for (int i = 0; i < dias.length; i++) {
            System.out.println((i + 1) + ". " + dias[i]);
        }
        
        // metodo personalizado
        saludar(nombre);
    }
    
    public static void saludar(String n) {
        System.out.println("\n¡hola " + n + "! bienvenido");
    }
}
