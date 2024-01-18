public class Aluno {
    int matricula;
    String nome;
    Aluno elemento;
    
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
    }
}