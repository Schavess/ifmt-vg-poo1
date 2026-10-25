/**
 * Classe, objeto e mensagem.
 *
 * Produto é a classe. coxinha é o objeto. vender é a mensagem.
 * Os atributos ainda estão abertos. O próximo passo fecha isso.
 *
 * Rode: java Ex01ClasseProduto.java
 */
public class Ex01ClasseProduto {
    public static void main(String[] args) {
        Produto coxinha = new Produto();
        coxinha.nome = "Coxinha";
        coxinha.preco = 6.50;
        coxinha.estoque = 20;

        coxinha.vender(2);
        System.out.println(coxinha.nome + " estoque: " + coxinha.estoque);
    }

    static class Produto {
    String nome;
    double preco;
    int estoque;

    void vender(int quantidade) {
        estoque = estoque - quantidade;
    }
    }
}
