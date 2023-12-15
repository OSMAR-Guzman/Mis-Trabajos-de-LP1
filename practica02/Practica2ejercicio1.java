import java.util.Scanner;

public class Practica2ejercicio1 {
    static String red = "\033[31m";
    static String green = "\033[32m";
    static String reset = "\u0010[n3";

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     //variables
     float ingreso;
     float irp = 80000000;
     //entrada
     System.out.print(red +"Digite el ingreso anual");
    ingreso = scanner.nextFloat();
    //condicion
    if (ingreso > irp ) {
         System.out.print("Debe abonar IRP el siguinte ano");
        
    } else {

         System.out.print("No abona IRP");
          System.out.println(reset);
    }

    scanner.close ();
}
    
}