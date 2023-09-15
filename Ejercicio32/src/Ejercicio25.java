import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String contra;
        String confirmacion;

        do {
            System.out.print("Ingrese una contraseña que contenga de 6 a 10 caracteres: ");
            contra = lector.nextLine();
        } while (!validarContra(contra));

        do {
            System.out.print("Confirme su contraseña: ");
            confirmacion = lector.nextLine();
        } while (!contra.equals(confirmacion));

        System.out.println("Bienvenido ha podido ingresar con exito: !");

        lector.close();
    }

    public static boolean validarContra(String contra) {
        int Caracterminimo = 6;
        int CaracterMaximo = 10;

        
        if (contra.length() < Caracterminimo || contra.length() > CaracterMaximo ){
            System.out.println("La contraseña tiene que tener un rango entre " + Caracterminimo + " y " + CaracterMaximo + " caracteres.");
            return false;
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;

        for (char caracter : contra.toCharArray()) {
            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        if (!tieneLetra || !tieneDigito) {
            System.out.println("La contraseña por lo menos debe de contener letras y numeros para mayor seguridad : ");
            return false;
        }

        return true;
    }
}