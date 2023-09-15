import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
       Scanner lector = new Scanner (System.in);
     
       
    int lugar = 0;
    int horaenCasa = 0;

   String mascota = "";

    
    System.out.println("Indique en que lugar vive 1)apartamento. 2)casa. 3)Dormitorio:  ");
    lugar = lector.nextInt();
   
    if (lugar < 1 || lugar > 3) {
      System.out.println("Opción inválida");
      return;
    }

    System.out.println("Indique la cantidad de horas que está en casa durante el día promedio: ");
    System.out.println("1. 18 o más");
    System.out.println("2. 10-17");
    System.out.println("3. 8-9");
    System.out.println("4. 6-7");
    System.out.println("5. 0-5");
    
    horaenCasa = lector.nextInt();
    if (horaenCasa < 1 || horaenCasa > 5) {
      System.out.println("Opción No valida");
      return;
    }

    switch (lugar) {
      case 1: // el que puede puede (apartamento)
        switch (horaenCasa) {
          case 1: // 10-17 horas en casa
            mascota = "Gato"; // miau miau
            break;
          case 2: // 8-9 horas en casa
          case 3: // 6-7 horas en casa
          case 4: // 0-5 horas en casa
            mascota = "Hamster"; // ratoncito
            break;
        }
        break;
      case 2: // la house (Casa)
        switch (horaenCasa) {
          case 1: // 18 o más horas en casa
            mascota = "Cerdo barrigón";
            break;
          case 2: // 10-17 horas en casa
            mascota = "Perro"; // woof woof
            break;
          case 3: // 8-9 horas en casa
          case 4: // 6-7 horas en casa
          case 5: // 0-5 horas en casa
            mascota = "Serpiente";
            break;
        }
        break;
      case 3: // Dormitorio 
        switch (horaenCasa) {
          case 1: // 18 o más horas en casa
          case 2: // 10-17 horas en casa
          case 3: // 8-9 horas en casa
          case 4: // 6-7 horas en casa
            mascota = "Pez";
            break;
          case 5: // 0-5 horas en casa
            mascota = "Granja de hormigas";
            break;
        }
        break;
    }

    
    System.out.println("La recomendacion de mascota es la siguiente : " + mascota);
      
    
       
       lector.close();
      
      }
 }

