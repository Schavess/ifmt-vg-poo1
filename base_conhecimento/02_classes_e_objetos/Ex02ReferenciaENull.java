/**
 * Duas variáveis podem apontar para o mesmo objeto.
 * null não aponta para objeto nenhum. Usar o ponto em null quebra.
 *
 * Rode: java Ex02ReferenciaENull.java
 */
public class Ex02ReferenciaENull {
    public static void main(String[] args) {
        Produto a = new Produto();
        a.nome = "Suco";
        a.estoque = 10;

        Produto b = a;
        b.estoque = 8;
        System.out.println("a e b são o mesmo suco. Estoque: " + a.estoque);

        Produto c = null;
        if (c == null) {
            System.out.println("c é null. c.estoque daria NullPointerException.");
        }
    }

    static class Produto {
    String nome;
    int estoque;
    }
}
