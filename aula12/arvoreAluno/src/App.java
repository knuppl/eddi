import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void menu(){
        System.out.println("BEM-VINDO AO NOSSO SISTEMA!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar um aluno");
        System.out.println("2. Ver aluno com maior matrícula");
        System.out.println("3. Pesquisar aluno");
        System.out.println("4. Lista de alunos");
        System.out.println("5. Excluir aluno");
        System.out.println("6. SAIR");
    }
    public static void main(String[] args) throws Exception {
     
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        BSTree arvore = new BSTree();

        do {
            try {
            menu();
            opcao = teclado.nextInt();
            teclado.nextLine();
            } catch(InputMismatchException e){
                teclado.nextLine();
            }

            switch(opcao){
                case 1:
                System.out.println("Digite o número da matrícula do aluno: ");
                int matricula = teclado.nextInt();
                teclado.nextLine();
                
                System.out.println("Digite o nome do aluno: ");
                String nome = teclado.nextLine();

                System.out.println("Digite o nome do curso do aluno: ");
                String curso = teclado.nextLine();

                try {
                    arvore.inserir(arvore.raiz, new Aluno(matricula, nome, curso));
                    System.out.println("Aluno cadastrado com sucesso.");
                    teclado.nextLine();
                } catch(Exception e){
                    System.out.println("Ocorreu um erro: " + e.getMessage());
                }
                break;

                case 2: 

                try {
                Node max = arvore.maximo(arvore.raiz);
                System.out.println("Aluno com maior matrícula: " + max.elemento);                    
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                teclado.nextLine();
                break;

                case 3:
                System.out.println("Digite o número da matrícula: ");
                int mat = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Aluno buscado");
                try {    
                    arvore.buscarAluno(mat);
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;

                case 4:
                arvore.preOrdem(arvore.raiz);
                teclado.nextLine();
                break;

                case 5:
                System.out.println("Digite o número da matrícula");
                int m = teclado.nextInt();
                try {
                    arvore.remover(m);
                    System.out.println("Aluno removido com sucesso.");
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                teclado.nextLine();
                break;

                case 6:
                System.out.println("Saindo do programa.");
                System.exit(0);

                default:
                System.out.println("Escolha uma opção válida");
                teclado.nextLine();
                }
        } while (opcao != 7);
        teclado.close();
        
}
}