public class vetorValor {
    public static void main(String[] args) throws Exception {
        int[] vetor = {1, 2, 3, 4, 120, 239, -12, 4, 0, 43, 54, 232, 12};
        int maior = 0;
        int menor = 0;

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor)
            menor = vetor[i];
            
            if(vetor[i] > maior)
            maior = vetor[i];
        }
          System.out.println("Maior valor do vetor: " + maior);
        System.out.println("Menor valor do vetor: " + menor);
    }
}
//algoritmo possui complexidade assintótica de O(n)