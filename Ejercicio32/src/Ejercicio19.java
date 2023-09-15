import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRecibosAyer = 0;

        System.out.println("Ingrese las horas de estacionamiento para cada cliente (ingrese -1 si desea salir ): ");

        while (true) {
            System.out.print("Horas estacionadas (-1 para salir): ");
            double horasEstacionadas = scanner.nextDouble();

            if (horasEstacionadas == -1) {
                break;
            }

            double cargo = calcularCargo(horasEstacionadas);
            totalRecibosAyer += cargo;

            System.out.printf("Cargo para usted : C$%.2f%n", cargo);
        }

        System.out.printf("Total : C$%.2f%n", totalRecibosAyer);
        scanner.close();
    }

    public static double calcularCargo(double horasEstacionadas) {
        double tarifa = 2.00;
        double tarifaPorHorapasada = 0.50;
        double tarifaMaxima = 10.00;
        double cargo = 0;

        if (horasEstacionadas <= 3) {
            cargo = tarifa;
        } else if (horasEstacionadas <= 24) {
            cargo = tarifa + tarifaPorHorapasada * Math.ceil(horasEstacionadas - 3);
            if (cargo > tarifaMaxima) {
                cargo = tarifaMaxima;
            }
        } else {
            cargo = tarifaMaxima;
        }

        return cargo;
    }
}