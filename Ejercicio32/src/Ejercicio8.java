import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double longitud, ancho, costoPintura, costoMarco,   costoTotal, costoCoronas;
        char tipoMarco, agregarCoronas, agregarcarton, agregarvidrio;
        String colorMarco;
        double costoCarton = 0;
        double costoVidrio = 0;
        byte intentos =1 ,intentoMaximo = 3;

        System.out.print("ingrese la longitud de la fotografía en pulgadas: ");
        longitud = lector.nextDouble();

        System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
        ancho = lector.nextDouble();

        System.out.print("Ingrese el tipo de marco (regular o lujoso) (R/L): ");
        tipoMarco = lector.next().charAt(0);

        costoMarco = 0;

        switch (tipoMarco) {
            case 'R':
                costoMarco = 0.15 * (2 * longitud + 2 * ancho);

                System.out.print(" color del marco : ");
                 colorMarco = lector.next();

                costoPintura = 0;

                if (colorMarco != "blanco") {
                    costoPintura = 0.10 * (2 * longitud + 2 * ancho);
                }

                System.out.print("¿agregara corona a su fotografia? (S/N): ");
                agregarCoronas = lector.next().charAt(0);
                costoCoronas = 0;

                if (agregarCoronas == 'S') {
                    System.out.print("Ingrese el número de coronas: ");
                    int numeroCoronas = lector.nextInt();
                    costoCoronas = 0.35 * numeroCoronas;
                }
                System.out.print("¿agregara carton al marco? (S/N): ");
                agregarcarton = lector.next().charAt(0);
                

                if (agregarcarton == 'S') {
                    System.out.print("Ingrese el número de coronas: ");
                    costoCarton = 0.02 * (longitud * ancho);

                }

                System.out.print("¿agregara algun tipo de Vidrio al marco? (S/N): ");
                agregarvidrio = lector.next().charAt(0);

                if (agregarvidrio == 'S') {
                    costoVidrio = 0.07 * (longitud * ancho);
                }

                costoTotal = costoMarco + costoPintura + costoCarton + costoVidrio + costoCoronas;
                System.out.println("El costo final de enmarcar la fotografía con costo regular es de: U$" + costoTotal);
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
                }
        
              intentos++;
              if(intentos == intentoMaximo){
                
              System.out.println("No le quedan mas intentos ");
              }
                break;

            case 'L':

                costoMarco = 0.25 * (2 * longitud + 2 * ancho);
                System.out.print(" color del marco : ");
                colorMarco = lector.next();
                costoPintura = 0;

                if (colorMarco != "blanco") {
                    costoPintura = 0.10 * (2 * longitud + 2 * ancho);
                }

                System.out.print("¿agregara alguna corona a su marco? (S/N): ");
                agregarCoronas = lector.next().charAt(0);
                costoCoronas = 0;

                if (agregarCoronas == 'S') {
                    System.out.print("Ingrese el número de coronas que llevara su marco: ");
                    int numeroCoronas = lector.nextInt();
                    costoCoronas = 0.35 * numeroCoronas;
                }
                System.out.print("¿agregara carton al marco? (S/N): ");
                agregarcarton = lector.next().charAt(0);
                

                if (agregarcarton == 'S') {
                    System.out.print("Ingrese el número de coronas: ");

                    costoCarton = 0.02 * (longitud * ancho);

                }

                System.out.print("¿agregara vidrio a su marco? (S/N): ");
                agregarvidrio = lector.next().charAt(0);

                if (agregarvidrio == 'S') {

                    costoVidrio = 0.07 * (longitud * ancho);
                }
                costoTotal = costoMarco + costoPintura + costoCarton + costoVidrio + costoCoronas;
                System.out.println("El costo final de enmarcar la fotografía con un marco lujoso es de: U$" + costoTotal);
                if(intentos <3){

                    System.out.println("Intentelo nuevamente : ");
                    System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
                }
              intentos++;
              if(intentos == intentoMaximo){
              System.out.println("No le quedan mas intentos ");
              }
                break;
            default:
                System.out.println("FIN .");

                break;
        }

        lector.close();
    }
}