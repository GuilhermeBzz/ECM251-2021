package zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.controlador;

import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.*;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Papel;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Pedra;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.classico.Tesoura;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.jeff.Lagarto;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura_2.model.jeff.Spoke;

import java.util.Random;
import java.util.Scanner;

public class Sistema{
    private Jogador player1, player2;
    private Scanner scanner;
    private final Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura(), new Spoke(), new Lagarto()};

    public Sistema(){
        scanner = new Scanner(System.in);
        inicializarJogadores();
    }
    public void run(){
        boolean continuar = true;
        do{
            System.out.println(player1.getNome() + " VS " +player2.getNome());

            player1.setJogada(escolheJogada());
            player2.setJogada(sortearJogada());
            System.out.println("\nJogada Player 1: "  + player1.getJogada());
            System.out.println("\nJogada Player 2: "  + player2.getJogada());
            System.out.println("\nResultado " + player1.getJogada().verificarResultado(player2.getJogada()));

        }while(continuar);
    }

    private Jogada escolheJogada() {
        System.out.println("Infome sua jogada: ");

        for (int i = 0; i < jogadas.length; i++) {
            System.out.println(""+i + ":" + jogadas[i]);
        }

        int escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private Jogada sortearJogada(){
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    private void inicializarJogadores() {
        System.out.println("Informe o nome do Jogador 1: ");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("Alberto");
    }
}
