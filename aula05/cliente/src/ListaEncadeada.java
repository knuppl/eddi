public class ListaEncadeada {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    public int tamanho = 0;

    public void addInicio(Cliente c){
        elemento = new No(c, null);
        if (tamanho == 0){
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            cabeca.proximo = elemento;
        }
        tamanho++;
    }
    public void addFim(Cliente p){
        if (tamanho==0)
            addInicio(p);
        else{
            elemento = new No(p,null);
            cauda.proximo = elemento;
            cauda = elemento;
            tamanho++;
        }
    }

    public void add(Cliente c) {
        elemento = new No(c, null);
    
        if (tamanho == 0) 
            addInicio(c);
            
        else if (c.getCodigo() > cauda.elemento.getCodigo())
        addFim(c);
        
         else {
            No anterior = cabeca;
            No atual = cabeca.proximo;
    
            while (c.getCodigo() > atual.elemento.getCodigo()) {
                anterior = atual;
                atual = atual.proximo;
            }
            
            anterior.proximo = elemento;
            elemento.proximo = atual;
            tamanho++;
        }
    }

        public void delete(String nome) throws Exception {
            if (tamanho == 0) {
                throw new Exception ("Lista vazia");
            } else {
                //anterior é o cabeça
                No anterior = cabeca;
                //atual é o próximo do cabeça
                No atual = cabeca.proximo;
                //enquanto cabeça for diferente de nulo
                while (atual != null) {
                    //se o próximo elemento for o nome do cliente
                    if (atual.elemento.getNome().equals(nome)) {
                        anterior.proximo = atual.proximo;
                        tamanho--;
                        return; // Elemento deletado e saindo do método
                    }
                    anterior = atual;
                    atual = atual.proximo;
                }
                // Se chegou aqui, não encontrei o nome
                throw new Exception("Nome não encontrado");
            }
        }

    public void print(){
        No el = cabeca.proximo;
        while(el!=null){
            System.out.println("Código: " + el.elemento.codigo);
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Telefone: " + el.elemento.telefone);
            System.out.println("===============================");
            
            el = el.proximo;
        }
    }
}
