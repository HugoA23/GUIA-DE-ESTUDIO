package fichadecontacto;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class FichadeContacto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad= scanner.nextInt();
        System.out.println("Ingrese tu correo electronico: ");
        String correo= scanner.next();
        System.out.println("Ingresa tu numero telefonico: ");
        String telefono= scanner.next();
        scanner.close();
        
        System.out.println("-----Ficha de Contacto-----");
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electronico: " + correo);
        System.out.println("Telefono: " + telefono);

    }
    
}