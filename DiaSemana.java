
package diasemana;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class DiaSemana {

    public static void main(String[] args) {
         Scanner Dia = new Scanner(System.in);

        System.out.print("Ingresa un numero del 1 al 7: ");
        int numero = Dia .nextInt(); 

        String diaSem;

        switch (numero) {
            case 1:
                diaSem = "Lunes";
                break;
            case 2:
               diaSem= "Martes";
                break;
            case 3:
                diaSem= "Miercoles";
                break;
            case 4:
                diaSem = "Jueves";
                break;
            case 5:
                diaSem = "Viernes";
                break;
            case 6:
                diaSem = "Sabado";
                break;
            case 7:
                diaSem = "Domingo";
                break;
            default:
                diaSem = "Numero no valido";
        }

        System.out.println("Hola soy el dia:  "  );
        System.out.println("----- "+ diaSem + " -----");

       Dia .close();
    }
    
}
