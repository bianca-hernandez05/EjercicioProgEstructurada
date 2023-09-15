import java.util.Scanner;

public class Ejercicio30{
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String[] Categorias = {
                
            "1. Desayunos",
            "2. AlmuerzosYcenas",
            "3. Postres",
            "4. mcCafe",
            "5. Bebidas ",
            "6. Antojos",
            "7. CajitaFeliz",
        };

        System.out.println("Bienvenido a McDonald's");
        System.out.println("Categorias");

         for (String item : Categorias) {
            System.out.println(item);
        }

        String[] menu = {
            "1. Mcmuffinn de salchicha y huevo - c$ 181",
            "2. Egg Mcmuffin - c$ 181",
            "3. Mcmuffinn de Tocino y huevo - c$ 181",
            "4. Mcmuffinn Nica - c$ 181",
            "5. Mcmuffinn de salchicha y huevo - c$ 181",
            "7. Duo sandwich Spicy - c$ 260",
            "8. Papa mediana + derretido+ Mcflurry oreo caramelo - c$ 190",
            "9. McNica de Res - c$ 268",
            "10. Big Mac - c$ 253",
            "11. Big Mac Double - c$ 313",
            "12. Cuarto de libra doble - c$ 318",
            "13. Hamburguea - c$ 106",
            "14. Cajita feliz de hamburguesa Junior - c$ 208",
            "15. Cajta feliz de quesoburguesa - c$ 208",
            "16. Cajita feliz de Hamburguesa - c$ 208",
            "17. Cajita feliz de McNuggets - c$ 208",
            "18. Papas - c$ 81",
            "19. McPatatas - c$ 96",
            "20. Derretido clasico - c$ 76",
            "21. Dados de queso- c$ 56",
            "22. Pollo mcCrispy 1 pieza - c$ 138",
            "23. McFlurry Dulce Mani - c$ 96",
            "24. McFlurry Oreo Caramelo - c$ 96",
            "25. McFlurry Oreo Chocolate - c$ 96",
            "26. McFlurry MYMS Chocolate - c$ 96",
            "27. McFlurry MYMS caramelo - c$ 96",
            "28. Sprite x hawaiana- c$ 77",
            "29. Coca cola- c$ 76",
            "30. Sprite - c$ 76",
            "31. Fanta- c$ 76",
            "32. Coca Cola lata - c$ 78",
            "33. Fanta botella - c$ 78",
            "34. Latte - c$ 94",
            "28. Capuccino - c$ 94",
            "29. Nicaraguense - c$ 69",
            "30. El mocha - c$ 121",
            "31. Patel de Elote- c$ 116",
            "32. Cheesecake de Fresa - c$ 136",
            "33.Pastel de chocolate - c$ 116",
            "34. Cheesecake dulce de leche - c$ 136",
 
        };

        double[] precios = { 181, 181, 181, 181,181, 260 , 190, 268, 253, 313, 318, 106, 208, 208, 208, 208, 81, 96, 76, 56, 138,
                96, 96, 96, 96, 96, 77, 76, 76, 76, 78, 78,94, 94, 69, 121, 116, 136, 116, 136 
         };

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(" A continuacion te presentaremos el Menú:");


        for (String item : menu) {
            System.out.println(item);
        }

        double total = 0.0;
        String orden = "";

        while (true) {
            System.out.print("Seleccione un platillo (1-34) ingrese 0 para finalizar la orden: ");
            int opcion = lector.nextInt();

            if (opcion == 0) {
                break;
            } else if (opcion >= 1 && opcion <= 34) {
                int indice = opcion - 1;
                total += precios[indice];
                orden += menu[indice] + "\n";
            } else {
                System.out.println("Opción inválida. Por favor, intente seleccionar otro numero que sea valido .");
            }
        }

        System.out.println("\n Detalle de la factura:");
        System.out.println(orden);
        System.out.println("Total a pagar: c$" + total);
 
 lector.close();
}
}