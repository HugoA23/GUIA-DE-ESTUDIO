package numprimos;
/**
 *
 * @author hugos
 */
public class Numprimos {

    public static void main(String[] args) {
        System.out.println("Numeros primos del 2 al 500: ");
        for (int i = 2; i <= 500; i++) {
            int N = 1;
            int Cont = 0;
            while (N <= i){
                if (i % N == 0){
                    Cont = Cont + 1;
                }
                N = N + 1;
            }
            if (Cont == 2){
                System.out.println(i);
            }
                }
            
    }
    
}
