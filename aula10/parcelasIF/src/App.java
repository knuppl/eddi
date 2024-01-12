import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void menu(){
        System.out.println("1. Meu financiamento");
        System.out.println("2. Pagar primeira parcela");
        System.out.println("3. Pagar última parcela");
        System.out.println("4. Ver minha dívida");
        System.out.println("5. SAIR");
    }
   public static void main(String[] args) throws Exception {
    Deque d = new Deque();
    Financiamento f = new Financiamento();

    Scanner teclado = new Scanner(System.in);
    
    int opcao = 0;
    double total = 0.0;
    int parcelas = 0;
    double valorParcela = 0.0;
    double juros = 0.00;

    do {
        try {
            menu();
            opcao = teclado.nextInt();
            teclado.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Digite uma opção válida!");
            teclado.nextLine();
        }

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do seu financiamento: ");
                total = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Digite em quantas parcelas você quer o financiamento: ");
                parcelas = teclado.nextInt();
                teclado.nextLine();

                valorParcela = total / parcelas;

                try {
                    for (int i = 0; i < parcelas; i++) {
                        juros += 0.01;
                        d.addFim(new Financiamento(valorParcela, juros));
                    }
                    System.out.println("Financiamento feito em " + parcelas + " parcelas iguais com juros bem baixos");
                    teclado.nextLine();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                try {
                    f = d.removeInicio();
                    System.out.println("Parcela paga no valor de R$" + f.getValorParcela());
                    teclado.nextLine();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 3:
                try {
                    f = d.removeFim();
                    System.out.println("Parcela paga sem juros! Total a pagar: R$" + f.getValorParcela());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 4:
                try {
                    d.print();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 5:
                System.out.println("Saindo do programa.");
                System.exit(0);

            default:
                System.out.println("Digite uma opção válida");

        }
    } while (opcao != 5);

    teclado.close();
}
}