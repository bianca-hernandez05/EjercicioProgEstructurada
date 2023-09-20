import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        double valor1, valor2,valor3;
        byte intentos = 1 , intentoMaximo = 3;

        System.out.println("Ingrese el valor de los 3 lados:");
        System.out.print("valor 1: ");
        valor1 = lector.nextDouble();

        System.out.print("valor 2: ");
        valor2 = lector.nextDouble();

        System.out.print("valor 3: ");
         valor3 = lector.nextDouble(); // la suma de los cuadrados de los catetos dara la hipotenusa , aplicando pitagoras

         if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }

      intentos++;
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }else{
        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("es equilatero.");
        } else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
            System.out.println("Es ISOSCELES.");

        } else if (Math.pow(valor1, 2) + Math.pow(valor2, 2) == Math.pow(valor3, 2)) {
            System.out.println("Es un rectangulo");
        } else {
            System.out.println("Es un escaleno.");
        }

        lector.close();

    }
}
}