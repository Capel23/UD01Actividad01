import java.util.Scanner;
import java.util.Stack;

public class Ejercicio04_DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("El binario es: 0");
        } else {
            int n = numero;
            while (n > 0) {
                pila.push(n % 2);
                n = n / 2;
            }

            System.out.print("El número " + numero + " en binario es: ");
            while (!pila.isEmpty()) {
                System.out.print(pila.pop());
            }
            System.out.println();
        }

        sc.close();
    }
}
