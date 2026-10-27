/**
 * Teste pronto da prática de 27/10/2026.
 * Não altere este arquivo. Implemente ItemBiblioteca e Livro.
 */
public class Aplicacao {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        System.out.println("Mesma referência? " + (livro1 == livro2));
        // Esperado: Mesma referência? false
        System.out.println("Primeiro empréstimo: " + livro1.emprestar());
        // Esperado: Primeiro empréstimo: true
        System.out.println("Segundo empréstimo: " + livro1.emprestar());
        // Esperado: Segundo empréstimo: false
        System.out.println("Livro 2 disponível: " + livro2.isDisponivel());
        // Esperado: Livro 2 disponível: true
        livro1.devolver();
        System.out.println("Após devolver: " + livro1.emprestar());
        // Esperado: Após devolver: true

        ItemBiblioteca item = livro1;
        System.out.println(item.descricao());
        // Esperado: Livro: O Pequeno Príncipe | Autor: Antoine de Saint-Exupéry
    }
}
