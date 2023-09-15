import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

         int ROSQUILLAS_x_CAJA = 24;
         int CAJAS_x_CONTENEDOR = 75;
         int totalRosquillas , cajasNecesarias, rosquillasSobrantes, contenedoresNecesarios, cajasSobrantes;


        System.out.print("Ingrese cual es el numero total de rosquillas : ");
         totalRosquillas = lector.nextInt();

         cajasNecesarias = totalRosquillas / ROSQUILLAS_x_CAJA;
         rosquillasSobrantes = totalRosquillas % ROSQUILLAS_x_CAJA;
         contenedoresNecesarios = cajasNecesarias / CAJAS_x_CONTENEDOR;
         cajasSobrantes = cajasNecesarias % CAJAS_x_CONTENEDOR;

        System.out.println("Número de cajas necesarias: " + cajasNecesarias);
        System.out.println("Número de contenedores necesarios: " + contenedoresNecesarios);
        System.out.println("Rosquillas sobrantes en la última caja: " + rosquillasSobrantes);
        System.out.println("Cajas sobrantes en el último contenedor: " + cajasSobrantes);

        lector.close();
    } 

}