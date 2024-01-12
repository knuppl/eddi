public class PilhaReferencia {
    int tam = 0;
    Blackjack topo;

    public boolean isVazia() {
        return tam == 0;
    }

    public int getTamanho() {
        return tam;
    }

    public void push(Blackjack b) {
        if (tam != 0)
            b.proximo = topo;
        topo = b;
        ++tam;
    }

    public Blackjack pop() throws Exception {
        if (tam == 0)
            throw new Exception("Pilha vazia!");
            
        Blackjack b = topo;
          topo = topo.proximo;
          --tam;
          return b;
        
    }

}
