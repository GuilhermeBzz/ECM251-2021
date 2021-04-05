package zeigler.bernardelli.guilherme;

import java.util.Random;

public class Dado {

    final private int numeroFaces;
    private int faceAtual;
    private int[] FACES;

    /**
     * Construtor da classe que define o numero de faces, as faces e a face inicial do dado
     * @param numeroFaces
     */

    public Dado(int numeroFaces){
        this.numeroFaces = numeroFaces;
        FACES = new int[this.numeroFaces];
        for (int i = 0; i <this.numeroFaces; i++){
            FACES[i] = i+1;
        }
        lancarDado();
    }

    /**
     * Metodo que sorteia uma face do dado.
     * @return Face atual sorteada
     */

    public int lancarDado(){
        Random random = new Random();
        this.faceAtual = random.nextInt(this.numeroFaces);
        return this.FACES[this.faceAtual];
    }

    /**
     * Metodo que devolve o valor do ultimo lancmento do dado
     * @return Ultima Face atual
     */

    public int lerLancamentoAual(){
        return this.FACES[this.faceAtual];
    }

}
