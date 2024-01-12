public class Pilha {
    static final int MAX_TAM = 100;
    Processo[] pilha = new Processo[MAX_TAM];
    int topo = -1;

    public boolean isVazia() {
        return topo == -1;
    }

    public int getTamanho() {
        return topo + 1;
    }

    public void push(Processo p) throws Exception {
        if (topo == MAX_TAM - 1)
            throw new Exception("Não há espaço disponível");
        pilha[++topo] = p;
        // incrementa posição antes de adicionar ao topo
    }

    public Processo pop() throws Exception {
        if (isVazia())
            throw new Exception("Lista vazia");
        return pilha[topo--];
        // pós-decrementa
    }

    public int busca(int codigo) throws Exception {
        int posicao = -1;
    
        for (int i = 0; i <= topo; i++) {
            Processo p = pilha[i];
            posicao++;
    
            if (p.codigo == codigo) {
                System.out.println("Processo " + codigo + " encontrado na posição: " + posicao);
                return posicao;
            }
        }
    
        throw new Exception("Não há processos com o código " + codigo);
    }
}