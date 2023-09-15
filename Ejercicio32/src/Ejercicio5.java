import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {

        int num, suma;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        num = lector.nextInt();

         boolean esNegativo = false;
         
         if (num < 0) {
            esNegativo = true;
            num = Math.abs(num);
        }

          suma = 0;

         do {
            int digito = num % 10;
            System.out.print(digito + " ");
            suma += digito;
            num /= 10;
         } while (num > 0);

        System.out.println("La suma de los dígitos es: " + suma);
         lector.close();

    }
}