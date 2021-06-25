package zeigler.guilherme.models;

import zeigler.guilherme.enums.TiposMembros;
import zeigler.guilherme.interfaces.Apresentacao;
import zeigler.guilherme.interfaces.PostarMensagem;

public abstract class Membro implements Apresentacao, PostarMensagem {
    String usuario;
    String email;
    int id;
    TiposMembros categoria;


    /**
     * Metodo construtor da classe abstrata Membro
     * @param usuario   Nome de usuario do membro
     * @param email     Email membro
     * @param id        id numerico do Membro
     * @param categoria Categoria (dos TiposMembros) do Membro
     */
    public Membro(String usuario, String email, int id, TiposMembros categoria) {
        this.usuario = usuario;
        this.email = email;
        this.id = id;
        this.categoria = categoria;
    }


    /**
     * Metodo Apresentacao() (vindo da interface Apresentacao)
     * Informa o id, Nome de usuario e a categoria do membro que chamou o metodo.
     */
    @Override
    public void Apresentacao(){
        System.out.println("Id: " + this.id + ": Eu sou " + this.usuario +", um " + this.categoria);
    }
}
