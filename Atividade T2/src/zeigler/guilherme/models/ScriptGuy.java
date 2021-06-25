package zeigler.guilherme.models;

import zeigler.guilherme.enums.HorarioDoSistema;
import zeigler.guilherme.enums.TiposMembros;

public class ScriptGuy extends Membro{

    /**
     * Construtor especifico da Classe ScriptGuy (nao eh necessario informar
     * a categoria neste caso pois com certeza sera ScriptGuy)
     * @param usuario Nome de usuario do Membro
     * @param email   Email do Membro
     * @param id      id Numerico do Membro
     */
    public ScriptGuy(String usuario, String email, int id) {
        super(usuario, email, id, TiposMembros.ScriptGuy);
    }


    /**
     * Metodo PostarMensagem() especifico da classe ScriptGuy (com suas assinaturas especificas)
     * Caso a horaAtual seja Regular, ele vai assinar a mensagem como "Prazer em ajudar novos amigos de codigo!"
     * Caso a horaAtual seja Extra, ele vai assinar a mensagem como "QU3Ro_S3us_r3curs0s.py"
     * @param horaAtual Hora atual no sistema que esta rodando
     */
    @Override
    public void PostarMensagem(HorarioDoSistema horaAtual) {
        if (horaAtual == HorarioDoSistema.Regular){
            System.out.println("Prazer em ajudar novos amigos de codigo!");
        } else if(horaAtual == HorarioDoSistema.Extra){
            System.out.println("QU3Ro_S3us_r3curs0s.py");
        } else{
            System.out.println("Erro ao informar o horario!");
        }

    }
}
