package modelos;

public class PessoaFisica extends Pessoa {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public void setNome(String nome) {
        this.nome = "PF: " + nome;
    }
}
