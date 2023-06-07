import java.util.Scanner;

public class CalcularDescuento {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner usuario = new Scanner(System.in);

        // Pedir al usuario el precio original del producto
        System.out.print("Colocar valores decimales con coma, ejemplo (12,9)\nIngresa el precio original del producto: ");
        double precioOriginal = usuario.nextDouble();

        // Validar si el precio original es mayor a cero
        if (precioOriginal > 0) {
            // Pedir al usuario el porcentaje de descuento
            System.out.print("Colocar valores decimales con coma, ejemplo (87,31)\nIngresa el porcentaje de descuento: ");
            double descuento = usuario.nextDouble();

            // Validar si el descuento es mayor a cero
            if (descuento > 0) {
                // Calcular el precio final después de aplicar el descuento
                double precioFinal = Math.round(precioOriginal - ((precioOriginal * descuento) / 100));

                // Mostrar el precio final al usuario
                System.out.println("El precio final después del descuento es: " + precioFinal + " dolares");
            } else {
                System.out.println("Error: El valor del descuento debe ser mayor que cero.");
            }
        } else {
            System.out.println("Error: El valor del precio original debe ser mayor que cero.");
        }
    }
}


