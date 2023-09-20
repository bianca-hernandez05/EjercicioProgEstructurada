import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numeroCuenta, minutosDia, minutosGratis, minutosGratisDia, minutosGratisNoche, minutosNoche;
        double costoMinutoDia, costoMinutoNoche, totalFactura,costoPorMinuto;
        char Servicio;
        byte intentos = 1, intentoMaximo = 3;
        
        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = lector.nextInt();

        System.out.print("Ingrese el servicio que ocupa (regular o premium) (R / P): ");
         Servicio = lector.next().charAt(0);
         
        System.out.print("Ingrese el número de minutos utilizados durante el día: ");
        minutosDia = lector.nextInt();

        System.out.print("Ingrese el número de minutos utilizados durante la noche: ");
        minutosNoche = lector.nextInt();

         totalFactura = 0;

        switch (Servicio) {
            case 'R':
            case 'r':
                minutosGratis = 50;
                 costoPorMinuto = 0.20;

                if (minutosDia > minutosGratis) {
                    totalFactura = (minutosDia - minutosGratis) * costoPorMinuto;
                }

                if (minutosNoche > minutosGratis) {
                    totalFactura = (minutosNoche - minutosGratis) * costoPorMinuto;
                }

                totalFactura = totalFactura + 10;

                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
                }
        
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }else{

                System.out.println("su Número de cuenta: " + numeroCuenta);
                System.out.println(" su Tipo de servicio: Regular");
                System.out.println("Los minutos que usted utilizo durante el dia es de : " + minutosDia);
                System.out.println("Los minutos que usted utilizo durante la noche es de : " + minutosNoche);
                System.out.println("Su Total a pagar es de : " + totalFactura);
              }
                break;

            case 'P':
            case 'p':

                minutosGratisDia = 75;
                minutosGratisNoche = 100;
                costoMinutoDia = 0.10;
                costoMinutoNoche = 0.05;

                if (minutosDia > minutosGratisDia) {
                    totalFactura = (minutosDia - minutosGratisDia) * costoMinutoDia;
                }

                if (minutosNoche > minutosGratisNoche) {
                    totalFactura = (minutosNoche - minutosGratisNoche) * costoMinutoNoche;
                }

                totalFactura = totalFactura + 25;

                System.out.println("Su Número de cuenta: " + numeroCuenta);
                System.out.println(" Su tipo Tipo de servicio: Premium");
                System.out.println("los minutos que usted utilizo durante el dia es de : " + minutosDia);
                System.out.println("Los Minutos que usted utilizo durante la noche es de : " + minutosNoche);
                System.out.println("Su Total a pagar es de: " + totalFactura);

                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
                }
        
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }else{
            }
                break;

            default:
                System.out.println("¡FIN , DATO NO VALIDO! .");

        }

        lector.close();
    }
}