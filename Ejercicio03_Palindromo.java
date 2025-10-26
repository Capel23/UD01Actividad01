import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio03_Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();
        Queue<Character> cola = new LinkedList<>();

        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        for (char c : texto.toCharArray()) {
            pila.push(c);
            cola.add(c);
        }

        boolean esPalindromo = true;
        while (!pila.isEmpty()) {
            if (!pila.pop().equals(cola.poll())) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }

        sc.close();
    }
}
