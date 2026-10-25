import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList cresce. O vetor não. O tipo entre < > diz o que a lista guarda.
 *
 * Rode: java Ex01ArrayList.java
 */
public class Ex01ArrayList {
    public static void main(String[] args) {
        List<Produto> cardapio = new ArrayList<>();
        cardapio.add(new Produto("Coxinha", 6.50));
        cardapio.add(new Produto("Suco", 5.00));

        for (Produto produto : cardapio) {
            System.out.println(produto);
        }
        System.out.println("itens: " + cardapio.size());
    }

    static class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " R$ " + preco;
    }
    }
}
