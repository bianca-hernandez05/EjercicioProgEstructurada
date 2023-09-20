import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numEmpleados = 3;
        byte intentos = 1 , intentoMaximo = 3;

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.println("Empleado numero" + i);
            
            if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentoMaximo - intentos) + " Intentos");
            }
    
          intentos++;
          
          if(intentos == intentoMaximo){
            
          System.out.println("No le quedan mas intentos ");
          }

            System.out.print("Horas trabajadas del empleado: ");
            int horasTrabajadas = lector.nextInt();

            System.out.print("Tarifa por hora en córdobas (moneda nacional): ");
            double tarifaPorHora = lector.nextDouble();
       
            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("el sueldo bruto del empleado numero es: " + i + ": C$" + sueldoBruto);
        }

        lector.close();
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        double sueldoBruto = 0.0;

        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            int horaslaborales = 40;
            int horasExtras = horasTrabajadas - 40;
            sueldoBruto = (horaslaborales * tarifaPorHora) + (horasExtras * (tarifaPorHora * 1.5));
        }

        return sueldoBruto;
    }
}
