public class FilaArranjo {
 static final int TAM_MAX = 50;

 int inicio = 0;
 int fim = 0;
 int tamanho = 0;
 int senhas_distribuidas = 0;
 
 Senha vetor[] = new Senha[TAM_MAX];
    
 public boolean isFull() {
    return tamanho == TAM_MAX;
 }

 public boolean isEmpty(){
    return tamanho == 0;
 }

 public void enfileirar(Senha s) throws Exception{
    if(isFull()){
    throw new Exception("Fila ta cheia!");
    }

    if(senhas_distribuidas == TAM_MAX){
        System.out.println("Acabaram as senhas por hoje");
        return;
    }
    
    vetor[fim] = s;
    fim++;
    
    if(fim == TAM_MAX)
    fim = 0;

    tamanho++;
    senhas_distribuidas++;

    
 }

public Senha desinfileirar() throws Exception{
    if(isEmpty())
    throw new Exception("Fila vazia");

    Senha aux = vetor[inicio];
    inicio++;

    if(inicio == TAM_MAX)
    inicio = 0;
    
    tamanho--;
    return aux;
}

}

