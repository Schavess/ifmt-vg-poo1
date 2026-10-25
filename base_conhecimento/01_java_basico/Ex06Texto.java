import java.util.Scanner;

/**
 * String é uma classe. O texto não muda: o método devolve outro texto.
 *
 * O Scanner abaixo lê um texto já pronto, para o exemplo não esperar o teclado.
 * Com argumento, esse texto entra no lugar da amostra:
 * java Ex06Texto.java suco
 *
 * No laboratório, a fonte pode ser o teclado: new Scanner(System.in).
 */
public class Ex06Texto {
    public static void main(String[] args) {
        String amostra = "coxinha";
        if (args.length > 0) {
            amostra = args[0];
        }

        Scanner entrada = new Scanner(amostra);
        String lido = entrada.nextLine();
        entrada.close();

        System.out.println("lido: " + lido);
        System.out.println("maiusculas: " + lido.toUpperCase());
        System.out.println("tamanho: " + lido.length());
        System.out.println("comeca com c: " + lido.startsWith("c"));
    }
}
