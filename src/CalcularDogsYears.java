import java.util.Scanner;
public class CalcularDogsYears {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        //Titulo
        System.out.println("¿CONOCES LA EDAD REAL DE TU PERRO?");
        //Explicación
        System.out.println("\n\nUna leyenda urbana muy popularizada en torno al mundo canino nos asegura que un año de existencia de un perro equivale a siete años en la edad humana; " +
                "no es exactamente así, este cálculo carece de fundamento científico, más allá de ser un método popular para realizar una conjetura aproximada.");
        //Valor agregado.
        System.out.println("\n\nEl siguiente calculo se realiza a partir de los estudios de la Universidad de California.");
        // Pedimos al usuario que ingrese la edad del perro en años humanos
        System.out.print("\nIngresa la edad del perro en años humanos: ");
        //declaramos variables
        int edadPerro = usuario.nextInt();
        int edadPerroCalculada;

        //creamos el condicional que tomara la variable edadPerro y se hara sus operaciones matematicas.
        if (edadPerro <= 0) {
            System.out.println("La edad del perro debe ser mayor que cero.");
            return;
        } else if (edadPerro > 1) {
            edadPerroCalculada = ((edadPerro-1)*4)+15;
        } else {
            edadPerroCalculada = 15;
        }

        // Mostramos la edad del perro calculada
        System.out.println("La edad del perro, en años perro es: " + edadPerroCalculada + " años");
    }
}