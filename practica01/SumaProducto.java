package practica01;

import java.util.Scanner;

/**
 * SumaProducto
 */
public class SumaProducto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        int suma, producto;
        System.out.print("Ingrese primer numero: ");
        num1=scanner.nextInt();
        System.out.print("Ingrese Segundo numero: ");
        num2=scanner.nextInt();
        //Proceso
        suma=num1+num2;
        producto=num1*num2;

        System.out.println("El resultado de la summa es  "+ suma);
        System.out.println("El resultado de la multiplicacion es "+producto);

        scanner.close();
        
    }
}