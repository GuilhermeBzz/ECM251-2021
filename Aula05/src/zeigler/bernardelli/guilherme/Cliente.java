package zeigler.bernardelli.guilherme;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", CPF='" + cpf + '\'' +
                '}';
    }
}
