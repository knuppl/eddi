public class ListaEncadeada {
    private No cabeca = new No();
    //último elemento tbm foi declarado como cabeça
    private No cauda = cabeca;
    //variável para manipulação do elemento
    private No elemento;

    public int tamanho = 0;

    public void addInicio(Veiculo v) {
        elemento = new No (v, null);
        if(tamanho == 0){
        //se a lista estiver vazia, o ponteiro do cabeça será o próprio elemento;
        cabeca.proximo = elemento;
        //a cauda é o próprio elemento
        cauda = elemento;
    } else {
        //se não estiver vazio, o elemento.adicionado.proximo será igual o ponteiro cabeca.proximo 
        elemento.proximo = cabeca.proximo;
        //elemento recebe o ponteiro para o cabeça.próximo
        cabeca.proximo = elemento;
    }
    tamanho++;
    }

    public void addFim(Veiculo v) {
        if (tamanho == 0)
        addInicio(v);
        else {
            elemento = new No(v, null);
            //próximo depois da cauda será o elemento
            cauda.proximo = elemento;
            //cauda será o elemento
            cauda = elemento;
            tamanho++;
        }
    }

    public void delete(String placa) throws Exception {
        if (tamanho == 0) {
            throw new Exception ("Lista vazia");
        } else {
            //anterior é o cabeça
            No anterior = cabeca;
            //atual é o próximo do cabeça
            No atual = cabeca.proximo;
            //enquanto cabeça for diferente de nulo
            while (atual != null) {
                //se o próximo elemento for o nome da placa
                if (atual.elemento.getPlaca().equals(placa)) {
                    anterior.proximo = atual.proximo;
                    tamanho--;
                    return; // Elemento deletado e saindo do método
                }
                anterior = atual;
                atual = atual.proximo;
            }
            // Se chegou aqui, não encontrei a placa
            throw new Exception("Placa não encontrada");
        }
    }

    public void print() {
        No el = cabeca.proximo;
        while (el!=null){
            System.out.println("Placa: " + el.elemento.getPlaca());
            System.out.println("Marca: " + el.elemento.getMarca());
            System.out.println("Modelo: " + el.elemento.getModelo());
            System.out.println("Valor: " + el.elemento.getValor());
            System.out.println("==============================");
            
            el = el.proximo;
        }            
        }

    }    

