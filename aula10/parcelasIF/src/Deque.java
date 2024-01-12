public class Deque {
    static final int TAM_MAX = 1000;

    int inicio = 0;
    int fim = -1;
    int tamanho = 0;

    Financiamento vetor[] = new Financiamento[TAM_MAX];

    public boolean isFull() {
    return tamanho == TAM_MAX;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public void addInicio(Financiamento f) throws Exception {
        if(isFull())
        throw new Exception("Você não pode parcelar em mais de 1000x");

        inicio = (inicio - 1 + TAM_MAX) % TAM_MAX;
        
        f.setParcelaSemJuros(f.getValorParcela());
        f.calcularValorParcela();

        
        vetor[inicio] = f;

        tamanho++;

        if(tamanho == 1)
            fim = inicio;
    }

    public void addFim(Financiamento f) throws Exception {
        if(isFull())
        throw new Exception("Você não pode parcelar em mais de 1000x");

        if(isEmpty())
        addInicio(f);

        else{
        fim = (fim + 1) % TAM_MAX;
        
        f.setParcelaSemJuros(f.getValorParcela());

        f.calcularValorParcela();

                
        vetor[fim] = f;
        tamanho++;

    }
    }

    public Financiamento removeInicio() throws Exception {
        if(isEmpty())
        throw new Exception("Você ainda não possui parcelas a pagar.");

        Financiamento f = vetor[inicio];
        inicio = (inicio + 1) % TAM_MAX;
                        
        tamanho--;
        
        return f;
    }

    public Financiamento removeFim() throws Exception {
        if(isEmpty())
        throw new Exception("Você não possui parcelas a pagar.");

        Financiamento f = vetor[fim];

        fim = (fim - 1 + TAM_MAX) % TAM_MAX;
        
            if (tamanho > 1) {
            f.setJuros(0);
            f.setValorParcela(f.getParcelaSemJuros());
            f.calcularValorParcela(); 
            }
        
        tamanho--;

        return f;
    }

    public int size(){
        return tamanho;
    }

    public void print() throws Exception {
        if(isEmpty())
        throw new Exception("Voce nao tem nada a pagar.");
        
        int indice = inicio;
        
        if(tamanho > 1)
        System.out.println("ATENÇAO: Caso pague a ultima parcela, não pagara juros");
        
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Parcela: %.2f | ", vetor[indice].getValorParcela());
            indice = (indice + 1) % TAM_MAX;
        }

        System.out.println();
    }
        	
    }