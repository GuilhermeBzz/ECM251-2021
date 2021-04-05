package zeigler.bernardelli.guilherme;

public class D4TestDrive {
    public static void main(String[] args) {
        D4 dado = new D4();

        for (int i = 0; i <10; i++){
            System.out.println("Sorteio: " + dado.lancarDado());
        }
    }
}
