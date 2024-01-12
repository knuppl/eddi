public class No {
    public No proximo;
    public Cliente elemento;
    public No (Cliente elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public No(){
        this.elemento = null;
        this.proximo = null;
    }
}
