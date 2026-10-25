/**
 * Método: trecho com nome, parâmetros e, se precisar, um retorno.
 * static aqui porque ainda não há objeto. A conta pertence à classe.
 *
 * Rode: java Ex04Metodos.java
 */
public class Ex04Metodos {
    public static void main(String[] args) {
        double total = calcularTotal(6.50, 2);
        double troco = calcularTroco(20.0, total);
        System.out.println("total: " + total);
        System.out.println("troco: " + troco);
    }

    static double calcularTotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    static double calcularTroco(double pago, double total) {
        return pago - total;
    }
}
