public class Pilha {
    static final int MAX_TAM = 20;
    BandaFilme[] pilha = new BandaFilme[MAX_TAM];
    int topo1 = -1;
    int topo2 = MAX_TAM;

    public boolean isBandaVazia(){
        return topo1 == -1;
    }

    public boolean isFilmeVazia(){
        return topo2 == MAX_TAM;
    }

    public int bandaTamanho(){
        return topo1 + 1;
    }

    public int filmeTamanho(){
        return MAX_TAM - topo2;
    }

    public void bandaPush(BandaFilme bf) throws Exception{
        if (topo1 + 1 == topo2)
        throw new Exception("Não há espaço disponível");
       pilha[++topo1] = bf;
    }

    public void filmePush(BandaFilme bf) throws Exception{
        if (topo2 - 1 == topo1)
        throw new Exception("Não há espaço disponível");
        pilha[--topo2] = bf;
    }

    public BandaFilme bandaPop() throws Exception{
        if (isBandaVazia()) 
        throw new Exception ("Lista vazia");
        
        return pilha[topo1--];
    }

    public BandaFilme filmePop() throws Exception{
        if (isFilmeVazia())
        throw new Exception ("Lista Vazia");

        return pilha[topo2++];
    }

}
