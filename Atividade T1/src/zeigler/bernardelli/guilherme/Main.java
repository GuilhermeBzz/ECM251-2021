package zeigler.bernardelli.guilherme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String username;

        //Criacao dos usuarios

        System.out.println("Informe o nome do Usuário 1:");
        username = scanner.next();
        Usuario usuario1 = new Usuario(username);
        Conta conta1 = new Conta(1000, usuario1);

        System.out.println("Informe o nome do Usuário 2:");
        username = scanner.next();
        Usuario usuario2 = new Usuario(username);
        Conta conta2 = new Conta(250, usuario2);

        System.out.println("Informe o nome do Usuário 3:");
        username = scanner.next();
        Usuario usuario3 = new Usuario(username);
        Conta conta3 = new Conta(3000, usuario3);

        //Exibir estado inical e realizar operacoes

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());

        String op1 = Transacao.QRCode(conta1, usuario1, 250);

        //Conta 2 paga Conta 1
        if (Transacao.Transacao(conta2,conta1,op1)){
            System.out.println("Transação realizada com sucesso!");
        }
        else
            System.out.println("Desculpe, não foi possível realizar a transação. Verifique as informações inseridas, seu saldo e tente novamente.");

        //Conta 3 paga Conta 1
        if (Transacao.Transacao(conta3, conta1,op1)){
            System.out.println("Transação realizada com sucesso!");
        }
        else
            System.out.println("Desculpe, não foi possível realizar a transação. Verifique as informações inseridas, seu saldo e tente novamente.");

        //Conta 2 tenta pagar conta 1 novamente (Falta saldo)
        if (Transacao.Transacao(conta2, conta1,op1)){
            System.out.println("Transação realizada com sucesso!");
        }
        else
            System.out.println("Desculpe, não foi possível realizar a transação. Verifique as informações inseridas, seu saldo e tente novamente.");

        //Criacao de novo QRCode
        String op2 = Transacao.QRCode(conta2, usuario2, 1000);

        //Conta 3 paga Conta 2 com novo QRCode

        if (Transacao.Transacao(conta3, conta2,op2)){
            System.out.println("Transação realizada com sucesso!");
        }
        else
            System.out.println("Desculpe, não foi possível realizar a transação. Verifique as informações inseridas, seu saldo e tente novamente.");

        //Exibir estado final


        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());


    }
}
