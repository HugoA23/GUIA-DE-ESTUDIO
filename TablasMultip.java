
package tablasmultip;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class TablasMultip {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        
        System.out.println("------- tablas de multiplicar -------");
        System.out.println("Escribe un numero para apreciar la tabla de dicho numero.");
        int num = N.nextInt();
        
        for (int i = 1; i <= 10; i++) {
           int multip= num*i;
           
           System.out.println(num + "*" + i + " = " + multip);
        N.close();

        }
    }
}