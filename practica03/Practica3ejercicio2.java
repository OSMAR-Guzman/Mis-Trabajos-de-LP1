//FOR2

import java.util.Scanner;

public class Practica3ejercicio2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int tabla, resul;
        //entrada
        System.out.println("Que tabla de multiplicar desea ver?");
          tabla = scanner.nextInt();
         System.out.println("-----------------------------------");
         System.out.println("Esta es el resultado de la tabla de"+ tabla);
          System.out.println("----------------------------------");
        //bucle
        for (int i = 1; i < 11; i++) {
            resul=i*tabla;
         System.out.println(tabla +"x" + i + "="+ resul);
        scanner.close();
        }
    }
    
}
