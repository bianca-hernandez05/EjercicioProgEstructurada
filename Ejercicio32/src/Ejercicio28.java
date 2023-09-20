import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
       Scanner lector = new Scanner (System.in);
       Random rd = new Random ();
       byte intentoMaximo = 3, intentos = 1;
     
   int numero1,numero2,numero3, numeroazar;

   numero1 = rd.nextInt(10);
   numero2 = rd.nextInt(10);
   numero3 = rd.nextInt(10);
   numeroazar = numero1 * 100 + numero2 * 10 + numero3;

   int deduccion = 0;
   int recompensa = 0;

   System.out.println("ingrese tres números entre 0 y 9: ");
   deduccion = lector.nextInt();

   if (deduccion < 0 || deduccion > 999) {
    if(intentos <3){

      System.out.println("Intentelo nuevamente : ");
      System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
}
intentos++;
if(intentos == intentoMaximo){
  
System.out.println("No le quedan mas intentos ");
}
  }else{
     System.out.println("El numero que ingreso no es valido");
     return;
   }

    int deduccion1 = deduccion / 100;
    int deduccion2 = (deduccion / 10) % 10;
    int deduccion3 = deduccion % 10;


    if (deduccion == numeroazar) { 
      recompensa= 1000000;
    }
    else if ((deduccion1 == numero1 && deduccion2 == numero3 && deduccion3 == numero2) || (deduccion1 == numero2 && deduccion2 == numero1 && deduccion3 == numero3) || (deduccion1 == numero2 && deduccion2 == numero3 && deduccion3 == numero1) || (deduccion1 == numero3 && deduccion2 == numero1 && deduccion3 == numero2) || (deduccion1 == numero3 && deduccion2 == numero2 && deduccion3 == numero1)) {
      recompensa = 10000;
    }
    else if ((deduccion1 == numero1 && deduccion2 == numero2) || (deduccion1 == numero1 && deduccion3 == numero3) || (deduccion2 == numero2 && deduccion3 == numero3)) { 
      recompensa = 1000;
    }
    else if (deduccion1 == numero1 || deduccion2 == numero2 || deduccion3 == numero3) { 
      recompensa = 100;
    }
    else { 
      recompensa = 0;
    }

  
    System.out.println("Su suposición fue: " + deduccion);
    System.out.println("El número determinado al azar fue: " + numeroazar);
    System.out.println("Usted ha ganado: C$" + recompensa);
  
   
   lector.close();
      
      }
 }

