/**
 * Associação: Ana existe antes do pedido. O pedido aponta para ela.
 *
 * Rode, a partir de 03_relacoes:
 * javac associacao\*.java
 * java associacao.Ex02Associacao
 */
package associacao;

public class Ex02Associacao {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana");
        Pedido pedido = new Pedido(ana, "coxinha");
        System.out.println(pedido.resumo());
    }
}
