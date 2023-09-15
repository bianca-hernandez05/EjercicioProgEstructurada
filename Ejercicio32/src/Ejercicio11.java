import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

      double montodelPrestamo,tasaInteresAnual,tasaInteresMensual, pagoCapital, pagoMensual;
      int meses = 0;
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
                      
            if (pagoMensual <= interesMensual) {
                System.out.println("el pago mensual esta por debajo de lo estimado , por tanto no se pagara en poco tiempo.");
                break;
            }

            meses++;
    
            if (montodelPrestamo <= 0) {
                break;
            }
        }

        if (montodelPrestamo <= 0) {
            System.out.println("El pago se pagara en un total de : " + meses + " meses.");
        }
        lector.close();
    }
}