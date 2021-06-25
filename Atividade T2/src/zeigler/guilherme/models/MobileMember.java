package zeigler.guilherme.models;

import zeigler.guilherme.enums.HorarioDoSistema;
import zeigler.guilherme.enums.TiposMembros;

public class MobileMember extends  Membro{

    /**
     * Construtor especifico da Classe MobileMember (nao eh necessario informar
     * a categoria neste caso pois com certeza sera MobileMember)
     * @param usuario Nome de usuario do Membro
     * @param email   Email do Membro
     * @param id      id Numerico do Membro
     */
    public MobileMember(String usuario, String email, int id) {
        super(usuario, email, id, TiposMembros.MobileMember);
    }


    /**
     * Metodo PostarMensagem() especifico da classe MobileMember (com suas assinaturas especificas)
     * Caso a horaAtual seja Regular, ele vai assinar a mensagem como "Happy Coding!"
     * Caso a horaAtual seja Extra, ele vai assinar a mensagem como "Happy_C0d1ng Maskers"
     * @param horaAtual Hora atual no sistema que esta rodando
     */
    @Override
    public void PostarMensagem(HorarioDoSistema horaAtual) {
        if (horaAtual == HorarioDoSistema.Regular){
            System.out.println("Happy Coding!");
        } else if(horaAtual == HorarioDoSistema.Extra){
            System.out.println("Happy_C0d1ng Maskers");
        } else{
            System.out.println("Erro ao informar o horario!");
        }

    }
}
