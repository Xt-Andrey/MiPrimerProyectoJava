public class pasovalor {
    public static void main(String[] args) {
        int numero = 3;
        cambiarValor(numero);
        System.out.println("cambiar el valor " + numero); 
    }
    public static void cambiarValor(int numeroNuevo) {
        numeroNuevo = 9; 
        System.out.println("nuevo valor "+numeroNuevo);
    }
}
