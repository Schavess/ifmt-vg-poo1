/**
 * Pessoa é a classe mais geral. Aluno aproveita o que ela já tem.
 */
public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String apresentar() {
        return "Olá, eu sou " + nome;
    }
}
