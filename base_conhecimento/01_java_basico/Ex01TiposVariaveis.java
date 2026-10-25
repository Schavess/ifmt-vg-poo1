/**
 * Tipos primitivos e referências.
 *
 * O tipo é declarado. int guarda o valor. String guarda uma referência.
 *
 * Rode: java Ex01TiposVariaveis.java
 */
public class Ex01TiposVariaveis {
    public static void main(String[] args) {
        int idade = 16;
        double preco = 6.50;
        boolean ativo = true;
        char turma = 'A';
        String nome = "Ana";

        System.out.println(nome + " tem " + idade + " anos, turma " + turma);
        System.out.println("preco: " + preco + " | ativo: " + ativo);

        String textoIdade = String.valueOf(idade);
        int idadeLida = Integer.parseInt("16");
        double precoLido = Double.parseDouble("6.50");
        System.out.println(textoIdade + " | " + idadeLida + " | " + precoLido);

        // (int) corta a parte decimal. Não arredonda.
        System.out.println("corte de 6.9: " + (int) 6.9);
    }
}
