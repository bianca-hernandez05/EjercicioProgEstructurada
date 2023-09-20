import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

      double montodelPrestamo,tasaInteresAnual,tasaInteresMensual, pagoCapital, pagoMensual;
      int meses = 0;
      byte intentos = 1 , intentoMaximo = 3 ;
        Scanner lector = new Scanner(System.in);

        
          System.out.print("Ingrese el monto del prestamo  (en moneda nacional): ");
          montodelPrestamo = lector.nextDouble();

          System.out.print("ingrese su tasa de interes anual (en porcentaje): ");
          tasaInteresAnual = lector.nextDouble();

          System.out.print("ingrese el pago mensual (en moneda nacional): ");
          pagoMensual = lector.nextDouble();

          tasaInteresMensual = (tasaInteresAnual / 12) / 100;
 
        while (montodelPrestamo > 0) {
            
              double interesMensual = montodelPrestamo * tasaInteresMensual;
              pagoCapital = pagoMensual - interesMensual;
              montodelPrestamo = pagoCapital;

              if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
              }
          intentos++;
          
          if(intentos == intentoMaximo){
            
          System.out.println("No le quedan mas intentos ");
          }else{
                   
            if (pagoMensual <= interesMensual) {
                System.out.println("el pago mensual esta por debajo de lo estimado , por tanto no se pagara en poco tiempo.");
                break;
                
            }

            meses++;
    
            if (montodelPrestamo <= 0) {
                break;
            }
        

        if (montodelPrestamo <= 0) {
            System.out.println("El pago se pagara en un total de : " + meses + " meses.");
        }
      }
        lector.close();
    }
  }
}