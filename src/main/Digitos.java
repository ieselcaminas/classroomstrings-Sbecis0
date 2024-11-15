public class Digitos {
    public static void main(String[] args) {


    }

    public static int cuantosDigitos(String cadena) {

        int digitosa = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                digitosa++;
            }
        }
        return digitosa;

    }

}

