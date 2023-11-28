
package menu;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class Menu {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int num;

        do {
            System.out.println("----- Bienvenido -----");
            System.out.println("Menu del Dia");
            System.out.println("1. Tacos de pastor");
            System.out.println("2. Tacos de bistec");
            System.out.println("3. Tacos campechanos");
            System.out.println("4. Tacos de suadero");
            System.out.println("5. Tacos de canasta");
            System.out.println("6. Tacos dorados");
            System.out.println("7. Salir");
            
            
            num = N.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Has ordenado tacos al pastor.");
                    break;
                case 2:
                    System.out.println("Has ordenado tacos de bistec.");
                    break;
                case 3:
                    System.out.println("Has ordenado tacos campechanos.");
                    break;
                case 4:
                    System.out.println("Has ordenado tacos de suadero.");
                    break;
                case 5:
                    System.out.println("Has ordenado tacos de canasta.");
                    break;
                case 6:
                    System.out.println("Has ordenado tacos dorados.");
                    break;
                case 7:
                    System.out.println("----- Nos vemos!!! -----");
                    break;
                default:
                    System.out.println("----- Opcion no valida. -----");
                    break;
            }
        } while (num != 7);
        N.close();
    }
    
}
