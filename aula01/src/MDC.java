import java.util.Scanner;

public class MDC {    
    public static int mdc(int x, int y){
        if (x >= y && x % y == 0)
        return y;

        else if (x < y)
        return mdc(y, x);

        else
        return mdc(y, x % y);
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Esse programa irá calcular o MDC entre dois números!");
        
        System.out.print("Digite o primeiro número: ");
        int x = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int y = teclado.nextInt();

        System.out.print("MDC é: " + mdc(x,y));

        teclado.close();
    }
}

