/**
 * Aluno é um tipo de Pessoa. super(nome) chama o construtor da classe mãe.
 */
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String apresentar() {
        return super.apresentar() + ", matrícula " + matricula;
    }
}
