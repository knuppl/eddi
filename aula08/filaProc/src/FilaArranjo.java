public class FilaArranjo {
    int tamanho = 0;
    int fim = 0;
    int inicio = 0;
    static final int TAM_MAX = 50;

    Processo vetor[] = new Processo[TAM_MAX];

    public boolean isFull() {
        return tamanho == TAM_MAX;
        }

        public boolean isEmpty(){
            return tamanho == 0;
        }

        public void enfileirar(Processo p) throws Exception{
            if(isFull()){
                throw new Exception("Ta cheio de processo!");
            }

            vetor[fim] = p;
            fim++;

            if(fim == TAM_MAX)
            fim = 0;

            tamanho++;
        }

        public Processo desinfileirar() throws Exception{
            if(isEmpty())
            throw new Exception("Não tem nada aqui, amigo!");
        
        Processo aux = vetor[inicio];
        inicio++;

        if(inicio == TAM_MAX){
            inicio = 0;
        }

        tamanho--;
        return aux;
        }

        public Processo pesquisa(int codigo) throws Exception{
            if(isEmpty())
            throw new Exception("Não há processos no sistema");

            for(int i = inicio; i < fim ;i++){
                if(vetor[i].codigo == codigo){
                System.out.println("Código " + codigo + " está na fila");
                System.out.println("Título: " + vetor[i].titulo);
                return vetor[i];
                }
            }
            return null;
        }
        
        public void imprimirFila(FilaArranjo fila) throws Exception{
            if(isEmpty()){
            throw new Exception("Fila já está vazia!");
            }
        System.out.println("Fila de processos:");
        int i = fila.inicio;

        do{
            System.out.printf("Código: %-5d Título: %s%n",
            fila.vetor[i].codigo, fila.vetor[i].titulo);
            i = (i+1) % FilaArranjo.TAM_MAX;
        } while(i != fila.fim);
        System.out.println();
    }


public void clear(FilaArranjo fila) throws Exception {
        if(isEmpty())
        throw new Exception("Fila vazia");

        for(int i=inicio;i != fim;i = (i+1) % TAM_MAX){
            vetor[i] = null;
        }

        tamanho = 0;
        inicio = 0;
        fim = 0;

        System.out.println("Fila agora está vazia!");
    }

    }