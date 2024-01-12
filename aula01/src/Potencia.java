import java.util.Scanner;

public class Potencia {
    
    public static long potencia(long x){        
        if (x == 0)
        return 1;
        
        else
            return 2 * potencia (x - 1);
    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Eleve 2 a um número: ");
        long z = teclado.nextLong();

        System.out.print(potencia(z));

        teclado.close();

    }

}
