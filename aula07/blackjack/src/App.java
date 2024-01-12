import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Random gerador = new Random();
        int choice = 0;

        Scanner teclado = new Scanner(System.in);

        PilhaReferencia J1 = new PilhaReferencia();
        PilhaReferencia J2 = new PilhaReferencia();

        Blackjack b21 = new Blackjack();

        int somaTotal1 = 0;
        int somaTotal2 = 0;

        int ultimoNumero = 0;

        while (true) {
            System.out.println("RETIRADA DE CARTAS DO JOGADOR 1");
            System.out.println("1. Tirar");
            System.out.println("2. Parar");

            try {
                choice = teclado.nextInt();
            } catch (InputMismatchException erro) {
                System.out.println("Digite um número entre 1 e 2");
                teclado.nextLine();
                continue;
            }

            if (choice == 1) {
                int numero = gerador.nextInt(12) + 1;
                J1.push(new Blackjack(numero));
                System.out.println("Carta tirada: " + numero);
                somaTotal1 += numero;
                ultimoNumero = numero;

                if (somaTotal1 > 21) {
                    b21 = J1.pop();
                    somaTotal1 -= ultimoNumero;
                    somaTotal1 -= 5;
                    System.out.println("O jogador 1 estourou os pontos! Fim da rodada!");
                    break;
                }
            } else if (choice == 2) {
                System.out.println("O jogador 1 encerrou suas jogadas");
                System.out.println("Vez do jogador 2");
                break;
            }
        }
            while (true) {
                System.out.println("RETIRADA DE CARTAS DO JOGADOR 2");
                System.out.println("1. Tirar");
                System.out.println("2. Parar");

                try {
                    choice = teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Digite um número entre 1 e 2");
                    teclado.nextLine();
                    continue;
                }

                if (choice == 1) {
                    int numero = gerador.nextInt(12) + 1;
                    J2.push(new Blackjack(numero));
                    System.out.println("Carta tirada: " + numero);
                    somaTotal2 += numero;
                    ultimoNumero = numero;

                    if (somaTotal2 > 21) {
                        b21 = J2.pop();
                        somaTotal2 -= ultimoNumero;
                        somaTotal2 -= 5;
                        System.out.println("O jogador 2 estourou os pontos! Fim da rodada");
                        break;
                    } 
                } else if (choice == 2) {
                        System.out.println("O jogador 2 encerrou sua jogada!");
                        System.out.println("Fim do jogo");
                        break;
                    }
                }
                System.out.println("FIM DO JOGO!");
                if (somaTotal2 > somaTotal1) {
                    System.out.println("O jogador 2 ganhou com " + somaTotal2 + " pontos. Cartas tiradas:");
                    while(!J2.isVazia()){
                    b21 = J2.pop();
                    System.out.println(b21.numero);
                    }
                } else if (somaTotal2 < somaTotal1) {
                    System.out.println("O jogador 1 ganhou com " + somaTotal1 + " pontos. Cartas tiradas:");
                    while(!J1.isVazia()){
                    b21 = J1.pop();
                    System.out.println(b21.numero);
                    }
                } else
                    System.out.println("Jogo empatado com " + somaTotal1 + " pontos");
            System.exit(0);

            teclado.close();
        }
}