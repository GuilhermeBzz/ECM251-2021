package zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.jeff;

import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.Jogada;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Papel;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Pedra;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Tesoura;

public class Spoke extends Jogada {


    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Tesoura(), new Pedra()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spoke";
    }
}
