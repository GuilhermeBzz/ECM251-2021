package zeigler.bernardelli.guilherme;

import java.util.Locale;
import java.util.Scanner;

public class Basico04 {
    //Interagir com o terminal - Entrada de dados do usuario
    public static void main(String[] args) {
        String nome, mes, cavaleiro;
        System.out.println("Me fala seu nominho: ");

        //Para ler dados do teclado (console)
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        System.out.println("Agora o mes do seu aniversario: ");
        mes =scanner.nextLine();

        System.out.println("Nome: "+ nome + " Mes: "+ mes);
        cavaleiro =achaCavaleiro(mes);
        System.out.println("Cavaleiro: "+cavaleiro);
    }

    private static String achaCavaleiro(String mes) {
        mes = mes.toLowerCase();
        if (mes.equals("janeiro")) return "Shura";
        else if (mes.equals("fevereiro")) return "Kamus";
        else if (mes.equals("março")) return "Albafica";
        else if (mes.equals("abril")) return "Mu";
        else if (mes.equals("maio")) return "Aldebaram";
        else if (mes.equals("junho")) return "Saga/Kanon";
        else if (mes.equals("julho")) return "Mascara da Morte";
        else if (mes.equals("agosto")) return "Aioria";
        else if (mes.equals("setembro")) return "Shaka";
        else if (mes.equals("outubro")) return "Mestre Ancião";
        else if (mes.equals("novembro")) return "Miro";
        else if (mes.equals("dezembro")) return "Aioros";
        else return "Serpentário";
    }

}
