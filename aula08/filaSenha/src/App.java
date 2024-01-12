import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void menu(){
        System.out.println("1. Entregar uma senha");
        System.out.println("2. Atender o próximo da fila");
        System.out.println("3. Olhar fila");
        System.out.println("4. Sair");
    }
    public static void main(String[] args) throws Exception {
        FilaArranjo fila = new FilaArranjo();

        Senha s = new Senha();

        Scanner teclado = new Scanner(System.in);
        
        int senha_Distribuida = 0;

        int opcao = 0;

        do{ 
            try{
                menu();
                opcao = teclado.nextInt();
                teclado.nextLine();

            switch(opcao){
                case 1:
                if(senha_Distribuida < 50){
                fila.enfileirar(new Senha(senha_Distribuida));
                senha_Distribuida++;
                System.out.println("UAU! Minha senha é: " + senha_Distribuida);
                } else {
                    System.out.println("SÓ VAMOS ATENDER QUEM JÁ TA NA FILA, HEIN");
                }
                teclado.nextLine();
                break;
            
                case 2:
                s = fila.desinfileirar();
                System.out.println("É A VEZ DA SENHA " + fila.inicio);
                teclado.nextLine();
                break; 

                case 3:
                System.out.println("Quer ver o que na fila? ESPERA SUA VEZ!");
                System.out.println("Início: " + fila.inicio);
                System.out.println("Fim: " + fila.fim);
                teclado.nextLine();
                break; 

                case 4:
                System.out.println("AQUI É A POLÍCIA! ESSA FILA É PROIBIDA!");
                System.exit(0);
                
                default:
                System.out.println("AÍ, NÃO VALE FURAR FILA, HEIN!");
                teclado.nextLine();
                break;
            }
        } catch(InputMismatchException e){
            System.out.println("A fila é pra lá, camarada!");
            teclado.nextLine();
        }

    }  while(opcao != 4);
    
    teclado.close();
}
}
