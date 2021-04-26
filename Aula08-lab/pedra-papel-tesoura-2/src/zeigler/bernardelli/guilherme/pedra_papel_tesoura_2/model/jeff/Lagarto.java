package zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.jeff;

import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.Jogada;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Papel;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Pedra;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Tesoura;

public class Lagarto extends Jogada {

    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Spoke(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
