import java.util.Random;

public class VetorChoice {

    static Random random = new Random(300);
    static int uPosicao = -1;
    static int ultimaOperacao = - 1;

    public static void addInicio(int[] vet, int gerador) throws Exception{
        if (uPosicao == vet.length-1)
        throw new Exception("Vetor cheio");
        

        if (uPosicao == -1) {
            addFim(vet, gerador);
        } else {
            for (int i = uPosicao; i >= 0; i--) {
                vet[i + 1] = vet[i];
            }
            vet[0] = gerador;
            uPosicao++;
        }
    }
    

    public static void addFim(int[] vet, int gerador) throws Exception {
        if(uPosicao==vet.length-1)
        throw new Exception("Não há posições livres");

        vet[++uPosicao] = gerador;
    }

    public static void addTres(int[] vet, int element) throws Exception {
        if (uPosicao == vet.length-1)
        throw new Exception("Não há posições livres");

        if (ultimaOperacao == 1)
        addInicio(vet, element);
        
        if (ultimaOperacao == 2)
         if(uPosicao == -1){
            addInicio(vet, element);
         }  else {
            vet[uPosicao+1] = vet[uPosicao];
            vet[uPosicao] = element;
            uPosicao++;
         } 
    }


    public static void opcao(int[] vet, int element) throws Exception{
        if (vet.length == uPosicao)
        throw new Exception ("vetor vazio");
        
        Random op = new Random();

            int opcao = op.nextInt(3)+1;
            System.out.println("Opção: " + opcao + " elemento: " + element);

            if (opcao == 1){
                addInicio(vet, element);
            }

            if(opcao == 2){
                addFim(vet, element);
            }

            if(opcao == 3){
                addTres(vet, element);
                } 
                ultimaOperacao = opcao;
        }
        public static void printf(int vet[]) throws Exception{
            if (uPosicao == vet.length-1)
            throw new Exception("Vetor vazio");

            for (int i = 0; i<=uPosicao; i++){
                System.out.print(vet[i]+ " ");
            }
        }

    public static void main(String[] args) throws Exception{

        int vet[] = new int[100];
        
        for(int i=0; i<100; i++){

            int gerar = random.nextInt(300);

            opcao(vet, gerar);
        }

        printf(vet);

    }     
   }