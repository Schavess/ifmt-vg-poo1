/**
 * O item nasce dentro do pedido. O produto, não: o item só o referencia.
 */
public class ItemPedido {
    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double subtotal() {
        return produto.getPreco() * quantidade;
    }
}
