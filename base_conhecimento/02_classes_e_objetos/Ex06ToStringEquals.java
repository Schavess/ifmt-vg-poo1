/**
 * toString define o texto do objeto. equals compara o conteúdo, não a referência.
 * Quem escreve equals escreve hashCode. Aqui os dois usam o nome.
 *
 * Rode: java Ex06ToStringEquals.java
 */
public class Ex06ToStringEquals {
    public static void main(String[] args) {
        Produto a = new Produto("Coxinha", 6.50);
        Produto b = new Produto("Coxinha", 7.00);
        Produto c = new Produto("Suco", 5.00);

        System.out.println(a);
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("mesmo hash: " + (a.hashCode() == b.hashCode()));
        System.out.println("a.equals(c): " + a.equals(c));
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

    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }
        if (!(outro instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) outro;
        return nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
    }
}
