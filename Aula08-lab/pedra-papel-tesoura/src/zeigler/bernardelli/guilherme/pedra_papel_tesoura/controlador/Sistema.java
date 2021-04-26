package zeigler.bernardelli.guilherme.pedra_papel_tesoura.controlador;

import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.*;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.classico.Papel;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.classico.Pedra;
import zeigler.bernardelli.guilherme.pedra_papel_tesoura.model.classico.Tesoura;

import java.util.Random;
import java.util.Scanner;

public class Sistema{
    private Jogador player1, player2;
    private Scanner scanner;

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
        System.out.println("Infome sua jogada: \n0- Pedra\n1- Papel\n2- Tesoura");
        int escolha = scanner.nextInt();
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas[escolha];
    }

    private Jogada sortearJogada(){
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    private void inicializarJogadores() {
        System.out.println("Informe o nome do Jogador 1: ");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("Alberto");
    }
}
