import java.util.Scanner;

public class Ejercicio31 {
    
public static void main(String args []) {
   Scanner lector = new Scanner (System.in);

   System.out.println("Ingrese un número entero positivo grande: ");
   long numero = lector.nextLong();

   if (numero <= 0) {
    System.out.println("El número siempre debe ser positivo");
  
  }
  System.out.println("Los posibles numeros o factores primos de " + numero + " son los siguientes: ");

    long FactorPrimo = 2;

    while (numero > 1) {
 
      if (numero % FactorPrimo == 0) {
        System.out.println(FactorPrimo);
        numero /= FactorPrimo;
      } else {
        FactorPrimo++;
      
      }
     }
  
   lector.close();
  
  }

}

