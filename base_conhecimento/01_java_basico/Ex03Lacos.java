/**
 * for repete um número conhecido de voltas.
 * continue pula o resto desta volta. break abandona o laço.
 *
 * Rode: java Ex03Lacos.java
 */
public class Ex03Lacos {
    public static void main(String[] args) {
        System.out.println("impares antes do 5:");
        for (int numero = 1; numero < 8; numero++) {
            if (numero % 2 == 0) {
                continue;
            }
            if (numero == 5) {
                break;
            }
            System.out.println(numero);
        }

        int estoque = 3;
        while (estoque > 0) {
            System.out.println("venda feita, restava " + estoque);
            estoque = estoque - 1;
        }
    }
}
