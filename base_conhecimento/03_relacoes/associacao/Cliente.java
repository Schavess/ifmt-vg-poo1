/**
 * O cliente existe por conta própria. O pedido só guarda a referência.
 */
package associacao;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
