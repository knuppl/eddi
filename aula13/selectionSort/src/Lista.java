public class Lista {
    private int tam = 10;
    private Animal[] A;
    private int ultimo = 0;

    public Lista(){
        A = new Animal[tam];
    }

    public void add(Animal a) throws Exception{
        if (ultimo==A.length)
            throw new Exception("Não há espaço disponível.");
        A[ultimo] = a;
        ultimo++;
    }

    public Animal get(int pos) throws Exception{
        if (pos >= ultimo)
            throw new Exception("Não existe este elemento");
        return A[pos];
    }
    
    public void remove(int pos) throws Exception {
        if (pos >= ultimo)
            throw new Exception("Não existe este elemento");
        for (int i=pos;i<ultimo;i++)
            A[i] = A[i+1];
        ultimo--;
    }

    public int tamanho(){
        return ultimo;
    }

    public void selectionSort(){
        for(int i = 0; i < tam - 1; i++){
            int minimo = i;

        for (int j = i+1; j < tam; j++){
            if(A[j].codigo < A[minimo].codigo){
                minimo = j;
            }
        }
        Animal aux = A[minimo];
        A[minimo] = A[i];
        A[i] = aux;
        }
    }

    public void print(){
        for(int i = 0; i < A.length; i++){
            System.out.printf("Código: %d, Nome: %s, Raça: %s%n", A[i].codigo, A[i].nome, A[i].raca);
        }
    }
    
}