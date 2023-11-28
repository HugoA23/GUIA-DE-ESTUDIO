package factorial;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        
        int N = sc.nextInt();
        sc.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= N; i++) {
            factorial *=i;
            
        }
        System.out.println("El factorial es " + factorial);
    }
    
}
