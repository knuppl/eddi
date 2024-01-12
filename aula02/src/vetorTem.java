import java.util.Scanner;

public class vetorTem {
    static int[] vet = {1, 24, 43, 56, 67, 78, 233, 400, 450};

public static boolean possui (int[] vet, int x ){
    return buscar(vet, x, 0, vet.length - 1);
}

public static boolean buscar(int[] vet, int x, int inicio, int fim){
    if (inicio > fim){
        return false;
    }

    int meio = (inicio + fim) / 2;

    if(vet[meio] == x){
        return true;
    } else if (vet[meio] < x) {
        return buscar(vet, x, meio + 1, fim);
    } else {
        return buscar(vet, x, inicio, meio - 1);
    }   
}

public static void main (String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número");
    int n = teclado.nextInt();

    boolean existe = possui(vet, n);

    if (existe) {
        System.out.println("O número " + n + " está no vetor!");
    } else
    System.out.println("O número " + n + " não está no vetor!");

    teclado.close();
}
}