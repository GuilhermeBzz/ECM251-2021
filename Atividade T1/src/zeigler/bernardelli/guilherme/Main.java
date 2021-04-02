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

    }
}
