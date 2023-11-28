package positivoneg;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class PositivoNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int N = sc.nextInt();
        
        if (N <0) {
            System.out.println("El numero es -");
        } else if (N >0){
            System.out.println("El numero es +");
        }
    }
    
}
