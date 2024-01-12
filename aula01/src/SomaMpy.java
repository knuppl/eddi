import java.util.Scanner;

public class SomaMpy {

    public static int mpy(int x, int y){
        if (x == 0 || y == 0)
        return 0;
        
        else 
            return x + mpy(x,y-1);
        
    }
        public static void main(String[] args){
            
            Scanner teclado = new Scanner(System.in);


            System.out.print("Digite o primeiro número: ");
            int x = teclado.nextInt();

            System.out.print("Digite o segundo número: ");
            int y = teclado.nextInt();

            System.out.print(mpy(x,y));

            teclado.close();

        }

    }
    
