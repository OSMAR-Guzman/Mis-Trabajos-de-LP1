import java.util.Scanner;

public class Practica2ejercicio2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int num1, num2;
    System.out.print("Digite primer numero");
    num1= scanner.nextInt();
     System.out.print("Digite segundo numero");
    num2 = scanner.nextInt();
    //condicional
    if (num1>num2){
        System.out.print("Primer numero es mayor");
    } else if (num2>num1) {
        System.out.print("Segundo numero es mayor");
    } else {
        System.out.print("Son iguales");
    }
    scanner.close();
    }

}
