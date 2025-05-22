
abstract class Persona {
    private String nombre;
    private String identificacion;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public abstract void mostrarDetalles();
}

class Usuario extends Persona {
    private int numeroPrestamos;

    public Usuario(String nombre, String identificacion) {
        super(nombre, identificacion);
        this.numeroPrestamos = 0;
    }

    public void incrementarPrestamos() {
        numeroPrestamos++;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getIdentificacion());
        System.out.println("Número de préstamos: " + numeroPrestamos);
    }
}

class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan Pérez", "12345");
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");

        usuario1.mostrarDetalles();
        System.out.println("Préstamo del libro: " + libro1.getTitulo());
        libro1.prestar();
        usuario1.incrementarPrestamos();
        usuario1.mostrarDetalles();
        System.out.println("¿Libro prestado? " + libro1.isPrestado());
        libro1.devolver();
        System.out.println("¿Libro devuelto? " + libro1.isPrestado());
    }
}
