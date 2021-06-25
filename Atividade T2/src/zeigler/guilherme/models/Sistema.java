package zeigler.guilherme.models;

import zeigler.guilherme.enums.HorarioDoSistema;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        removerVazias("arquivo_super_Secreto_nao_abrir.csv");

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

    /**
     * Metodo que deixa o Sistema rodando.
     * O usuario escolhe uma opcao de 0-6
     * 0 - Sair
     * 1 - Consulta o horario Atual do sistema
     *          retorna o atributo HoraAtual
     * 2 - Altera o horario Atual do sistema
     *          altera o atributo HoraAtual de Regular para Extra ou de Extra para Regular
     * 3 - Registrar Novo membro
     *          o usuario informa um nome, um email e a categoria deste novo membro. o id numerico eh gerado
     *          aleatoriamente entre 000001 e 999999.
     *          adiciona novo membro no ArrayList de membros, adiciona este mesmo membro no CSV
     *          para adicionar o novo membro ao ArrayList ele verifica qual a categoria deste novo membro e entao
     *          utiliza o construtor da devida Classe.
     * 4 - Remover membro
     *          o usuario informa o Nome de Usuario do membro que deseja remover
     *          o sistema remove este membro do ArrayList e remove ele do arquivo CSV
     * 5 - Listar membros
     *          faz com que todos os membros cadastrados no ArrayList membros utilizem o metodo Apresentacao()
     * 6 - Postar mensagem
     *          o usuario pode escolher entre duas opcoes
     *              todos os usuarios postarem uma mensagem
     *                  faz com que todos os membros utilizem o metodo PostarMensagem enviando a hora atual do sistema
     *                  como parametro
     *              escolher um usuario para postar a mensagem
     *                  o usuario digita um usuario e o sistema faz com que este usuario utilize o metodo PostarMensagem
     *                  enviando a hora atual do sistema como parametro
     */
    public void run(){
        System.out.println("\n=============================================\n" +
                "-=-=- Bem vindo ao Sistema MAsK_S0c13ty -=-=-\n" +
                "=============================================\n");
        int op = 1;
        Scanner scanner = new Scanner(System.in);

        while(op!=0) {
            System.out.println("Atividades disponiveis:\n(1) - Consultar horario atual\n(2) - Alterar horario de servico\n" +
                    "(3) - Registrar Novo membro\n(4) - Remover membro\n(5) - Listar todos os membros\n" +
                    "(6) - Postar mensagem\n(0) - Sair\nInforme a atividade desejada: ");
            op = scanner.nextInt();
            System.out.println("\n");


            switch (op) {
                case 1:
                    System.out.println("Voce esta trabalhando em um Horario " + this.HoraAtual);
                    break;

                case 2:
                    if (this.HoraAtual == HorarioDoSistema.Regular){
                        this.HoraAtual = HorarioDoSistema.Extra;
                        System.out.println("Horario alterado de Regular para Extra");
                    } else{
                        this.HoraAtual = HorarioDoSistema.Regular;
                        System.out.println("Horario alterado de Extra para Regular");
                    }
                    break;

                case 3:
                    int op2;
                    String tempnome;
                    String tempemail;
                    int tempid;
                    Random sorteador = new Random();
                    tempid = (sorteador.nextInt(999998) + 1);
                    scanner.nextLine();

                    System.out.println("Id gerado para o novo membro: " + tempid);
                    System.out.println("Informe o Nome de usuario que deseja cadastrar: ");
                    tempnome = scanner.nextLine();
                    System.out.println("Informe o Email que deseja cadastrar: ");
                    tempemail = scanner.nextLine();
                    System.out.println("Informe a Categoria do novo membro:\n(1) - BigBrother\n(2) - HeavyLifter\n" +
                            "(3) - MobileMember\n(4) - ScriptGuy\nCategoria desejada: ");
                    op2 = scanner.nextInt();

                    while(op2 != 1 && op2 != 2 && op2 != 3 && op2 != 4){
                        System.out.println("Categoria invalida! Tente novamente: ");
                        op2 = scanner.nextInt();
                    }


                    switch(op2){
                        case 1:
                            try{
                                add2file(new BigBrother(tempnome, tempemail, tempid));
                                membros.add(new BigBrother(tempnome, tempemail, tempid));
                                System.out.println("Membro Registrado com sucesso!");
                            }catch(Exception exception){
                                System.out.println("Nao foi possivel registrar o usuario");
                            }

                            break;

                        case 2:
                            try{
                                add2file(new HeavyLifter(tempnome, tempemail, tempid));
                                membros.add(new HeavyLifter(tempnome, tempemail, tempid));
                                System.out.println("Membro Registrado com sucesso!");
                            }catch(Exception exception){
                                System.out.println("Nao foi possivel registrar o usuario");
                            }

                            break;

                        case 3:
                            try{
                                add2file(new MobileMember(tempnome, tempemail, tempid));
                                membros.add(new MobileMember(tempnome, tempemail, tempid));
                                System.out.println("Membro Registrado com sucesso!");
                            }catch(Exception exception){
                                System.out.println("Nao foi possivel registrar o usuario");
                            }

                            break;

                        case 4:
                            try{
                                add2file(new ScriptGuy(tempnome, tempemail, tempid));
                                membros.add(new ScriptGuy(tempnome, tempemail, tempid));
                                System.out.println("Membro Registrado com sucesso!");
                            }catch(Exception exception){
                                System.out.println("Nao foi possivel registrar o usuario");
                            }

                            break;

                        default:
                            System.out.println("Ocorreu um erro ao tentar registrar um novo membro!");
                            break;
                    }

                    break;

                case 4:
                    Scanner scanneruser = new Scanner(System.in);
                    String user;
                    System.out.println("Informe o usuario do membro que deseja remover: ");
                    user = scanneruser.nextLine();
                    membros.removeIf(membro -> membro.usuario.equals(user));

                    try {

                        File file = new File("arquivo_super_Secreto_nao_abrir.csv");
                        List<String> out = Files.lines(file.toPath()).filter(line ->!line.contains(user + ";"))
                                .collect(Collectors.toList());
                        Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

                        System.out.println("Membro removido com sucesso!");


                    }catch (Exception exception){
                        System.out.println("Nao foi possivel remover este usuario.");
                    }


                    break;

                case 5:
                    System.out.println("Membros Cadastrados:");
                    membros.forEach(Membro::Apresentacao);
                    System.out.println("====================");

                    break;
                case 6:
                    scanner.nextLine();
                    int escolha;
                    System.out.println("(0) - Todos postarem uma mensagem\n(1) - Escolher membro para postar\nDigite" +
                            " a opcao escolhida: ");
                    escolha=scanner.nextInt();

                    while(escolha!= 1 && escolha!= 0){
                        System.out.println("Opcao invalida! tente novamente: ");
                        escolha = scanner.nextInt();
                    }

                    if(escolha == 1) {
                        String postador;
                        System.out.println("Informe o nome do usuario que deseja postar uma mensagem: ");
                        scanner.nextLine();
                        postador = scanner.nextLine();

                        membros.forEach(membro -> {
                            if (membro.usuario.equals(postador)) {
                                membro.PostarMensagem(this.HoraAtual);
                            }

                        });
                    } else{
                        membros.forEach(membro-> {
                            System.out.println(membro.usuario + ":");
                            membro.PostarMensagem(this.HoraAtual);
                        });
                    }

                    break;

                case 0:
                    System.out.println("Muito obrigado por usar o sistema MAsK_S0c13ty");
                    break;
                default:
                    System.out.println("Atividade invalida!");
                    break;
            }

            System.out.println("\n");
        }

    }

    /**
     * Metodo utilizado para adicionar um novo membro ao CSV
     * usuario;email;id;categoria
     * Caso o arquivo esteja vazio ele preenche a primeira linha com um novo membro
     * Caso ja tenha algum membro cadastrado ele cria uma nova linha para cadastrar um membro
     * @param novomembro Membro que sera adicionado ao arquivo
     * @throws Exception
     */
    void add2file(Membro novomembro) throws Exception{
        int vazio;

        File file = new File("arquivo_super_Secreto_nao_abrir.csv");
        if (file.length() == 0){
            vazio = 1;
        }
        else{
            vazio = 0;
        }

        FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);

        if (vazio == 0) {
            fileWriter.append("\n" + novomembro.usuario + ";" + novomembro.email + ";" + novomembro.id + ";" + novomembro.categoria);
        } else{
            fileWriter.append(novomembro.usuario + ";" + novomembro.email + ";" + novomembro.id + ";" + novomembro.categoria);
        }
        fileWriter.close();

    }

    void removerVazias (String name){

        Scanner file;
        PrintWriter writer;

        try{

            file = new Scanner(new File(name));
            writer = new PrintWriter(name + ".tmp");

            while (file.hasNext()) {
                String line = file.nextLine();
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.write("\n");
                }
            }

            file.close();
            writer.close();

            File fileog = new File(name);
            File filenew = new File(name + ".tmp");

            fileog.delete();
            filenew.renameTo(fileog);


        }catch(Exception exception){
            System.out.println("Nao foi possivel remover as linhas em branco do arquivo informado");
        }
    }


}
