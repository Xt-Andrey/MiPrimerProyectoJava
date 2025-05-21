import java.util.Scanner;

// Clase base: Personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int resistencia;

    public Personaje(String nombre, int fuerza, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public void atacar(Personaje oponente) {
        System.out.println(nombre + " ataca a " + oponente.nombre + " con una fuerza de " + fuerza + " puntos.");
        oponente.resistencia -= fuerza;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas de " + nombre + " ---");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("-----------------------------------\n");
    }

    public void recuperarse() {
        resistencia += 25;
        System.out.println(nombre + " se recupera y ahora tiene " + resistencia + " puntos de resistencia.");
    }
}

// Clase derivada: Heroe (Scorpion)
class Heroe extends Personaje {
    public Heroe(String nombre, int fuerza, int velocidad, int resistencia) {
        super(nombre, fuerza, velocidad, resistencia);
    }

    // Ataque especial basado en la velocidad (sobrecarga)
    public void ataqueEspecial(Personaje oponente) {
        int dano = velocidad * 3;
        System.out.println(nombre + " usa su ataque especial: ¡Lanza su lanza infernal!");
        System.out.println("Inflige " + dano + " puntos de daño a " + oponente.nombre);
        oponente.resistencia -= dano;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }
}

// Clase derivada: Villano (Sub-Zero)
class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int velocidad, int resistencia) {
        super(nombre, fuerza, velocidad, resistencia);
    }

    // Hace trampa: duplica el ataque
    public void hacerTrampa(Personaje oponente) {
        int dano = fuerza * 2;
        System.out
                .println(nombre + " congela al oponente y ataca con el doble de fuerza: " + dano + " puntos de daño.");
        oponente.resistencia -= dano;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }
}

// Clase principal
public class MortalKombatBatalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear los personajes
        Heroe scorpion = new Heroe("Scorpion", 35, 25, 110);
        Villano subZero = new Villano("Sub-Zero", 30, 20, 120);

        scorpion.mostrarEstadisticas();
        subZero.mostrarEstadisticas();

        int opcion;
        do {
            System.out.println("Elige una acción:");
            System.out.println("1. Scorpion ataca");
            System.out.println("2. Scorpion usa ataque especial");
            System.out.println("3. Sub-Zero ataca");
            System.out.println("4. Sub-Zero hace trampa");
            System.out.println("5. Scorpion se recupera");
            System.out.println("6. Sub-Zero se recupera");
            System.out.println("7. Mostrar estadísticas");
            System.out.println("8. Terminar batalla");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scorpion.atacar(subZero);
                    break;
                case 2:
                    scorpion.ataqueEspecial(subZero);
                    break;
                case 3:
                    subZero.atacar(scorpion);
                    break;
                case 4:
                    subZero.hacerTrampa(scorpion);
                    break;
                case 5:
                    scorpion.recuperarse();
                    break;
                case 6:
                    subZero.recuperarse();
                    break;
                case 7:
                    scorpion.mostrarEstadisticas();
                    subZero.mostrarEstadisticas();
                    break;
                case 8:
                    System.out.println("La batalla ha terminado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            if (scorpion.resistencia == 0) {
                System.out.println("Scorpion ha sido derrotado. ¡Sub-Zero gana!");
                break;
            } else if (subZero.resistencia == 0) {
                System.out.println("Sub-Zero ha sido derrotado. ¡Scorpion gana!");
                break;
            }

        } while (opcion != 8);

        scanner.close();
    }
}
