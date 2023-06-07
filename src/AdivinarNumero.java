import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Random para generar números aleatorios
        Random number = new Random();

        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = number.nextInt(100) + 1;

        // Mostrar un mensaje de bienvenida al juego
        System.out.println("Bienvenido al juego de adivinar el número del 1 al 100. ");
        System.out.println("Tienes tres intentos para adivinar el número.");

        // Iterar tres veces para los tres intentos del usuario
        for (int intento = 1; intento <= 3; intento++) {
            // Solicitar al usuario que ingrese su intento
            System.out.print("Intento #" + intento + ": ");
            int numeroAdivinado = scanner.nextInt();

            // Verificar si el número adivinado es igual al número aleatorio
            if (numeroAdivinado == numeroAleatorio) {
                // Mostrar un mensaje de felicitaciones y salir del juego
                System.out.println("¡Felicitaciones! Has adivinado el número.");
                return;
            } else if (numeroAdivinado < numeroAleatorio) {
                // Mostrar un mensaje indicando que el número es menor
                System.out.println("Cerca. Intenta con un número mayor.");
            } else {
                // Mostrar un mensaje indicando que el número es mayor
                System.out.println("Cerca. Intenta con un número menor.");
            }
        }

        // Mostrar un mensaje de que se han agotado los intentos y mostrar el número correcto
        System.out.println("Lo siento, has agotado tus intentos. El número correcto era: " + numeroAleatorio);
    }
}
