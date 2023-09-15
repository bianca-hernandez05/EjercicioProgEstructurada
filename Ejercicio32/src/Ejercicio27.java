import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioAnual;
        int Antiguedad;

        System.out.print("Ingrese el salario anual del empleado: U$");
        salarioAnual = scanner.nextDouble();

        System.out.print("Ingrese los años de antigüedad del empleado: ");
        Antiguedad = scanner.nextInt();

    
         double porcentajedeAntiguedad = 0.0;

        if (Antiguedad == 1) {
            porcentajedeAntiguedad = 0.03;
        } else if (Antiguedad >= 2 && Antiguedad <= 20) {
            porcentajedeAntiguedad = (Antiguedad * 2 + 1) / 100.0;
        } else if (Antiguedad >= 21 && Antiguedad <= 30) {
            porcentajedeAntiguedad = 0.50;
        } else if (Antiguedad > 30) {
            porcentajedeAntiguedad = 0.60;
        }

        double IR = 0.0;

        if (salarioAnual <= 100000) {
            IR = 0.0;
        } else if (salarioAnual <= 200000) {
            IR = 0.15;
        } else if (salarioAnual <= 350000) {
            IR = 0.20;
        } else if (salarioAnual <= 500000) {
            IR = 0.25;
        } else {
            IR = 0.30;
        }

        double salarioNetoAnual = salarioAnual - (salarioAnual * IR) + (salarioAnual * porcentajedeAntiguedad);
        double salarioNetoMensual = salarioNetoAnual / 12.0;

        System.out.println("El salario neto mensual del empleado es: U$" + salarioNetoMensual);

        scanner.close();
    }
}