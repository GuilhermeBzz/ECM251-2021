package zeigler.guilherme.models;

import zeigler.guilherme.enums.HorarioDoSistema;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    List<Membro> membros = new ArrayList<>();
    HorarioDoSistema HoraAtual;


    /**
     * Construtor da Classe Sistema
     * Nao recebe nenhum parametro, porem define o atributo HoraAtual para Regular por padrao
     * Le o arquivo "arquivo_super_Secreto_nao_abrir.csv" para carregar os membros anteriormente Cadastrados
     * no Sistema
     * Para carregar os membros ele faz a leitura linha por linha do arquivo, verifica a ultima coluna do CSV
     * (que contem a categoria do Membro) e dependendo da categoria do membro, utiliza um construtor (o especifico
     * de cada Membro) para carregar o membro para o ArrayList membros.
     * As outras colunas do CSV sao:
     * [0] - Nome de usuario
     * [1] - email
     * [2] - id
     */
    public Sistema() {
        System.out.println("Inicializando o sistema");
        HoraAtual = HorarioDoSistema.Regular;

        File file = new File("arquivo_super_Secreto_nao_abrir.csv");
        String categorianew;
        System.out.println("Carregando usuarios registrados");

        try{

            Scanner scanner = new Scanner(file);


            while(scanner.hasNext()){
                String linha = scanner.nextLine();


                categorianew = (linha.split(";")[3]);
                switch (categorianew) {
                    case "BigBrother":
                        membros.add(new BigBrother(linha.split(";")[0],
                                linha.split(";")[1],
                                Integer.parseInt(linha.split(";")[2])));

                        break;

                    case "HeavyLifter":
                        membros.add(new HeavyLifter(linha.split(";")[0],
                                linha.split(";")[1],
                                Integer.parseInt(linha.split(";")[2])));
                        break;

                    case "ScriptGuy":
                        membros.add(new ScriptGuy(linha.split(";")[0],
                                linha.split(";")[1],
                                Integer.parseInt(linha.split(";")[2])));
                        break;

                    case "MobileMember":
                        membros.add(new MobileMember(linha.split(";")[0],
                                linha.split(";")[1],
                                Integer.parseInt(linha.split(";")[2])));
                        break;

                    default:
                        System.out.println("Nao foi possivel encontrar e cadastrar este usuario");
                        break;
                }



            }

        }
        catch(Exception exception){
            System.out.println("Deu ruim!" + exception.getMessage());
        }
        System.out.println("Sistema inicializado com Sucesso!");


    }
}
