/**
 * Associação: Ana existe antes do pedido. O pedido aponta para ela.
 *
 * Rode, nesta pasta:
 * javac *.java
 * java Ex02Associacao
 */
public class Ex02Associacao {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana");
        Pedido pedido = new Pedido(ana, "coxinha");
        System.out.println(pedido.resumo());
    }
}
