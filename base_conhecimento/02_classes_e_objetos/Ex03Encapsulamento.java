/**
 * Encapsulamento: o atributo é private.
 * Quem está fora manda mensagem (get e set). O set recusa preço inválido.
 *
 * Rode: java Ex03Encapsulamento.java
 */
public class Ex03Encapsulamento {
    public static void main(String[] args) {
        Produto coxinha = new Produto();
        coxinha.setNome("Coxinha");
        coxinha.setPreco(6.50);
        coxinha.setEstoque(20);
        System.out.println(coxinha.getNome() + " R$ " + coxinha.getPreco());
    }

    static class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo");
        }
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        this.estoque = estoque;
    }
    }
}
