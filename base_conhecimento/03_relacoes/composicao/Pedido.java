import java.util.ArrayList;
import java.util.List;

/**
 * Composição: o pedido cria os próprios itens. A lista nasce no construtor,
 * deste pedido, e não é um atributo compartilhado pela classe.
 */
public class Pedido {
    private final String cliente;
    private final List<ItemPedido> itens;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionar(Produto produto, int quantidade) {
        produto.vender(quantidade);
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double total() {
        double soma = 0;
        for (ItemPedido item : itens) {
            soma = soma + item.subtotal();
        }
        return soma;
    }

    public String getCliente() {
        return cliente;
    }
}
