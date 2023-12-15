import java.util.Scanner;

/**
 * @author Osmar Guzman
 */
public class Practica3ejercicio4 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        String usuario;
        int pin;
        String usuariocorrecto= "admin";
        int pincorrecto=1234567;
        int correcto=0;
        //Entrada
        System.out.print("Bienvenido a nuesro sistema! ");
        while (correcto<=0) {
            System.out.print("Ingrese Usuario; ");
            usuario = scanner.nextLine();
            System.out.print("Ingrese pin");
            pin = scanner.nextInt();
            //verificar
            if ((usuario.equals(usuariocorrecto)) && (pin==pincorrecto)) {
                correcto=1;
            }
            System.out.println("Usuario y/o pin correcto");
            scanner.nextLine();
        }
             System.out.print("Bienvenido al sistema!!");
             scanner.close();

    }
    
}
