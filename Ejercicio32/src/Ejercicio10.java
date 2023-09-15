import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
      char sexo;
      double A1,A2,A3,A4,A5,b,pesoCorporalkg,pesoCorporalLb, medidaMuneca = 0 ; 
      double medidaCintura,medidaCadera,medidaAntebrazo,grasaCorporalkg = 0,porcentajeGrasaCorporalkg = 0;
      double porcentajeGrasaCorporalLb = 0,grasaCorporalLB = 0;

      Scanner lector = new Scanner(System.in);
      System.out.println ("En el programa se mostrara resultados sobre masa corporal por favor ingrese cual es su sexo f/m (femenino o masculino)");
      sexo = lector.next().charAt(0);

      switch (sexo) {
        case 'f':
    
          do{
          System.out.println("Cual es su peso corporal");
          pesoCorporalkg = lector.nextDouble();
          }while(pesoCorporalkg>=0 || pesoCorporalkg<250);
          A1 = (pesoCorporalkg * 0.732) + 8.987;

          do{
          System.out.println("Cual es la medida de su muñeca (en el punto mas amplio): ");
          medidaMuneca = lector.nextDouble();
          }while(medidaMuneca>=0 || medidaMuneca<50);
          A2 = medidaMuneca / 3.140;

          do{
          System.out.println("Cual es la medida de su cintura (en el ombligo)");
          medidaCintura = lector.nextDouble();
          }while(medidaCintura>=0 || medidaCintura<150);

          A3= medidaCintura * 0.157;
          
          do{
          System.out.println("Cual es la medida de la cadera (en el punto mas amplio)");
          medidaCadera = lector.nextDouble();
          }while(medidaCadera>=0 || medidaCadera<200);
          A4=medidaCadera * 0.249;

          do{
          System.out.println("Mediada del antebrazo (en el punto mas amplio)");
          medidaAntebrazo = lector.nextDouble();
          }while(medidaAntebrazo>=0 || medidaAntebrazo<90);
          A5= medidaAntebrazo * 0.434;

          b=A1 + A2 -A3 - A4 + A5;
          grasaCorporalkg = pesoCorporalkg - b ;
          porcentajeGrasaCorporalkg = (grasaCorporalkg * 100) / pesoCorporalkg;
          grasaCorporalLB = grasaCorporalkg * 2.2;
          porcentajeGrasaCorporalLb = porcentajeGrasaCorporalkg * 2.2;
          
          
            System.out.println("Su grasa corporal en KG es " +grasaCorporalkg);
            System.out.println("Su grasa corporal en Lb es " +grasaCorporalLB);
            System.out.println("Su porcetaje de grasa corporal en Kg es " +porcentajeGrasaCorporalkg);
            System.out.println("Su porcentaje de grasa corporal en LB es " +porcentajeGrasaCorporalLb);
        

            break;

        case 'm':

         do{
          System.out.println("Cual es su peso corporal");
          pesoCorporalkg = lector.nextDouble();
         }while(pesoCorporalkg>=0 || pesoCorporalkg<250);

          A1= (pesoCorporalkg * 1.082)+94.42;

          do{
          System.out.println("Cual es la medida de su cintura");
          medidaCintura = lector.nextDouble();
          }while(medidaCintura>=0 || medidaCintura<300);
          A2= medidaCintura * 4.15;
          
          b= A1- A2;
          
          pesoCorporalLb = pesoCorporalkg * 2.2;
          grasaCorporalkg = pesoCorporalkg - b;
          porcentajeGrasaCorporalkg = (grasaCorporalkg * 100) / pesoCorporalkg;
          grasaCorporalLB = pesoCorporalLb - b;
          porcentajeGrasaCorporalLb = (grasaCorporalLB * 100) / pesoCorporalLb;
            
            
          System.out.println("Su peso corporal en Kg es " + grasaCorporalkg);
          System.out.println("Su peso corporal en Lb es " +grasaCorporalLB);
          System.out.println("Su porcentaje de grasa corporal en Kg es" +porcentajeGrasaCorporalkg);
          System.out.println("Su porcentaje de grasa corporal en Lb es " +porcentajeGrasaCorporalLb);
        
          break;
        default:
        System.out.println("Solo se acepta las letras  f y m en minusculas : ");
        
            break;
      }
     lector.close();
}
}
