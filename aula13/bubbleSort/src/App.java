public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();
        
        l.add(new Aluno(10, "André"));
        l.add(new Aluno(9, "Gustavo"));
        l.add(new Aluno(7, "Pedro"));
        l.add(new Aluno(4, "Raphaela"));
        l.add(new Aluno(3, "Samuel"));
        l.add(new Aluno(12, "Yara"));
        l.add(new Aluno(8, "Daniel"));
        l.add(new Aluno(15, "Adrian"));
        l.add(new Aluno(21, "Rômulo"));
        l.add(new Aluno(31, "Dani"));
        l.add(new Aluno(23, "Nicholas"));

        System.out.println("Lista antes da ordenação:");
        l.print();
        System.out.println("================================");
        l.bubbleSort();
        System.out.println("Lista após a ordenação:");
        l.print();

    }
}
