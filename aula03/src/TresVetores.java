import java.util.Scanner;
import java.util.InputMismatchException;

public class TresVetores {

    static int opcao = 0;
    static int uPosicao = -1;
    static int uPosicao2 = -1;
    static int uPosicao3 = -1;
    static int[] vet1 = new int[10];
    static int[] vet2 = new int[10];
    static int[] vetGrandao = new int[20];
    static int num;

    public static void insereValor(int[] vet1, int num) throws Exception {
        if (uPosicao == vet1.length)
            throw new Exception("Não há posições livres");

        int i;
        for (i = uPosicao; i >= 0 && vet1[i] > num; i--) {
            vet1[i + 1] = vet1[i];
        }

        vet1[i + 1] = num;
        uPosicao++;
    }

    public static void insereValor2(int[] vet2, int num) throws Exception {
        if (uPosicao2 == vet2.length)
            throw new Exception("Não há posições livres");

        int i;
        for (i = uPosicao2; i >= 0 && vet2[i] > num; i--) {
            vet2[i + 1] = vet2[i];
        }

        vet2[i + 1] = num;
        uPosicao2++;
    }

    public static void unirVet(int[] vet1, int[] vet2, int[] vetGrandao) {
        int i = 0, j = 0, k = 0;
    
        while (i <= uPosicao && j <= uPosicao2) {
            if (vet1[i] < vet2[j]) {
                vetGrandao[k++] = vet1[i++];
            } else {
                vetGrandao[k++] = vet2[j++];
            }
            uPosicao3 = k - 1;
        }
    
        while (i <= uPosicao) {
            vetGrandao[k++] = vet1[i++];
            uPosicao3 = k - 1;
        }
    
        while (j <= uPosicao2) {
            vetGrandao[k++] = vet2[j++];
            uPosicao3 = k - 1; 
        }
    }
    
    
    public static void listar(int[] vet) {
        if (uPosicao > -1) {
            System.out.println("Lista de valores:");
            for (int i = 0; i <= uPosicao; i++) {
                System.out.println(vet[i]);
            }
        } else {
            System.out.println("Não há números a serem exibidos");
        }
    }

        public static void listar2(int[] vet){
                    if (uPosicao2 > -1) {
            System.out.println("Lista de valores:");
            for (int i = 0; i <= uPosicao2; i++) {
                System.out.println(vet[i]);
            }
        } else {
            System.out.println("Não há números a serem exibidos");
        }
        }
    
        public static void listar3(int[] vet){
            if (uPosicao3 > -1) {
            System.out.println("Lista de valores:");
            for (int i = 0; i <= uPosicao3; i++) {
                System.out.println(vet[i]);
            }
        } else {
            System.out.println("Não há números a serem exibidos");
        }
        }

    public static void escolheVetor() {
        System.out.println("TRÊS VETORES:");
        System.out.println("1.Adicionar número ao Vetor 1");
        System.out.println("2.Adicionar número Vetor 2");
        System.out.println("3. Unir vetores no Grandão");
        System.out.println("4. Mostrar Vetor 1");
        System.out.println("5. Mostrar Vetor 2");
        System.out.println("6. Mostrar o poderoso Vetor Grandão");
        System.out.println("7.Sair");

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        do {
            try {
                escolheVetor();
                opcao = teclado.nextInt();
                teclado.nextLine();
            } catch (InputMismatchException erro) {
                teclado.nextLine();
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número a ser adicionado no Vetor 1");
                    num = teclado.nextInt();
                    try {
                        insereValor(vet1, num);
                        System.out.println("Número adicionado");
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Digite o número a ser adicionado no Vetor 2");
                    num = teclado.nextInt();
                    try {
                        insereValor2(vet2, num);
                        System.out.println("Número adicionado!");
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        unirVet(vet1, vet2, vetGrandao);
                        System.out.println("Poderoso vetor criado!");
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Mostrando Vetor 1:");
                        listar(vet1);
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Mostrando Vetor 2: ");
                        listar2(vet2);
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        System.out.println("Mostrando o Poderoso Vetor Grandão: ");
                        listar3(vetGrandao);
                        teclado.nextLine();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Opção inválida");
                    teclado.nextLine();
            }

        } while (opcao != 7);
        teclado.close();
    }
}