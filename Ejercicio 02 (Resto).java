import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        resto();
    }    
    
    // Método a desarrollar
    public static void resto () {
        // Complete este método con su código
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un valor entero: ");
        int n1=input.nextInt();
        System.out.print("Introduce otro valor entero: ");
        int n2=input.nextInt();
        int result=n1%n2;
        System.out.print("El resto de la división del primero entre el segundo es: " +result);

    }
}