public class Animal {
    int codigo;
    String nome;
    String raca;

    public Animal(int codigo, String nome, String raca){
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal [codigo=" + codigo + ", nome=" + nome + ", raca=" + raca + "]";
    }
}