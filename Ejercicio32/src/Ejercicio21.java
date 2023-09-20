import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        byte intentos = 1 , intentoMaximo = 2;

        int año;

        System.out.print("Ingrese un año en el rango de 1994 a 1999: ");
        año = lector.nextInt();

        if (año >= 1994 && año <= 1999) {
            generarCalendario(año);
        } else {
            System.out.println("Año fuera del rango establecido : ");
        }

        if(intentos <3){

            System.out.println("Intentelo nuevamente : ");
            System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
        }

      intentos++;
      
      if(intentos == intentoMaximo){
        
      System.out.println("No le quedan mas intentos ");
      }

        lector.close();
    }

    

    public static void generarCalendario(int año) {
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Mes " + mes + " - " + año);

            int diasEnMes = DiasEnMes(mes, año);
            System.out.println("L   M   M   J   V   S   D");

            int diaSemana = 1;
            for (int i = 1; i < DiaDeSemana(1, mes, año); i++) {
                System.out.print("    ");
                diaSemana++;
            }

            for (int dia = 1; dia <= diasEnMes; dia++) {
                if (dia < 10) {
                    System.out.print(" " + dia + "  ");
                } else {
                    System.out.print(dia + "  ");
                }
                if (diaSemana == 7) {
                    System.out.println();
                    diaSemana = 0;
                }

                diaSemana++;
            }

            System.out.println(); 
        }
    }

    public static int DiasEnMes(int mes, int año) {
        int[] diasEnMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && esunAñoBisiesto(año)) {
            return 29;
        }
        return diasEnMes[mes];
    }

    public static int DiaDeSemana(int dia, int mes, int año) {
        if (mes < 3) {
            mes += 12;
            año -= 1;
        }

        int g = año % 100;
        int h = año / 100;

        int diaSemana = (dia + (13 * (mes + 1)) / 5 + g + (g / 4) + (h / 4) - (2 * h)) % 7;
        return (diaSemana + 5) % 7 + 1;
    }

    public static boolean esunAñoBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}