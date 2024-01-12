public class No {
    public No proximo;
    public No anterior;
    public Pessoa elemento;
    public No (Pessoa elemento, No anterior, No proximo){
        this.elemento = elemento;
        this.anterior = anterior;
        this.proximo = proximo;
    }
    public No(){
        this.elemento = null;
        this.anterior = null;
        this.proximo = null;
    }

}
