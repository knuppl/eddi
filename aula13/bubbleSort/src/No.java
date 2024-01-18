public class No {
    public No proximo;
    public Aluno elemento;

    public No (Aluno elemento, No proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(){
        this.elemento = null;
        this.proximo = null;
    }
}
