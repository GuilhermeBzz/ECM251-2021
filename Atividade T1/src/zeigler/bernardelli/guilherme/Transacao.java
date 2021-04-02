package zeigler.bernardelli.guilherme;

//Carolina de Carvalho Gutierrez  18.00576-4
//Guilherme Bernardelli Zeigler   19.02453-3

import java.util.Random;

public class Transacao {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String QRCode(Conta ContaDestino, Usuario UserDestino, double valor){
       String QRCode = ContaDestino.getidConta() + ";" + UserDestino.getNome() + ";" + valor + ";" + getRandomNumberInRange(1000, 9999);

       return QRCode;
    }

    public static boolean Transacao(Conta Pagador, Conta Recebedor, String QRCode){
        String[] dadosQRCode = QRCode.split(";");
        int idRecebedor = Integer.parseInt(dadosQRCode[0]);
        String nomeRecebedor = Recebedor.getUserName();
        double valor = Double.parseDouble(dadosQRCode[2]);

        if(idRecebedor == Recebedor.getidConta() && dadosQRCode[1].equals(nomeRecebedor) && Pagador.getSaldo() >= valor){
            Pagador.sacar(valor);
            Recebedor.depositar(valor);
            return true;
        }
        else
            return false;
    }
}
