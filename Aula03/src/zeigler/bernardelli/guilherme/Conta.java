package zeigler.bernardelli.guilherme;

public class Conta {
    //Atributos da Classe
    Cliente cliente;
    double saldo;
    int numero;

    //Metodos da Class
    void depositar(double valor) {
        this.saldo = this.saldo + valor;
        //ou this.saldo += valor;
    }

    boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirDinheiro(Conta destino, double valor) {
      if(this.sacar(valor)){
          destino.depositar(valor);
          return true;
      }
      return false;
    }

    void visualizarSaldo () {
        System.out.println("Saldo atual: R$ " + this.saldo);
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
