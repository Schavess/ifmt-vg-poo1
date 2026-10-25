/**
 * Construtor monta o objeto já com dados.
 * this(...) chama o outro construtor da mesma classe e evita repetir a regra.
 *
 * Rode: java Ex04Construtor.java
 */
public class Ex04Construtor {
    public static void main(String[] args) {
        Produto coxinha = new Produto("Coxinha", 6.50);
        Produto suco = new Produto("Suco", 5.00, 15);
        System.out.println(coxinha.getNome() + " estoque " + coxinha.getEstoque());
        System.out.println(suco.getNome() + " estoque " + suco.getEstoque());
    }

    static class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }
    }
}
