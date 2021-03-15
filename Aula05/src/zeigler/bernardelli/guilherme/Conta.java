package zeigler.bernardelli.guilherme;

public class Conta {
    //Atributos da Classe
    private Cliente cliente;
    private double saldo;
    private int numero;

    public Conta(String nome, double saldoInicial, int numero){
        this.saldo = saldoInicial;
        this.numero = numero;
        this.cliente = new Cliente(nome);
    }

    //Metodos da Class
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        //ou this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
      if(this.sacar(valor)){
          destino.depositar(valor);
          return true;
      }
      return false;
    }

    public double getSaldo () {
       return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Cliente=" + cliente.toString() +
                ", Saldo=" + saldo +
                ", Numero=" + numero +
                '}';
    }
}
