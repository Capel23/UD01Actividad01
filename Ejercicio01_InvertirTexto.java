import java.util.Scanner;
import java.util.Stack;

public class Ejercicio01_InvertirTexto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();
 
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        for (char c : texto.toCharArray()) {
            pila.push(c); // PUSH
        }

        StringBuilder invertido = new StringBuilder();
        while (!pila.isEmpty()) { // ISEMPTY
            invertido.append(pila.pop()); // POP
        }

        System.out.println("Texto invertido: " + invertido);

        sc.close();
    }
}
