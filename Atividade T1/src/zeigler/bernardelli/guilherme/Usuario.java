package zeigler.bernardelli.guilherme;

//Carolina de Carvalho Gutierrez  18.00576-4
//Guilherme Bernardelli Zeigler   19.02453-3

public class Usuario {
    private String nome;
    private String senha;
    private String email;

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
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