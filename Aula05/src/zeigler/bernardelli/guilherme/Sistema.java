package zeigler.bernardelli.guilherme;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public void executar(){
        while(executarSistema) {
            int opcao;
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por escolher o MauaBank!");
                executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo Atual: R$"+ this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Informe a quantia de dinheiro que deseja Sacar: ");
                double quantiaParaSacar = scanner.nextDouble();
                if(this.conta.sacar(quantiaParaSacar)){
                    System.out.println("Operação realizado com Sucesso!");
                } else{
                    System.out.println("Não foi possivel realizar a operação!");
                }
                break;
            case 3:
                System.out.println("Informe a quantia de dinheiro que deseja depoistar: ");
                double quantiaParaDepositar = scanner.nextDouble();
                this.conta.depositar(quantiaParaDepositar);
                System.out.println("Operação realizada com Sucesso!");
                break;
            case 5:
                System.out.println("Nome da Conta:");
                String nome = scanner.next();
                System.out.println("Valor da conta:");
                double valorDaConta = scanner.nextDouble();
                System.out.println("Juros da conta:");
                double jurosDaConta = scanner.nextDouble();
                System.out.println("Informe a data de vencimento (ano-mes-dia)?");
                String dataVencimentoTitulo = scanner.next();
                Titulo titulo = new Titulo(valorDaConta,nome,dataVencimentoTitulo, jurosDaConta);
                if(this.conta.sacar(titulo.totalParaPagar())){
                    System.out.println("Operação Realizada com Sucesso!");
                } else {
                    System.out.println("Algo de errado aconteceu!");
                }
                break;
            default:
                System.out.println("Essa funcionalidade ainda não foi implementada");
        }
    }

    public Sistema(){
        this.scanner = new Scanner(System.in); // Deixa ele ler da entrada do sistema - teclado
        this.executarSistema = true;
        this.conta = new Conta("Mario",1945, 12347);
    }


    private void exibirMenu() {
        System.out.println("Bem vindo aou MauaBank");
        System.out.println("1- Visualizar Saldo");
        System.out.println("2- Sacar Dinheiro");
        System.out.println("3- Depositar Dinheiro");
        System.out.println("4- Transferir Dinheiro Dinheiro");
        System.out.println("5- Pagar Conta (Titulo)");
        System.out.println("0- Encerrar");
        System.out.println("Informe a função que deseja executar: ");
    }
}
