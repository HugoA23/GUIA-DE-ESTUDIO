
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class AreaCirculo {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.print("Ingresa el radio de un circulo: ");
        
        double rad = N.nextDouble();
        double area = Math.PI * Math.pow(rad, 2);
        System.out.println();
        System.out.println("El area del circulo es: " + area);
        N.close();
    }
    
}
