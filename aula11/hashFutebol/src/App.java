import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void menu(){
        System.out.println("1. Cadastrar um time");
        System.out.println("2. Buscar um time");
        System.out.println("3. Remover um time");
        System.out.println("4. Listar todos os times");
        System.out.println("5. SAIR");
    }
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Hash tabela = new Hash();
        int opcao = 0;
        Random gerador = new Random();

        do {
            try{
                menu();
                opcao = teclado.nextInt();
                teclado.nextLine();
            } catch(InputMismatchException e){
                System.out.println("Digite um número válido");
                teclado.nextLine();
            }
                switch(opcao){
                    case 1:
                    try{
                    System.out.println("Digite o nome do time");
                    String nome = teclado.nextLine();

                    System.out.println("Digite o ano da fundação do time");
                    int anoFundacao = teclado.nextInt();

                    System.out.println("Digite o presidente do time");
                    String presidente = teclado.nextLine();
                    teclado.nextLine();

                    System.out.println("Digite o técnico do time");
                    String tecnico = teclado.nextLine();
                    teclado.nextLine();

                    int codigo = gerador.nextInt(1000);
                    
                    tabela.put(new Time(codigo, nome, anoFundacao, presidente, tecnico));
                    System.out.println("Time cadastrado!");
                    teclado.nextLine();
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                        teclado.nextLine();
                    }
                    break;

                    case 2:
                    try{
                        System.out.println("Informe o código do time que você quer acessar");
                        int key = teclado.nextInt();
                        Time x = tabela.get(key);
                        if (x!=null)
                            System.out.println("O time é o " + x.getNome());
                        else
                            System.out.println("Time não encontrado em nosso sistema.");
                        teclado.nextLine();
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                    case 3:
                    try{
                        System.out.println("Digite o código time que deseja remover: ");
                        int key = teclado.nextInt();
                        Time x = tabela.remove(key);
                        
                        if (x!=null)
                            System.out.println("O time " + x.getNome() + " foi removido!");
                        else 
                            System.out.println("Time não encontrado!");
                            teclado.nextLine();
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                    case 4:
                    try{
                    tabela.listar();
                    teclado.nextLine();
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                    case 5:
                    System.out.println("Saindo do programa.");
                    System.exit(0);

                    default:
                    System.out.println("Digite um número válido");
                }
            
            } while (opcao != 5);
            
            teclado.close();
            }
            }
