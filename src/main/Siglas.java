public class Siglas {
    public static String siglas(String[] palabras) {
        String siglas = "";
        char c;
        for (int i = 0; i < palabras.length; i++) {
            c = palabras[i].charAt(0);
            if (Character.isUpperCase(c)) {
                siglas += c;
            }

        }
        return siglas;
    }
    public static void main(String[] args) {
        String[] palabras = {"Hola" , "Ejemplo"};
        System.out.println(siglas(palabras));
    }



}

