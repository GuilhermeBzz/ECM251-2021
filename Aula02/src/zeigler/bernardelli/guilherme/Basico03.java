package zeigler.bernardelli.guilherme;

import java.util.Random;

public class Basico03 {
    //Estruturas de repetição
    public static void main(String[] args) {
        int limite = 10;
        int contador;

        for(contador = 0; contador<limite;contador++){
            System.out.println("Valor atual: "+ contador);
        }
        System.out.println("Final da contagem!");

        //Cria um objeto que sorteia coisas aleatorias
        Random sorteador = new Random();
        int numero = sorteador.nextInt(1000);
        System.out.println("Numero sorteado: "+ numero);
        int senha = 159753;
        int tentativas = 0, chute;
        chute = sorteador.nextInt(999999);

        while (chute != senha){
            tentativas++;
            System.out.println("Tentativa " + tentativas +" ta errada! " + chute + " não é a senha!");
            chute = sorteador.nextInt(999999);
        }
        System.out.println("Boa garotão! Apenas " + tentativas + " para quebrar a senha! (" + chute + " é a senha)");
    }

}
