import java.util.InputMismatchException;
import java.util.Scanner;

public class Convidados {
    static String[] convidados = new String[10];
    static int uPosicao = -1;

    public static void convidado(String[] convidados, String elemento) throws Exception {
        if (uPosicao == convidados.length - 1)
            throw new Exception("Não há mais convites");
        convidados[++uPosicao] = elemento;
    }

    public static void exclusao(String[] convidados, String elemento) throws Exception {
        if (uPosicao == convidados.length - 1)
            throw new Exception("Não há convidados");

        for (int i = 0; i <= uPosicao; i++) {
            if (convidados[i].equals(elemento)) {
                for (int j = i; j < uPosicao; j++) {
                    convidados[j] = convidados[j + 1];
                }
                convidados[uPosicao--] = null;
                return;
            }

        }
    }

    public static void listar(String[] convidados) throws Exception {
        if (uPosicao == convidados.length - 1)
            throw new Exception("Não há convidados");
        System.out.println("Lista de convidados: ");
        for (int i = 0; i <= uPosicao; i++) {
            System.out.println(convidados[i]);
        }
    }

    public static void vagasRestantes(String[] convidados) throws Exception {
        int vagasOcupadas = uPosicao + 1;
        int vagasRestantes = convidados.length - vagasOcupadas;
        System.out.println("Faltam " + vagasRestantes + " vagas");

    }

    public static void menu() {
        System.out.println("CONVIDADOS");
        System.out.println("1.Convidar");
        System.out.println("2.Retirar convite");
        System.out.println("3.Listar convidados");
        System.out.println("4.Número de vagas restantes");
        System.out.println("5.Sair");
    }

    public static void main(String[] args) {
        int opcao = 0;
        String nome;

        Scanner teclado = new Scanner(System.in);

        do {
            try{
           menu();
            opcao = teclado.nextInt();
             teclado.nextLine();
            }catch(InputMismatchException erro){
                 teclado.nextLine();
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do convidado: ");
                    nome = teclado.nextLine();
                    try {
                        convidado(convidados, nome);
                        System.out.println("Convidado adicionado!");
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Digite quem você quer excluir da lista: ");
                    nome = teclado.nextLine();
                    try {
                        boolean nomeEncontrado = false;

                        for (int i = 0; i <= uPosicao; i++) {
                            if (convidados[i].equals(nome)) {
                                exclusao(convidados, nome);
                                System.out.println("Exclusão de convidado feita");
                                nomeEncontrado = true;
                                break;
                            }
                        }
                        if (!nomeEncontrado) {
                            System.out.println("Não há convidados com esse nome");
                        }
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        listar(convidados);
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        vagasRestantes(convidados);
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.exit(0);                
                default:
                    System.out.println("Opção inválida.");
                    teclado.nextLine();
                }
        } while (opcao != 5);
        teclado.close();
    }

}