import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        int numeroDeCuenta, valorInicial, cargoTotal, creditoTotal,limitedeCredito,nuevoBalance;
         byte intentos =1 ,intentoMaximo = 3;        
        
          System.out.println(" número de cuenta del cliente:");
          numeroDeCuenta = lector.nextInt();
        
          System.out.println(" saldo inicial del cliente:");
          valorInicial = lector.nextInt();
   
          System.out.println(" total de todos los artículos cobrados por el cliente en el mes:");
          cargoTotal = lector.nextInt();
     
          System.out.println(" total de todos los créditos aplicados a la cuenta del cliente en el mes:");
          creditoTotal = lector.nextInt();
   
          System.out.println("límite de crédito permitido del cliente:");
          limitedeCredito = lector.nextInt();
      
          nuevoBalance = valorInicial + cargoTotal - creditoTotal;

          if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
      }
      intentos++;
      
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }

          System.out.println("El saldo actual de cliente es de : " + nuevoBalance);
           System.out.println("El estado o numero de cuenta del cliente es de : " + numeroDeCuenta);
        
        if (nuevoBalance > limitedeCredito) {
            System.out.println("¡Se ha superado el limite de credito!");
        }

        lector.close();
    }
}
    