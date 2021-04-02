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

    @Override
    public String toString() {
        return "Conta{" +
                "Usuario=" + Usuario +
                ", idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
