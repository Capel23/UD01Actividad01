import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio02_ColaClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Llegada de cliente");
            System.out.println("2) Atender cliente");
            System.out.println("3) Mostrar cola");
            System.out.println("4) Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String cliente = sc.nextLine();
                    cola.add(cliente);
                    System.out.println(cliente + " ha llegado a la cola.");
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        String atendido = cola.poll();
                        System.out.println("Atendiendo a: " + atendido);
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Clientes en cola: " + cola);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
