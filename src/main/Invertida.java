public class Invertida {
    public static String invertirFrase(String frase) {
        String[] palabras = frase.split(" ");
        String invertido = " ";

        for (int i = palabras.length - 1; i >= 0; i--) {
            invertido = invertido + palabras[i];
        }
        for (int i = 0; i < palabras.length; i++) {
            invertido = palabras[i] + " " + invertido;
        }
        return invertido;
    }
    public static void main(String[] args) {
        String frase = "Bon Dia";
        System.out.print(invertirFrase(frase));
    }

}


