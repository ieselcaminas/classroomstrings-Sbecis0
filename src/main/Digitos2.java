public static int esNumero(String cadena) {

    int count = 0;
    String[] palabras = cadena.split(" ");

    for (int i = 0; i < palabras.length; i++) {
        boolean esNumero = true;
        for (int j = 0; j < palabras[i].length(); j++) {
            if (!Character.isDigit(palabras[i].charAt(j))) {
                esNumero = false;
                break;
            }
        }
        if (esNumero) count++;
    }
    return count;
}
    public static boolean contarNumero(String palabras) {
    
        for (int j = 0; j < palabras.length(); j++) {
            if (!Character.isDigit(palabras.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esNumero("1234567890"));
        System.out.println(esNumero("abc123"));
    }

