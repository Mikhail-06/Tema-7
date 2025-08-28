import java.util.Scanner;

public class Recursion {

    /**
     * Función factorial de manera recursiva.
     * @param n valor a obtener factorial
     * @return factorial de n
     */
    public static long factorial(long n) {
        if (n <= 1) { // Caso de salida
            return 1;
        } else {
            // Caso recursivo
            return n * factorial(n - 1);
        }
    }

    /**
     * Función de Fibonacci de manera recursiva.
     * @param n la posición de número fibonacci a buscar
     * @return el número fibonacci en la posición n
     */
    public static long fibonacci(long n) {
        if (n <= 1) { // Caso base
            return n;
        } else {
            // Caso recursivo
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ RECURSIVIDAD ===");
            System.out.println("1. Calcular Factorial");
            System.out.println("2. Calcular Fibonacci");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número para calcular su factorial: ");
                    int numFactorial = sc.nextInt();
                    System.out.println("Factorial de " + numFactorial + " = " + factorial(numFactorial));
                    break;

                case 2:
                    System.out.print("Introduce una posición para calcular Fibonacci: ");
                    int numFibonacci = sc.nextInt();
                    System.out.println("Fibonacci de " + numFibonacci + " = " + fibonacci(numFibonacci));
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
