public class Fila {
    private Elemento cabeca;
    private Elemento cauda;
    private int tamanho = 0;

    public boolean isVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void enfileirar(Elemento elemento){
        if (tamanho != 0){
            cauda.setProximo(elemento);
        } else {
            cabeca = elemento;
        }
        cauda = elemento;
        tamanho++;
    }

    public Elemento desenfileirar() throws Exception{
        if(isVazia())
        throw new Exception("Fila vazia!");

        Elemento el = cabeca;
        cabeca = cabeca.getProximo();
        tamanho--;
        return el;
    }
}
