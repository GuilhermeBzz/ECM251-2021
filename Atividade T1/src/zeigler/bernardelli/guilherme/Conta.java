package zeigler.bernardelli.guilherme;

//Carolina de Carvalho Gutierrez  18.00576-4
//Guilherme Bernardelli Zeigler   19.02453-3

public class Conta {
    private Usuario Usuario;
    private int idConta;
    private static int idBase = 0;
    private double saldo;

    public Conta(double saldoInicial, Usuario Usuario){
        idBase++;
        this.saldo = saldoInicial;
        this.idConta = idBase;
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
