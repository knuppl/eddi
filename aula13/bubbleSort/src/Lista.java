public class Lista {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    private int tamanho = 0;

    public int getTamanho(){
        return tamanho;
    }

    public void add(Aluno a){
        elemento = new No(a, null);
        if (tamanho == 0){
        cabeca.proximo = elemento;
        cauda = elemento;    
        } else {
            cauda.proximo = elemento;
            cauda = elemento;
        }
        tamanho++;
    }

    public void bubbleSort(){
        boolean trocou;

        do{
            trocou = false;
            No atual = cabeca.proximo;
            No anterior = cabeca;

            while (atual != null && atual.proximo != null){
                No maior = atual.proximo;

                if(atual.elemento.matricula > maior.elemento.matricula){
                    anterior.proximo = maior;
                    atual.proximo = maior.proximo;
                    maior.proximo = atual;
                    trocou = true;
                }

                anterior = atual;
                atual = atual.proximo;
            }
        } while (trocou);
    }

    public void print(){
        No el = cabeca.proximo;

        while (el.proximo != null){
            System.out.printf("Matrícula: %d, Nome: %s%n", el.elemento.matricula, el.elemento.nome);
            
            el = el.proximo;
        }
    }
} 

