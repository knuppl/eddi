import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

        public static void menu(){
        System.out.println("1. Cadastrar um processo");
        System.out.println("2. Executar um processo");
        System.out.println("3. Imprimir fila de processos");
        System.out.println("4. Localizar um processo");
        System.out.println("5. Limpar processos");
        System.out.println("6. Sair");
    }

    public static void main(String[] args) {
        FilaArranjo fila = new FilaArranjo();
        Processo p = new Processo();

        int opcao = 0;

        Scanner teclado = new Scanner(System.in);


        do {
            try{
                menu();
                opcao = teclado.nextInt();
                teclado.nextLine();
            } catch(InputMismatchException erro){
                teclado.nextLine();
            }
                switch(opcao){
                    case 1:
                System.out.println("Digite um nome a ser cadastrado");
                String titulo = teclado.nextLine();
                System.out.println("Processo cadastrado");
                try{
                    fila.enfileirar(new Processo(0, titulo));
                    teclado.nextLine();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;

                case 2:
                try{
                fila.desinfileirar();
                System.out.println("Processo " + fila.inicio + " executado");
                teclado.nextLine();
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
            break;
        
                case 3:
                try{
                fila.imprimirFila(fila);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                teclado.nextLine();
                break;

                case 4:
                try{
                int codigo = teclado.nextInt();
                p = fila.pesquisa(codigo);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
                break;

                case 5:
                try{
                    fila.clear(fila);
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;

                case 6:
                System.out.println("Saindo do programa.");
                System.exit(0);

                default:
                System.out.println("Opção inválida");
                teclado.nextLine();
    }
}      while(opcao != 6);
    teclado.close();
        }
    }