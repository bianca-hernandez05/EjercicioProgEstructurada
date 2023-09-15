import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension;

        do {
            System.out.println("Seleccione la dimensión de los vectores a calcular:");
            System.out.println("1. Vectores en 2D (Bidimensional)");
            System.out.println("2. Vectores en 3D (Tridimensional)");
            System.out.print("Ingrese el número correspondiente a la dimension del vector: ");
             dimension = scanner.nextInt();

            if (dimension == 2 || dimension == 3) {
                System.out.print("Ingrese las coordenadas del primer vector: ");
                 double[] vector1 = leerVector(dimension, scanner);

                System.out.print("Ingrese las coordenadas del segundo vector: ");
                double[] vector2 = leerVector(dimension, scanner);

                System.out.println("Seleccione la operación que desea realizar:");
                System.out.println("1. Suma de vectores");
                System.out.println("2. Resta de vectores");
                System.out.println("3. Opuesto de un vector");
                System.out.println("4. Producto de un escalar por un vector");
                System.out.println("5. Producto punto o producto escalar entre vectores");
                System.out.println("6. Determinar si son vectores paralelos");
                System.out.println("7. Determinar si son vectores ortogonales");
                System.out.println("8. Determinar la proyección de un vector sobre otro vector");
                System.out.println("9. Producto vectorial o producto cruz");
                System.out.print("Ingrese el número correspondiente a la operación: ");
                int operacion = scanner.nextInt();

                switch (operacion) {
                    case 1:
                        double[] suma = sumaVectores(vector1, vector2);
                        imprimirVector(suma);
                        break;
                    case 2:
                        double[] resta = restaVectores(vector1, vector2);
                        imprimirVector(resta);
                        break;
                    case 3:
                        double[] opuesto = opuestoVector(vector1);
                        imprimirVector(opuesto);
                        break;
                    case 4:
                        System.out.print("Ingrese el escalar: ");
                        double escalar = scanner.nextDouble();
                        double[] productoEscalar = productoEscalar(vector1, escalar);
                        imprimirVector(productoEscalar);
                        break;
                    case 5:
                        double productoPunto = productoPunto(vector1, vector2);
                        System.out.println("Producto Punto: " + productoPunto);
                        break;
                    case 6:
                        boolean sonParalelos = sonVectoresParalelos(vector1, vector2);
                        System.out.println("Son vectores paralelos: " + sonParalelos);
                        break;
                    case 7:
                        boolean sonOrtogonales = sonVectoresOrtogonales(vector1, vector2);
                        System.out.println("Son vectores ortogonales: " + sonOrtogonales);
                        break;
                    case 8:
                        double[] proyeccion = proyeccionVector(vector1, vector2);
                        imprimirVector(proyeccion);
                        break;
                    case 9:
                        if (dimension == 3) {
                            double[] productoCruz = productoCruz(vector1, vector2);
                            imprimirVector(productoCruz);
                        } else {
                            System.out.println("El producto cruz solo se puede calcular en 3D.");
                        }
                        break;
                    default:
                        System.out.println("Operación no válida.");
                }
            } else {
                System.out.println("Dimensión no válida. Debe ser 2D o 3D.");
            }

            System.out.print("¿Desea realizar otra operación? (S para sí, N para no): ");
        } while (scanner.next().equalsIgnoreCase("S"));

        scanner.close();
    }

    public static double[] leerVector(int dimension, Scanner scanner) {
        double[] vector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }

    public static void imprimirVector(double[] vector) {
        System.out.print("Resultado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static double[] sumaVectores(double[] vector1, double[] vector2) {
        int dimension = vector1.length;
        double[] suma = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            suma[i] = vector1[i] + vector2[i];
        }
        return suma;
    }

    public static double[] restaVectores(double[] vector1, double[] vector2) {
        int dimension = vector1.length;
        double[] resta = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resta[i] = vector1[i] - vector2[i];
        }
        return resta;
    }

    public static double[] opuestoVector(double[] vector) {
        int dimension = vector.length;
        double[] opuesto = new double[dimension];
        for (int i = 0; i < dimension; i++) {
             opuesto[i] = -vector[i];
        }
        return opuesto;
    }

    public static double[] productoEscalar(double[] vector, double escalar) {
        int dimension = vector.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }

    public static double productoPunto(double[] vector1, double[] vector2) {
        int dimension = vector1.length;
        double producto = 0;
        for (int i = 0; i < dimension; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }

    public static boolean sonVectoresParalelos(double[] vector1, double[] vector2) {
        double productoPunto = productoPunto(vector1, vector2);
        double magnitudVector1 = magnitudVector(vector1);
        double magnitudVector2 = magnitudVector(vector2);
        return Math.abs(productoPunto) == magnitudVector1 * magnitudVector2;
    }

    public static boolean sonVectoresOrtogonales(double[] vector1, double[] vector2) {
        double productoPunto = productoPunto(vector1, vector2);
        return productoPunto == 0;
    }

    public static double[] proyeccionVector(double[] vector1, double[] vector2) {
        double productoPunto = productoPunto(vector1, vector2);
        double magnitudVector2 = magnitudVector(vector2);
        double factor = productoPunto / (magnitudVector2 * magnitudVector2);
        return productoEscalar(vector2, factor);
    }

    public static double[] productoCruz(double[] vector1, double[] vector2) {
        double[] productoCruz = new double[3];
        productoCruz[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        productoCruz[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        productoCruz[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        return productoCruz;
    }

    public static double magnitudVector(double[] vector) {
        double sumaCuadrados = 0;
        for (double componente : vector) {
            sumaCuadrados += componente * componente;
        }
        return Math.sqrt(sumaCuadrados);
    }
}