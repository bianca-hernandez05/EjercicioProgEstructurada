
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Entrada;

        System.out.print("Digite Tres palabras : ");
        Entrada = scanner.nextLine();

        String[] palabras = Entrada.split(" ");

        if (palabras.length < 3) {
            System.out.println("Ingrese al menos tres palabras .");
        } else {
            StringBuilder Acronimo = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                String palabra = palabras[i];
                char primeraLetra = palabra.charAt(0);
                Acronimo.append(Character.toUpperCase(primeraLetra));
            }

            System.out.println("Su acronimo es : " + Acronimo.toString());
        }

        scanner.close();
    }
}