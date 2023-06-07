import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner usuario = new Scanner(System.in);

        // Pedir al usuario el total de la cuenta en el restaurante
        System.out.print("Ingresa el total de la cuenta en el restaurante: ");
        double valorCuenta = usuario.nextDouble();

        // Validar si el total de la cuenta es mayor a cero
        if (valorCuenta > 0) {
            // Pedir al usuario el porcentaje de propina deseado
            System.out.print("Ingresa el porcentaje de propina que deseas dejar: ");
            double porcentajePropina = usuario.nextDouble();

            // Validar si el porcentaje de propina es mayor a cero
            if (porcentajePropina > 0) {
                // Calcular el monto de la propina
                double propina = valorCuenta * (porcentajePropina / 100);
                // Mostrar el monto de la propina al usuario
                System.out.println("El monto de la propina a dejar es: " + propina + " pesos.");
                double valorTotal = Math.round(valorCuenta+propina);
                System.out.println("El valor total a pagar es: " +valorTotal+" pesos");
            } else {
                // Mostrar un mensaje de error si el porcentaje de propina no es válido
                System.out.println("Error: El porcentaje de propina debe ser mayor que cero.");
            }
        } else {
            // Mostrar un mensaje de error si el total de la cuenta no es válido
            System.out.println("Error: El total de la cuenta debe ser mayor que cero.");
        }
    }
}
