public class App {
    public static void main(String[] args) throws Exception {
       Pilha B = new Pilha();
        Pilha F = new Pilha();
        BandaFilme Controle = new BandaFilme();

        B.bandaPush(new BandaFilme("Iron Maiden", "Banda"));
        B.bandaPush(new BandaFilme("Black Sabbath", "Banda"));
        B.bandaPush(new BandaFilme("Judas Priest", "Banda"));
        B.bandaPush(new BandaFilme("Motörhead", "Banda"));
        B.bandaPush(new BandaFilme("Venom", "Banda"));
        B.bandaPush(new BandaFilme("Slayer", "Banda"));
        B.bandaPush(new BandaFilme("Sarcófago", "Banda"));
        B.bandaPush(new BandaFilme("Sepultura", "Banda"));
        B.bandaPush(new BandaFilme("Celtic Frost", "Banda"));
        B.bandaPush(new BandaFilme("Ghost", "Banda"));

        F.filmePush(new BandaFilme("The Good, the Bad and the Ugly", "Filme"));
        F.filmePush(new BandaFilme("Once Upon a Time in the West", "Filme"));
        F.filmePush(new BandaFilme("O Retorno de Ringo", "Filme"));
        F.filmePush(new BandaFilme("Horror of Dracula", "Filme"));
        F.filmePush(new BandaFilme("Re-Animator", "Filme"));
        F.filmePush(new BandaFilme("Django", "Filme"));
        F.filmePush(new BandaFilme("Matrix", "Filme"));
        F.filmePush(new BandaFilme("A Hora do Pesadelo", "Filme"));
        F.filmePush(new BandaFilme("Danza Macabra", "Filme"));
        F.filmePush(new BandaFilme("A Hora do Espanto", "Filme"));

        System.out.println("Cadastros feitos em nosso Banco de Dados:");

        while(!B.isBandaVazia()){
        Controle = B.bandaPop();
        System.out.printf("[PILHA 1]   Nome: %-35sTipo: %s\n", Controle.nome, Controle.tipo);
    }

        while(!F.isFilmeVazia()){
            Controle = F.filmePop();
            System.out.printf("[PILHA 2]   Nome: %-35sTipo: %s\n", Controle.nome, Controle.tipo);
        }
        


    }
}
