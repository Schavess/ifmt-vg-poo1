/**
 * Livro é um ItemBiblioteca e acrescenta o autor.
 * Use super(titulo). Não copie título nem disponibilidade para esta classe.
 */
public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        // TODO: se autor for null ou em branco, lançar IllegalArgumentException.
        // TODO: guardar o autor.
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String descricao() {
        // TODO: retornar "Livro: ", o título, " | Autor: " e o autor.
        // Exemplo: Livro: O Pequeno Príncipe | Autor: Antoine de Saint-Exupéry
        return "";
    }
}
