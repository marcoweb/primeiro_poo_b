package primeiro_exemplo;

import modelos.Pessoa;
import modelos.PessoaFisica;

public class Ola {
    public static void main(String[] args) {
        System.out.println("Funciona!!!");

        Pessoa p1 = new Pessoa();
        p1.setNome("Marco");
        System.out.println(p1.getNome());

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Novo");
        p2.setIdade(43);
        System.out.println(p2.getNome());
    }
}