/**
 * Associação: o pedido conhece o cliente. Não cria o cliente.
 */
package associacao;

public class Pedido {
    private Cliente cliente;
    private String descricao;

    public Pedido(Cliente cliente, String descricao) {
        this.cliente = cliente;
        this.descricao = descricao;
    }

    public String resumo() {
        return cliente.getNome() + " pediu " + descricao;
    }
}
