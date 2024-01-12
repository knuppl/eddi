public class Elemento{
    public String elemento;
    Elemento proximo;

    public Elemento(String elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Elemento(){}

    public void setProximo(Elemento el){
        this.proximo = el;
    }

    public Elemento getProximo(){
        return this.proximo;
    }
}