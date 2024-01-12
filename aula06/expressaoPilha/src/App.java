import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma função para análise:");
        String funcao = teclado.nextLine();

        Expressao e = new Expressao(funcao);

        try{
        p.verifica(e);
        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }
         teclado.close();
}
}