public class Node {
    Aluno elemento;
     Node esquerda;
     Node direita;

    public Node(Aluno elemento){
        this.elemento = elemento;
        this.direita = null;
        this.esquerda = null;
    }

    @Override
    public String toString() {
        return "Node [elemento=" + elemento + ", esquerda=" + esquerda + ", direita=" + direita + "]";
    }
}