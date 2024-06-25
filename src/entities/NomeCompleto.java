package entities;

public class NomeCompleto {
    private String nome;
    private String sobrenome;

    public NomeCompleto(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
