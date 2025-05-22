class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
class Gerente extends Empleado {
    private double bonificacion;

    public Gerente(String nombre, double salario, double bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bonificación: $" + bonificacion);
        System.out.println("Salario Total: $" + (getSalario() + bonificacion));
    }
}

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 2000);
        Gerente gerente1 = new Gerente("Ana", 5000, 1500);

        System.out.println("Datos del Empleado:");
        empleado1.mostrarInfo();

        System.out.println("\\nDatos del Gerente:");
        gerente1.mostrarInfo();
    }
}
