import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void menu() { 
        System.out.println("CONTROLE DE CADASTRO");
        System.out.println("1. Cadastro de Veículo");
        System.out.println("2. Deletar veículos");
        System.out.println("3. Mostrar veículos");
        System.out.println("4. SAIR");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        ListaEncadeada listaVeiculos = new ListaEncadeada();

        do {
            try {
                menu();
                opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite a placa do carro: ");
                        String placa = teclado.nextLine();

                        System.out.println("Digite a marca do carro: ");
                        String marca = teclado.nextLine();

                        System.out.println("Digite o modelo do carro: ");
                        String modelo = teclado.nextLine();

                        System.out.println("Digite o valor do carro: ");
                        float valor = teclado.nextFloat();
                        teclado.nextLine();

                        Veiculo veiculo = new Veiculo(placa, marca, modelo, valor);
                        listaVeiculos.addFim(veiculo);
                        System.out.println("Veículo cadastrado com sucesso.");
                        break;

                    case 2:
                        System.out.println("Digite a placa do carro:");
                        placa = teclado.nextLine();
                        try {
                            listaVeiculos.delete(placa);
                            System.out.println("Veículo com a placa " + placa + " excluído");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        listaVeiculos.print();
                        break;

                    case 4:
                        System.out.println("Saindo do programa.");
                        System.exit(0);
                        break;

                    default: 
                        System.out.println("Opção inválida");
                        break;
                }
            } catch (InputMismatchException erro) {
                System.out.println("Opção inválida. Tente novamente.");
                teclado.nextLine();
            }
        } while (opcao != 4);
            
        teclado.close();
    }
}