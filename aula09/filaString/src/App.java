import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void menu(){
        System.out.println("1. Digite a Operação.");
        System.out.println("2. Desenfileirar fila 1");
        System.out.println("3. Desenfileirar fila 2");
        System.out.println("4. EXIT");
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        Elemento el = new Elemento();
        Fila q1 = new Fila();
        Fila q2 = new Fila();
        
        int opcao = 0;
        String elemento;
        String op;

        do{
            try{
                menu();
                opcao = teclado.nextInt();
                teclado.nextLine();
            } catch(InputMismatchException error){
                teclado.nextLine();
            }
                switch(opcao){
                    case 1:
                    System.out.println("Digite um nome a ser adicionado:");
                    elemento = teclado.nextLine();

                    System.out.println("Digite o tipo de operação (A, B ou X): ");
                    op = teclado.nextLine();

                    if(op.equals("A")){
                    q1.enfileirar(new Elemento(elemento));
                    System.out.println(elemento + " adicionado à fila 1.");
                    teclado.nextLine();

                    } else if(op.equals("B")){
                    q2.enfileirar(new Elemento(elemento));
                    System.out.println(elemento + " adicionado à fila 2.");
                    teclado.nextLine();
                }

                    else if (op.equals("X")){
                        if (q1.getTamanho() < q2.getTamanho()){
                        q1.enfileirar(new Elemento(elemento));
                        System.out.println(elemento + " adicionado à fila 1.");
                        teclado.nextLine();

                        } else if(q2.getTamanho() < q1.getTamanho()){
                        q2.enfileirar(new Elemento(elemento));
                        System.out.println(elemento + " adicionado à fila 2.");
                        teclado.nextLine();
                        
                    } else
                    System.out.println("Elemento não tem onde ser alocado");
                    teclado.nextLine();

                }  else {
                    System.out.println("Digite uma operação válida");
                    teclado.nextLine();
                } 
                break;

                case 2:
                try{
                    while(!q1.isVazia()){
                        el = q1.desenfileirar();
                        System.out.printf("%s%n", el.elemento);
                    } 
                    if(q1.isVazia()){
                        System.out.println("Agora  a fila está vazia.");
                    }
                    }   catch(Exception e){
                        System.out.println(e.getMessage());
                }
                    break;

                    case 3:
                    try{
                        while(!q2.isVazia()){
                            el = q2.desenfileirar();
                            System.out.printf("%s%n", el.elemento);
                        }
                        if(q2.isVazia()){
                            System.out.println("Agora a fila está vazia.");
                        }
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                    case 4:
                    System.out.println("Saindo do programa!");
                    System.exit(0);

                    default:
                    System.out.println("Digite uma operação válida!");
                    teclado.nextLine();
                }
        } while(opcao != 4);
        teclado.close();
           }
}
