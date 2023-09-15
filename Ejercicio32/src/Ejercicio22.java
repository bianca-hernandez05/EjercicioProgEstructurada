import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random rd = new Random();

        do {
            int numero = rd.nextInt(50) + 1;
            int intentos = 0;

            System.out.println("Adivina un numero en un rango de 1 a 50.");

            while (intentos < 3) {
                System.out.print("Intento " + (intentos + 1) + ": ");
                int intento = lector.nextInt();

                if (intento < numero) {
                    System.out.println("Demasiado bajo, intentalo de nuevo.");
                } else if (intento > numero) {
                    System.out.println("Demasiado alto , vuelvelo a intentar.");
                } else {
                    System.out.println("¡Felicidades estimado Adivinaste el numero!");
                    break;
                }

                intentos++;
            }

            if (intentos == 3) {
                System.out.println("Lo siento se han acabado tus intentos ¡sera en la proxima!. El número era " + numero + ".");
            }

            System.out.print("¿Desea jugar otra vez? (S para sí, N para no): ");
        } while (lector.next().equalsIgnoreCase("S"));
        
        
        lector.close();
    }
}