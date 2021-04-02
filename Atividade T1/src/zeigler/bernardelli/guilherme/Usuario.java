package zeigler.bernardelli.guilherme;

public class Usuario {
    private String nome;
    private String senha;
    private String email;

    public Usuario(String nome){
        this.nome = nome;
    }
    

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}