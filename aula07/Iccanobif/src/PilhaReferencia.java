public class PilhaReferencia {
    int tam = 0;
    Iccanobif topo;
    public PilhaReferencia() {
        topo = null;
    }

    public boolean isVazia(){
        return tam == 0;
    }


    public int getTamanho(){
        return tam;
    }

    public void push(Iccanobif i){
        if (tam != 0)
        i.proximo = topo;
        topo = i;
        ++tam;
    }

    public Iccanobif pop() throws Exception {
        if(tam == 0)
        throw new Exception("A pilha está vazia");

        Iccanobif i = topo;
        topo = topo.proximo;
        --tam;
        return i;
    }

    public int fibo(int numero) {
        int antepenultimo = 0;
        int penultimo = 0;
        int atual = 1;
        
        if ( (numero == 0) || (numero == 1)){
        push(new Iccanobif(numero));
            return numero;

        }
        push(new Iccanobif(0));
        push(new Iccanobif(1));

        for (int i = 2; i <= numero; i++){
            antepenultimo = penultimo;
            penultimo = atual;
            atual = antepenultimo + penultimo;
        push(new Iccanobif(atual));
        }
        return atual;
    }

}
