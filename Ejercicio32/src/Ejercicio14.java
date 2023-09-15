import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);

        int litros = 0, kilometros = 0 ;
        double total;

        do{
        System.out.println("ingrese cantidad de litros de combustible consumidos en el viaje : ");
        litros = lector.nextInt();
        }while(litros <=0 || litros>100);

        do{
            System.out.println(" ingrese cuantos kilometros recorrrio en su viaje ;  ");
            kilometros = lector.nextInt();
        }while(kilometros<=0 || kilometros>500);

        total = litros / kilometros * 100;

        System.out.println("Los kilometros por litro son " +total);


        lector.close();
    }
    
}