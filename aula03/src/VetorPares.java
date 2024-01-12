import java.util.Random;

public class VetorPares {

        
    public static int[] gerarVetor(int random) {
        int[] vetor = new int[random];
        Random gerar = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerar.nextInt(100);
            System.out.println(vetor[i]);
        }
        return vetor;
    }

        public static int removerPares(int[] vetor) throws Exception {
            int impares = 0;        
            
            if (vetor.length == -1){
               throw new Exception("O vetor está vazio");
            }

            for (int i = 0; i < vetor.length; i++){
                if (vetor[i] % 2 != 0){
                    vetor[impares] = vetor[i];
                    impares++;
                }
            }
            return impares;
        }

        public static void imprimeVetorImpar(int[] vetor, int tamanho){
            for (int i = 0; i < tamanho; i++){
                System.out.println(vetor[i]);
            }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Vetor gerado: ");
        int[] vet = gerarVetor(10);
         
        int novoTamanho = removerPares(vet);
        
        System.out.println("Vetor após exclusão dos pares: ");
        imprimeVetorImpar(vet, novoTamanho);
    }
}
