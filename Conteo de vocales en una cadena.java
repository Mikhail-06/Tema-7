public class ContarVocales {

    /**
     * Función recursiva para contar vocales en una cadena.
     * @param texto la cadena a evaluar
     * @param index posición actual en la cadena
     * @return cantidad de vocales encontradas
     */
    public static int contarVocales(String texto, int index) {
        if (index == texto.length()) { 
            // Caso base: llegamos al final de la cadena
            return 0;
        } else {
            char c = Character.toLowerCase(texto.charAt(index));
            int suma = 0;

            // Condicionales para verificar si es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                suma = 1;
            }

            // Llamada recursiva para el siguiente carácter
            return suma + contarVocales(texto, index + 1);
        }
    }

    public static void main(String[] args) {
        String caso1 = "hola mundo";
        String caso2 = "xyz";

        System.out.println("\"" + caso1 + "\" -> " + contarVocales(caso1, 0)); // 4
        System.out.println("\"" + caso2 + "\" -> " + contarVocales(caso2, 0)); // 0
    }
}
