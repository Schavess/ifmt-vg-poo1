/**
 * O main não soma o pedido. Pede o total ao objeto.
 *
 * Rode, nesta pasta:
 * javac *.java
 * java Ex03Composicao
 */
public class Ex03Composicao {
    public static void main(String[] args) {
        Produto coxinha = new Produto("Coxinha", 6.50, 20);
        Produto suco = new Produto("Suco", 5.00, 15);

        Pedido pedido = new Pedido("Ana");
        pedido.adicionar(coxinha, 2);
        pedido.adicionar(suco, 1);

        System.out.println(pedido.getCliente() + " total: " + pedido.total());
    }
}
