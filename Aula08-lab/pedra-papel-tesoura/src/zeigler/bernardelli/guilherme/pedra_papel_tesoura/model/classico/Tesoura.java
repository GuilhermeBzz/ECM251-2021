package zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.classico;

import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.Jogada;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.jeff.Lagarto;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.jeff.Spoke;

public class Tesoura extends Jogada {


    @Override
    public boolean verificarSeGanhei(Jogada jogada) {

        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Spoke);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
