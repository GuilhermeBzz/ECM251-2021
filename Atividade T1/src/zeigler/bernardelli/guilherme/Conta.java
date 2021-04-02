package zeigler.bernardelli.guilherme;

public class Conta {
    private Usuario Usuario;
    private int idConta;
    private double saldo;

    public Conta(double saldoInicial, int idnovo, Usuario Usuario){
        this.saldo = saldoInicial;
        this.idConta = idnovo;
        this.Usuario = Usuario;
    }

    public int getidConta () {
        return this.idConta;
    }

    public String getUserName() {
        return this.Usuario.getNome();
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }



    @Override
    public String toString() {
        return "Conta{" +
                "Usuario=" + Usuario +
                ", idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }


}
