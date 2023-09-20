import java.util.Scanner;

public class Ejercicio32 {
    
public static void main(String[] args) {
   Scanner lector = new Scanner (System.in);

    int c,d;
    byte intentoMaximo = 3, intentos = 1;

    System.out.println ("Ingrese un numero entero menor: ");
      c = lector.nextInt();
    
    System.out.println("Ingrese un numero entero Mayor: ");
      d = lector.nextInt();

      if (c < d) {
        if(intentos <3){

          System.out.println("Intentelo nuevamente : ");
          System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
    }
    intentos++;
    if(intentos == intentoMaximo){
      
    System.out.println("No le quedan mas intentos ");
    }
} else{
        System.out.println ("El valor de C debe de ser menor que al valor de D : ");
      } 
   
      int Suma_par = 0;
      int Suma_cuadra_impar = 0;
     
      for (int num = c; num <= d; num++) {
        
        if (num % 2 == 1) {
          System.out.println(num + " su resultado es impar");
          Suma_cuadra_impar += num * num;
        }
        else {
          Suma_par += num;
          return;
        }

        System.out.println(num + " elevado al cuadrado es " + (num * num));

      int Igualsuma_divisor = 0;

      for (int p = 1; p < num; p++) {
        if (num % p == 0) {
          Igualsuma_divisor = + p;
        }
      }
      if (num == Igualsuma_divisor) {
        System.out.println(num + " es un numero perfecto");
      }

      int cantidad_divisor = 0;
      for (int j = 1; j <= num; j++) {
        if (num % j == 0) {
          cantidad_divisor++;
        }
      }
      if (cantidad_divisor == 2) {
        System.out.println(num + " es un numero primo");
      }
    }
    if(intentos <3){

      System.out.println("Intentelo nuevamente : ");
      System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
}
intentos++;
if(intentos == intentoMaximo){
  
System.out.println("No le quedan mas intentos ");
}

    System.out.println("La suma de los números pares  son " + c + " + " + d + " = " + Suma_par);
    System.out.println("La suma de los cuadrados de los números impares son " + c + " + " + d + " = " + Suma_cuadra_impar);

 lector.close();
  
  }

}
