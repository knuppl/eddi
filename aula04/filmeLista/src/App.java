import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void menu(){
        System.out.println("LISTA DE FILMES:");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Aumentar lista");
        System.out.println("4. Pesquisar");
        System.out.println("5. Listar");
        System.out.println("6. Sair");
    }
    public static void main(String[] args) throws Exception {
       
        Filme filme = new Filme();
        ListaFilme listaFilme = new ListaFilme();
       
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        do {
            try {
                menu();
                op = teclado.nextInt();
            } catch(InputMismatchException erro){
                teclado.nextLine();
            }
            switch(op){
                
                case 1:
                System.out.println("Código do filme: ");
                int codigo = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Nome do filme:");
                String nome = teclado.nextLine();
                System.out.println("Gênero do filme:");
                String genero = teclado.nextLine();
                try{
                    filme = new Filme(codigo, nome, genero);
                    listaFilme.add(filme);
                    System.out.println("Filme adicionado!");
                    teclado.nextLine();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;

                case 2:
                System.out.println("Digite o código do filme a ser removido:");
                codigo = teclado.nextInt();
                try{
                    listaFilme.delete(codigo);
                    System.out.println("Filme removido");
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;

                case 3:
                try{
                    listaFilme.aumentar();
                    System.out.println("Lista dobrada!");
                    teclado.nextLine();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;

                case 4:
                System.out.println("Pesquise o nome do filme");
                teclado.nextLine();
                nome = teclado.nextLine();
                try {
                    listaFilme.busca(nome); 
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 5:
            try{
            listaFilme.print();
            teclado.nextLine();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        break;

            case 6:
            System.out.println("Saindo do programa!");
            System.exit(0);
            
            default:
            System.out.println("Opção inválida");
            teclado.nextLine();
    } 
} while(op!=6);
    teclado.close();
    }
}