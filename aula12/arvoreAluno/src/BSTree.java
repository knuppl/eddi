public class BSTree {
    Node raiz = null;

    public void inserir(Node no, Aluno elemento){
        if (no!=null){
            if (elemento.matricula < no.elemento.matricula){
                if(no.esquerda != null)
            inserir(no.esquerda, elemento);
                else 
            no.esquerda = new Node(elemento);
            } else {
                if(no.direita != null)
                    inserir(no.direita, elemento);
                else 
                    no.direita = new Node(elemento);
            }
        } else {
            raiz = new Node(elemento);
        }
    } 

    public Node maximo(Node no) throws Exception{
        if (no == null)
            throw new Exception("Não há alunos no sistema.");
        if (no.direita != null)
            return maximo(no.direita);
        else
            return no;
    }

    private Node removeMaximo(Node no) throws Exception {
        if (no == null)
        throw new Exception ("Raiz nula.");
        if(no.direita != null){
            no.direita = (removeMaximo(no.direita));
            return no;
        } else {
            return no.esquerda;
        }
    }

    public Node buscarAluno(int matricula) throws Exception {
        Aluno aux = new Aluno(matricula, " ", " ");
        Node encontrado = buscarAluno(this.raiz, aux);
        System.out.println(encontrado.elemento);
        return buscarAluno(this.raiz, aux);
    }

    private Node buscarAluno(Node no, Aluno elemento) throws Exception{
        if(no == null){
            throw new Exception("Aluno não está cadastrado.");
        }
        if(this.raiz == null){
            throw new Exception("Não há cadastro de alunos no sistema.");
        }

        if(elemento.matricula == no.elemento.matricula){
            return no;
        } else if (elemento.matricula < no.elemento.matricula) {
            return buscarAluno(no.esquerda, elemento);
        }  else {
            return buscarAluno(no.direita, elemento);
        }
    }
        
        public void preOrdem (Node no){
            if (no!=null){
            System.out.println(no.elemento + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
            }
    }

        public Node remover(int matricula) throws Exception{
            Aluno aux = new Aluno(matricula, "", "");
            return remover(this.raiz, aux);
        }

        public Node remover(Node no, Aluno elemento) throws Exception {
            boolean ajuste = false;

            if (no == null) throw new Exception ("Aluno não encontrado.");
            if (this.raiz == null) throw new Exception ("Não há alunos cadastrados.");
            else {
                if(elemento.matricula < no.elemento.matricula){
                    no.esquerda = remover(no.esquerda, elemento);
                } else if (elemento.matricula > no.elemento.matricula){
                    no.direita = remover(no.direita, elemento);
                } else {
                    if(no.direita!=null && no.esquerda!=null){
                        no.elemento.matricula = maximo(no.esquerda).elemento.matricula;
                        no.direita = removeMaximo(no.esquerda);
                    } else {
                        if (no == raiz){
                            ajuste = true;
                        }
                        no = (no.direita != null) ? no.direita : no.esquerda;
                        if (ajuste)
                        raiz = no;
                    }
                }
                return no;
            }
        }
    }
