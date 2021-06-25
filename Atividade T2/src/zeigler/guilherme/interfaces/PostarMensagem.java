package zeigler.guilherme.interfaces;

import zeigler.guilherme.enums.HorarioDoSistema;

/**
 * Interface PostarMensage
 * tem apenas o metodo PostarMensagem
 */
public interface PostarMensagem {
    /**
     * Metodo utilizado para Postar uma mensagem de acordo com quem chamou o metodo.
     * @param horaAtual Hora atual no sistema que esta rodando
     */
    void PostarMensagem(HorarioDoSistema horaAtual);
}
