/**
 * Teste no main: o programa confere o resultado e avisa se a regra quebrou.
 * Sem biblioteca extra. Se algo falhar, a execução para na mensagem.
 *
 * Rode: java Ex05TesteNoMain.java
 */
public class Ex05TesteNoMain {
    public static void main(String[] args) {
        Produto coxinha = new Produto("Coxinha", 6.50);
        if (coxinha.getPreco() != 6.50) {
            throw new AssertionError("preço inicial");
        }
        System.out.println("OK preco");

        boolean lancou = false;
        try {
            new Produto("Coxinha", -1);
        } catch (IllegalArgumentException e) {
            lancou = true;
        }
        if (!lancou) {
            throw new AssertionError("preço negativo deveria falhar");
        }
        System.out.println("OK preco negativo");
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
