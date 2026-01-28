import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = pedirEntero("Ingresa un número entero positivo: ");
        int suma = sumarHastaN(numero);
        System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);
    }

    public static int pedirEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        scanner.close();
        return valor;
    }

    public static int sumarHastaN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
