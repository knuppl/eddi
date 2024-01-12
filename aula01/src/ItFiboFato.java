import java.util.Scanner;

public class ItFiboFato {

    public static void menu(){
        System.out.println("CÁLCULO INTERATIVO: ");
        System.out.println("1. Fatorial");
        System.out.println("2. Fibonacci");
        System.out.println("3. SAIR");
    }

public static long fatorial(long n){
    int fatorial = 1;

    for (int i = 1; i <= n; i++)
    fatorial *= i;
    
    return fatorial;
}

public static long fibo(long x){
    int antPen, pen = 0, atual = 1;

    if ((x == 0)  ||  (x == 1))
    return x;

    for (int i = 2; i <= x; i++){
        antPen = pen;
        pen = atual;
        atual = antPen + pen;
    }

    return atual;
}

public static void main (String[] args){

    Scanner teclado = new Scanner(System.in);

    int opcao = 0;

    do {
        try {
            menu();
            opcao = teclado.nextInt();
            teclado.nextLine();
        } catch(NumberFormatException e){
            teclado.nextLine();
        }

        switch(opcao){

            case 1:

            System.out.println("Digite um número:");
            int fat = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Fatorial de " + fat + " é " + fatorial(fat));
            break;

            case 2: 

            System.out.println("Digite um número: ");
            int fibo = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Fibonacci de " + fibo + " é " + fibo(fibo));
            break;

            default:
            System.out.println("Digite uma opção válida");
        }
        } while(opcao != 3);
        
        teclado.close();

    }

}
