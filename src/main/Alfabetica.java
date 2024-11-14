public class Alfabetica {
    public static boolean esAlfabetica(String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] palabras = {"Jeandeivid", "Carlos", "Saber", "Daniel", "Albert"};

        for (String palabra : palabras) {
            if (esAlfabetica(palabra)) {
                System.out.println(palabra + " es alfabética");
            } else {
                System.out.println(palabra + " no es alfabética");
            }
        }
    }
}

