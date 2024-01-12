import java.util.Scanner;

public class Primo {
    public static boolean primo(int n, int i){
        if (n <= 2){
            return (n == 2) ? true : false;
        }
        if (n % i == 0){
            return false;
        }
        if (i * i > n){
            return true;
        } 
        
        return primo(n, i + 1);
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n = 0;

        while (n >= 0){
            System.out.println("Digite um número: ");
            n = teclado.nextInt();

            if(primo(n, 2)){
                System.out.println("É primo!");
            } else {
                System.out.println("Não é primo!");
            }
        }
        
        teclado.close();
    }
}
