import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Que tipo de cliente es (R) Residencial o de (N)Negocios? ");
        char tipodeCliente = lector.next().charAt(0);

        double cargoporProcesamiento = 0.0;
        double cargoservicioBasico = 0.0;
        double costoCanalesPremium = 0.0;

        if (tipodeCliente == 'R' || tipodeCliente == 'r') {
            cargoporProcesamiento = 4.50;
            cargoservicioBasico = 20.50;

            System.out.print("¿Cuantos canales premium instalara o contratara? :");
            int canalesPremium = lector.nextInt();
            costoCanalesPremium = canalesPremium * 7.50;

        } else if (tipodeCliente == 'N' || tipodeCliente == 'n') {
            cargoporProcesamiento = 15.00;

            System.out.print("¿Cuántas conexiones básicas (máx. 10) tiene? ");
            int conexionesBasicas = lector.nextInt();
            cargoservicioBasico = conexionesBasicas <= 10 ? 75.00 : 75.00 + (conexionesBasicas - 10) * 5.00;

            System.out.print("¿Cuántos canales Premium desea instalar? ");
            int canalesPremium = lector.nextInt();
            costoCanalesPremium = canalesPremium * 50.00;
        } else {
            System.out.println("Tipo de cliente no válido.");
            lector.close();
            return;
        }

        double totalFactura = cargoporProcesamiento + cargoservicioBasico + costoCanalesPremium;

        System.out.println(" Cargo total por procesamiento de la factura: C$" + cargoporProcesamiento);
        System.out.println(" Cargo total por servicio básico: C$" + cargoservicioBasico);
        System.out.println("Costo total  de canales Premium: C$" + costoCanalesPremium);
        System.out.println("Total a pagar : C$" + totalFactura);

    lector.close();
    }
}
