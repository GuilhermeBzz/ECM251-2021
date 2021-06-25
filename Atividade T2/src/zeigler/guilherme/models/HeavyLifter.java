package zeigler.guilherme.models;

import zeigler.guilherme.enums.HorarioDoSistema;
import zeigler.guilherme.enums.TiposMembros;

public class HeavyLifter extends Membro{

    /**
     * Construtor especifico da Classe HeavyLifter (nao eh necessario informar
     * a categoria neste caso pois com certeza sera HeavyLifter)
     * @param usuario Nome de usuario do Membro
     * @param email   Email do Membro
     * @param id      id Numerico do Membro
     */
    public HeavyLifter(String usuario, String email, int id) {
        super(usuario, email, id, TiposMembros.HeavyLifter);
    }


    /**
     * Metodo PostarMensagem() especifico da classe HeavyLifter (com suas assinaturas especificas)
     * Caso a horaAtual seja Regular, ele vai assinar a mensagem como "Podem contar conosco!"
     * Caso a horaAtual seja Extra, ele vai assinar a mensagem como "N00b_qu3_n_Se_r3pita.bat"
     * @param horaAtual Hora atual no sistema que esta rodando
     */
    @Override
    public void PostarMensagem(HorarioDoSistema horaAtual) {
        if (horaAtual == HorarioDoSistema.Regular){
            System.out.println("Podem contar conosco!");
        } else if(horaAtual == HorarioDoSistema.Extra){
            System.out.println("N00b_qu3_n_Se_r3pita.bat");
        } else{
            System.out.println("Erro ao informar o horario!");
        }

    }
}
