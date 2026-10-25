/**
 * if escolhe um caminho. Texto se compara com equals, não com ==.
 * == em String compara a referência, não as letras.
 *
 * Rode: java Ex02Decisoes.java
 */
public class Ex02Decisoes {
    public static void main(String[] args) {
        String pedido = "coxinha";
        int estoque = 3;

        if (pedido.equals("coxinha") && estoque > 0) {
            System.out.println("Pode vender a coxinha.");
        } else {
            System.out.println("Sem esse lanche ou sem estoque.");
        }

        String outro = new String("coxinha");
        System.out.println("equals: " + pedido.equals(outro));
        System.out.println("== : " + (pedido == outro));
    }
}
