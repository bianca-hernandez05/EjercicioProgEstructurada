import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int c, d, suma_numeros_pares, suma_Cuadrados_Impares, cuadrado;
        byte intentos = 1 , intentoMaximo = 3;

        System.out.print("Ingrese el primer número: ");
        c = lector.nextInt();

        System.out.print("Ingrese el segundo número : ");
        d = lector.nextInt();

        suma_numeros_pares = 0;
        
        suma_Cuadrados_Impares = 0;


        while (c < d) {
            System.out.println("Número: " + c);

            cuadrado = c * c;
            System.out.println("Cuadrado: " + cuadrado);

            if (c % 2 != 0) {
                suma_Cuadrados_Impares = suma_Cuadrados_Impares + cuadrado;
                System.out.println("Es impar.");
            }

            if (c % 2 == 0) {
                suma_numeros_pares += c;
                System.out.println("Es par.");
            }

            esNumeroPerfecto(c);

            esNumeroPrimo(c);

            c= c + 1 ;

        }
        if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }

      intentos++;
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }
        System.out.println("Suma de números pares: " + suma_numeros_pares);
        System.out.println("Suma de cuadrados de números impares: " + suma_Cuadrados_Impares);

        lector.close();
    }

    public static void esNumeroPerfecto(int num) {
        if (num <= 1) {
            System.out.println(num + " no es perfecto.");
        } else {
            int sumaDivisores = 0;
            int contador = 1;
             int esPerfecto = 0;
            while (contador < num) {
                if (num % contador == 0) {
                    sumaDivisores += contador;
                }
                contador= contador + 1;
            }
            if (sumaDivisores == num) {
                esPerfecto = num;
            }
            if (esPerfecto != 0) {
                System.out.println(esPerfecto + " es perfecto.");
            }
        }
    }

    public static void esNumeroPrimo(int num) {
        if (num <= 1) {
            System.out.println(num + " no es primo.");
        } else {
            int contadorDivisores = 0;
            int contador = 2;
            while (contador <= Math.sqrt(num)) {
                if (num % contador == 0) {
                    contadorDivisores++;
                }
                contador=contador+1;
            }
            if (contadorDivisores == 0) {
                System.out.println(num + " es primo.");
            }
        }
    }
}