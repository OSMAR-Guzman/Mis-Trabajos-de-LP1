import java.util.Scanner;

/**
 * Persona
 * @author osmar Guzman
 */
public class Persona {
    private Scanner scanner;
    private String nombre;
    private int edad;

    
    public void inicializar() {
        scanner= new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Digite la edad: ");
        edad = scanner.nextInt();

    }
    public void imprimir() {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);

    }
    
    public void Buscarmayor() {
        if (edad>=18) {
            System.out.println(nombre+" es mayor de edad " );
        } else {
            System.out.println(nombre+" es menor de edad ");
        }
    }
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.inicializar();
        persona.imprimir();
        persona.Buscarmayor();

    }
    
}