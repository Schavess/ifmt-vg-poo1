/**
 * throw avisa o erro. try/catch decide o que fazer com ele.
 * IllegalArgumentException não obriga o compilador a tratar. Aqui tratamos.
 *
 * Rode: java Ex04Excecoes.java
 */
public class Ex04Excecoes {
    public static void main(String[] args) {
        Produto coxinha = new Produto("Coxinha", 2);

        try {
            coxinha.vender(100);
            System.out.println("venda feita");
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível vender: " + e.getMessage());
        }

        System.out.println("estoque continua " + coxinha.getEstoque());
    }
}

class Produto {
    private String nome;
    private int estoque;

    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        estoque = estoque - quantidade;
    }
}
