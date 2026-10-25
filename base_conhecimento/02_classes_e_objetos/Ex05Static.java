/**
 * static pertence à classe, não a um objeto.
 * O contador é um só, compartilhado por todas as coxinhas e sucos criados.
 *
 * Rode: java Ex05Static.java
 */
public class Ex05Static {
    public static void main(String[] args) {
        Produto coxinha = new Produto("Coxinha");
        Produto suco = new Produto("Suco");
        System.out.println(coxinha.getNome() + " e " + suco.getNome());
        System.out.println("produtos criados: " + Produto.getCriados());
    }

    static class Produto {
    private static int criados = 0;
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
        criados = criados + 1;
    }

    public String getNome() {
        return nome;
    }

    public static int getCriados() {
        return criados;
    }
    }
}
