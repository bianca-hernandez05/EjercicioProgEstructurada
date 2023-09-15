import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el sistema numerico original :");
        System.out.println("1. Binario");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");
        System.out.print("Ingrese el número correspondiente al sistema numerico original : ");
        int sistemaOrigen = scanner.nextInt();

        System.out.println("Seleccione el sistema al que desea convertir el numero original :");
        System.out.println("1. Binario");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");
        System.out.print("Ingrese el número correspondiente al sistema de destino : ");
        int sistemaDestino = scanner.nextInt();

        System.out.print("Ingrese el número que va a convertir: ");
        String numero = scanner.next();

        String resultado = "";

        switch (sistemaOrigen) {
            case 1:
                resultado = binarioA(sistemaDestino, numero);
                break;
            case 2:
                resultado = octalA(sistemaDestino, numero);
                break;
            case 3:
                resultado = decimalA(sistemaDestino, numero);
                break;
            case 4:
                resultado = hexadecimalA(sistemaDestino, numero);
                break;
            default:
                System.out.println("Sistema numérico de origen no válido.");
                return;
        }

        System.out.println("Número que va a convertir : " + numero);
        System.out.println("Resultado final de su conversion : " + resultado);

        scanner.close();
    }

    public static String binarioA(int sistemaDestino, String numero) {
        int decimal = Integer.parseInt(numero, 2);
        return convertirADestino(sistemaDestino, decimal);
    }

    public static String octalA(int sistemaDestino, String numero) {
        int decimal = Integer.parseInt(numero, 8);
        return convertirADestino(sistemaDestino, decimal);
    }

    public static String decimalA(int sistemaDestino, String numero) {
        int decimal = Integer.parseInt(numero);
        return convertirADestino(sistemaDestino, decimal);
    }

    public static String hexadecimalA(int sistemaDestino, String numero) {
        int decimal = Integer.parseInt(numero, 16);
        return convertirADestino(sistemaDestino, decimal);
    }

    public static String convertirADestino(int sistemaDestino, int decimal) {
        switch (sistemaDestino) {
            case 1:
                return Integer.toBinaryString(decimal);
            case 2:
                return Integer.toOctalString(decimal);
            case 3:
                return Integer.toString(decimal);
            case 4:
                return Integer.toHexString(decimal).toUpperCase();
            default:
                return "Sistema numérico de destino no válido.";
        }
    }
}