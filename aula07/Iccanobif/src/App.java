import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        PilhaReferencia fibonacci = new PilhaReferencia();
        Iccanobif i = new Iccanobif();

        System.out.println("Digite um número para cálculo de Fibonacci:");
        int numero = teclado.nextInt();

        fibonacci.fibo(numero);
        
        System.out.println("Fibonacci em " + numero + ":");
        while(!fibonacci.isVazia()){
        i = fibonacci.pop();
        System.out.println(i.numero);
        }
        teclado.close();
    }
}
