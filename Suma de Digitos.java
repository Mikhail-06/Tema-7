public class SumaDigitos {

    /**
     * Función recursiva que suma los dígitos de un número.
     * @param n número entero positivo
     * @return suma de los dígitos
     */
    public static int sumaDigitos(int n) {
        if (n == 0) { 
            // Caso base
            return 0;
        } else {
            // Caso recursivo: último dígito + suma del resto
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("sumaDigitos(123) = " + sumaDigitos(123));   // 6
        System.out.println("sumaDigitos(9876) = " + sumaDigitos(9876)); // 30
    }
}
