import java.util.Scanner;

public class Conversor_millas_A_Km {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        // Pedimos al usuario que ingrese la distancia en millas
        System.out.print("Ingresa la distancia en millas: ");

        //utilizamos el método hasNextInt() de Scanner para verificar si el siguiente valor ingresado por el usuario es un número entero.
        if (usuario.hasNextInt()) {
            int millas = usuario.nextInt();

            // Convertimos las millas a kilómetros utilizando la fórmula
            double kilometros = Math.round(millas * 1.60934);

            // Mostramos la distancia en kilómetros al usuario
            System.out.println(millas + " millas son " + kilometros + " kilómetros.");
        } else {
            System.out.println("Error: Ingresa un número entero válido.");
        }
    }
}
