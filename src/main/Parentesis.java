import java.util.Stack;

public static boolean verificarParentesis(String expresion) {
    int c = 0;

    for (int i = 0; i < expresion.length(); i++) {
        if (expresion.charAt(i) == '(') {
            c++;
        } else if (expresion.charAt(i) == ')') {
            c--;
            if (c < 0) {
                return false;
            }
        }
    }
    return c == 0;
}

public static void main(String[] args) {
    String expresion = "((A)";
    System.out.println(verificarParentesis(expresion));
}
