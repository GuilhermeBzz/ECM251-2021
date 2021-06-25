package zeigler.guilherme.models;

import zeigler.guilherme.enums.HorarioDoSistema;
import zeigler.guilherme.enums.TiposMembros;

public class BigBrother extends Membro{

    /**
     * Construtor especifico da Classe BigBrother (nao eh necessario informar
     * a categoria neste caso pois com certeza sera BigBrother)
     * @param usuario Nome de usuario do Membro
     * @param email   Email do Membro
     * @param id      id Numerico do Membro
     */
    public BigBrother(String usuario, String email, int id) {
        super(usuario, email, id, TiposMembros.BigBrother);
    }


    /**
     * Metodo PostarMensagem() especifico da classe BigBrother (com suas assinaturas especificas)
     * Caso a horaAtual seja Regular, ele vai assinar a mensagem como "Sempre ajudando as pessoas membros ou nao S2!"
     * Caso a horaAtual seja Extra, ele vai assinar a mensagem como "..."
     * @param horaAtual Hora atual no sistema que esta rodando
     */
    @Override
    public void PostarMensagem(HorarioDoSistema horaAtual) {
        if (horaAtual == HorarioDoSistema.Regular){
            System.out.println("Sempre ajudando as pessoas membros ou nao S2!");
        } else if(horaAtual == HorarioDoSistema.Extra){
            System.out.println("...");
        } else{
            System.out.println("Erro ao informar o horario!");
        }

    }
}
