import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numeroCuenta;
        double saldoActual, saldoMinimo, saldoNuevo;
        char tipoCuenta;

        for (int f = 0; f < 5; f++) {
            System.out.println("ingrese cliente " + (f + 1));

            System.out.print(" ingrese Número de cuenta: ");
            numeroCuenta = lector.nextInt();

            System.out.print("Tipo de cuenta (S / C): ");
            tipoCuenta = lector.next().charAt(0);

            System.out.print("ingrese Saldo mínimo requerido: ");
            saldoMinimo = lector.nextDouble();

            System.out.print("ingrese Saldo actual: ");
            saldoActual = lector.nextDouble();

             saldoNuevo = saldoActual;

            switch (tipoCuenta) {
                case 'S':
                case 's':
                    if (saldoActual < saldoMinimo) {
                        saldoNuevo = saldoNuevo - 10;
                    }
                    saldoNuevo = saldoNuevo * 0.04;
                    break;
                case 'C':
                case 'c':
                    if (saldoActual < saldoMinimo) {
                        saldoNuevo = saldoNuevo - 25;
                    }
                    if (saldoActual <= saldoMinimo + 5000) {
                        saldoNuevo = saldoNuevo * 0.03;
                    } else {
                        saldoNuevo = saldoNuevo * 0.05;
                    }
                    break;
                default:
                    System.out.println("El tipo de cuenta no es valido .");

            }

            System.out.print(" su numero de Número de cuenta es: " + numeroCuenta);
            System.out.print("su Tipo de cuenta es: " + tipoCuenta);
            System.out.print("Su Saldo actual es de: U$" + saldoActual);
            System.out.print("Su Saldo nuevo es de : U$" + saldoNuevo);
        }
        lector.close();
    }
}
