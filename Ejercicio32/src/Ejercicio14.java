import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);

        int litros = 0, kilometros = 0 ;
        double total;
        byte intentos = 0 ,intentoMaximo = 3;

        do{
        System.out.println("ingrese cantidad de litros de combustible consumidos en el viaje : ");
        litros = lector.nextInt();
        }while(litros <=0 || litros>100);

        do{
            System.out.println(" ingrese cuantos kilometros recorrrio en su viaje ;  ");
            kilometros = lector.nextInt();
        }while(kilometros<=0 || kilometros>500);

        total = litros / kilometros * 100;

        if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }
    
      intentos++;
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }
        System.out.println("Los kilometros por litro son " +total);


        lector.close();
    }
    
}