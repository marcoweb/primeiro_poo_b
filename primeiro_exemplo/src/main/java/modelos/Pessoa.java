package modelos;

public class Pessoa {
    protected String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {}
}
