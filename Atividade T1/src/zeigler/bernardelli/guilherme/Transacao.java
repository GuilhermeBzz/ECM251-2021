package zeigler.bernardelli.guilherme;

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


}
