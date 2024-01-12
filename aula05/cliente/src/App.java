public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lst = new ListaEncadeada();
        lst.add(new Cliente(1, "Fernanda", 192344));
        lst.add(new Cliente(23, "Gabriel", 23244));
        lst.add(new Cliente(2, "Fernando", 23444));
        lst.add(new Cliente(555, "Baroa", 1345));
        lst.add(new Cliente(45, "André", 23456));
        lst.add(new Cliente(10, "Maria", 23456));
        lst.add(new Cliente(30, "Naja", 123456));
        lst.add(new Cliente(35, "Bia", 23455));
        lst.print();
        System.out.println();

        lst.delete("Maria");
        lst.delete("Baroa");
                

        System.out.println("Lista após remoção:");
        lst.print();
    }
}
