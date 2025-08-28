public class InversionCadena {

    /**
     * Función recursiva que invierte una cadena.
     * @param texto cadena a invertir
     * @return cadena invertida
     */
    public static String invertir(String texto) {
        if (texto == null || texto.length() <= 1) {
            // Caso base: cadena vacía o de un solo carácter
            return texto;
        } else {
            // Caso recursivo: último carácter + inversión del resto
            return invertir(texto.substring(1)) + texto.charAt(0);
        }
    }

    public static void main(String[] args) {
        String caso1 = "Hola";
        String caso2 = "Java";

        System.out.println("\"" + caso1 + "\" -> \"" + invertir(caso1) + "\""); // aloh
        System.out.println("\"" + caso2 + "\" -> \"" + invertir(caso2) + "\""); // avaj
    }
}
