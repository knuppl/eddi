public class NodeDeque<T> {
    private NodeDeque<T> proximo;
    private NodeDeque<T> anterior;
    private T info;

    public NodeDeque(T info){
        proximo = null;
        anterior = null;
        this.info = info;
    }

    public NodeDeque(){
        this(null);
    }

    public NodeDeque<T> getProximo(){
        return proximo;
    }

    public void setProximo(NodeDeque<T> proximo){
        this.proximo = proximo;
    }

    public NodeDeque<T> getAnterior(){
        return anterior;
    }

    public void setAnterior(NodeDeque<T> anterior){
        this.anterior = anterior;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public T getInfo(){
        return info;
    }
}
