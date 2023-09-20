import java.util.Scanner;

public class Ejercicio31 {
    
public static void main(String args []) {
   Scanner lector = new Scanner (System.in);

   byte intentoMaximo = 3, intentos = 1;

   System.out.println("Ingrese un número entero positivo grande: ");
   long numero = lector.nextLong();

   if (numero <= 0) {
    System.out.println("El número siempre debe ser positivo");
    
    if(intentos <3){

      System.out.println("Intentelo nuevamente : ");
      System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
}
intentos++;
if(intentos == intentoMaximo){
  
System.out.println("No le quedan mas intentos ");
}

  
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

