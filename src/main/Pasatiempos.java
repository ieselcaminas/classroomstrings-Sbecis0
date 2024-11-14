
public class Pasatiempos {
public static void main(String[] args) {
    String textoOriginal = "Un ejemplo de pasatiempos";
    String textoSinVocales = remplazarVocales(textoOriginal);
    System.out.println("Testo original" + textoOriginal + "");
    System.out.println("Texto sin vocales" + textoSinVocales );
}


        public static String remplazarVocales(String texto) {
            return texto.replaceAll("[aeiouAEIOU]", ".");
        }
}



