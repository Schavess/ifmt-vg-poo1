/**
 * O produto existe fora do pedido. O item só conhece o preço dele.
 */
public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        estoque = estoque - quantidade;
    }
}
