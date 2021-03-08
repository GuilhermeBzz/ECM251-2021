package zeigler.bernardelli.guilherme;

public class Cliente {
    String nome;
    String sobrenome;
    String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", CPF='" + cpf + '\'' +
                '}';
    }
}
