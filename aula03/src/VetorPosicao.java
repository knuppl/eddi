import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorPosicao {
    static int[] inserir = new int[10];
    static int uPosicao = -1;

    public static void addElemento(int[] inserir, int elemento, int posicao) throws Exception {
        if (uPosicao == inserir.length - 1) {
            throw new Exception("Não tem mais lugares disponíveis");
        }
    
        if (posicao < 1) {
            throw new Exception("Posição inválida");
        }
    
        int indice = posicao - 1;
    
            if (indice > uPosicao) {
            uPosicao++;
            inserir[uPosicao] = elemento;
        } else {
            for (int i = uPosicao; i >= indice; i--) {
                inserir[i + 1] = inserir[i];
            }
    
            inserir[indice] = elemento;
            uPosicao++;
        }
    }

    public static void excluiElemento(int[] inserir, int elemento) throws Exception {
        if (uPosicao == -1)
            throw new Exception("O vetor não possui elementos");
    
        if (uPosicao >= 0 && uPosicao < inserir.length) {
            for (int i = uPosicao; i < inserir.length - 1; i++) {
                inserir[i] = inserir[i + 1];
            }
        }
        else if (uPosicao >= inserir.length) {
            inserir[inserir.length - 1] = 0;
        }
        
        uPosicao--;
    }

        public static void listar(int[] inserir) throws Exception{
        if (uPosicao == inserir.length - 1)
        throw new Exception("Não há números!");
        
        for (int i = 0; i <= uPosicao;i++){
            System.out.println(inserir[i]);
        }
    }

    public static void menu() {
    System.out.println("OPERAÇÃO COM VETORES");
    System.out.println("1.Adicionar");
    System.out.println("2.Excluir");
    System.out.println("3.Listar");
    System.out.println("4.Sair");
    }

public static void main(String[] args){
    int opcao = 0;
    int elemento;
    int posicao; 

    Scanner teclado = new Scanner(System.in);

    do{
        try{
            menu();
            opcao = teclado.nextInt();
            teclado.nextLine();
        } catch(InputMismatchException erro){
            teclado.nextLine();
        }
        switch (opcao){
            
            case 1:
            System.out.println("Digite um valor a ser adicionado");
            elemento = teclado.nextInt();
            System.out.println("Digite a posição a ser adicionado");
            posicao = teclado.nextInt();
            try{
                addElemento(inserir, elemento, posicao);
                System.out.println("Valor adicionado!");
                teclado.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            break;

            case 2:
            System.out.println("Digite uma posição que você quer excluir");
            posicao = teclado.nextInt();
            try {
                excluiElemento(inserir, posicao);
                System.out.println("Elemento excluído");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
            break;
        
            case 3:
            try {
                listar(inserir);
                teclado.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            break;
            
            case 4:
            System.exit(0);
            
            default:
            System.out.println("Opção inválida");
            teclado.nextLine();
        }
    } while (opcao != 4);
    teclado.close();
}
}
