public class ListaFilme {
    private int tam = 20;
    private Filme[] F;
    private int ultimo = -1;
    public ListaFilme(){
        F = new Filme[tam];
    }

     public int tamanho(){
        return ultimo;
    }

    public Filme get(int pos) throws Exception{
        if(pos>=ultimo)
        throw new Exception("Não existe esse elemento");
        return F[pos];
    }

    public void add(Filme f) throws Exception {
        if(ultimo == tam-1)
        throw new Exception("Está cheio!");

    int i;

    for(i=ultimo;i>=0 && f.codigo < F[i].codigo;i--){
        F[i+1] = F[i];
    }
    F[i+1] =  f;
    ultimo++;
    }

    public Filme delete(int codigo) throws Exception {
        if (ultimo == -1)
            throw new Exception("Lista Vazia!");
    
        int p = 0;
    
        while (p <= ultimo && (F[p] == null || F[p].codigo != codigo))
            p++;
    
        if (p > ultimo || F[p] == null) {
            System.out.println("Filme não encontrado ou já foi removido.");
            return null;
        }
    
        Filme filmeexcluido = F[p];
        ultimo--;
    
        for (int aux = p; aux <= ultimo; aux++) {
            F[aux] = F[aux + 1];
        }
        F[ultimo + 1] = null;
    
        System.out.println("Filme excluído com sucesso.");
        return filmeexcluido;
    }

    
public void aumentar() throws Exception {
    if (ultimo == F.length-1){
        Filme[] elementosNovos = new Filme[tam * 2];

        for(int i=0; i<=ultimo; i++){
            elementosNovos[i] = F[i];
        }
        F = elementosNovos;
        tam = F.length;
    }    
}

public Filme busca(String nome) throws Exception {
    if (ultimo == -1) {
        throw new Exception("Lista vazia");
    }

    for (int i = 0; i <= ultimo; i++) {
        if (F[i].nome.equals(nome)) {
            System.out.printf("Código: %d, Nome: %s, Gênero: %s%n", F[i].codigo, F[i].nome, F[i].genero);
            return F[i];
        }
    }

    System.out.println("Filme não cadastrado.");
    return null;
}

public void print() throws Exception {
    if (ultimo == -1)
    throw new Exception ("Lista vazia");

    for (int i=0; i<=ultimo; i++){
        System.out.println("Código: " + F[i].codigo);
        System.out.println("Nome: " + F[i].nome);
        System.out.println("Gênero: " + F[i].genero);
        System.out.println("==============================");
    }
}

}
