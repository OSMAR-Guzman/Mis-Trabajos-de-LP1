//programa que suma y multiplica numeros

import java.util.Scanner;

public class SumaProducto{
   Scanner leer = new Scanner(System.in);
    int num1, num2, suma, producto;
    System.out.print(s:"Ingrese primer numero: ");
    num1 = leer.nextInt();
    System.out.print(s:"Ingrese segundo numero: ");
    num2 = leer.nextInt();
    suma = num1 + num2;
    producto = num1 * num2;
    System.out.println("Resultado de la suma es " + suma);
    System.out.println("Resultado de la multiplicacion es " + producto); 
}


