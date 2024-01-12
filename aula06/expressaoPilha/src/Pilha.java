public class Pilha {

    private int MAX_TAM = 100;

    Expressao[] pilha = new Expressao[MAX_TAM];

    int topo = -1;

    public boolean isVazia() {
        return topo == -1;
    }

    public int getTamanho() {
        return topo + 1;
    }

    public void push(Expressao e) throws Exception {
        if (topo == MAX_TAM - 1)
            throw new Exception("Não há espaço disponível");
        pilha[++topo] = e;
    }

    public Expressao pop() throws Exception {
        if (isVazia())
            throw new Exception("Pilha vazia");

        return pilha[topo--];

    }

    public void verifica(Expressao e) throws Exception {

        try {
            for (int i = 0; i < e.elemento.length(); i++) {
                char par = e.elemento.charAt(i);

                if (par == ('(')) {
                    push(new Expressao());
                } else if (par == (')')) {
                    if (!isVazia()){
                        pop();
                    } else {
                        System.out.println("Expressão inválida! Parênteses desalinhados!");
                        System.exit(0);
                    }
                }

            }
        } catch (Exception erro) {
            throw new Exception("Erro. Verifique:" + erro.getMessage());
        }
        if (isVazia()) {
            System.out.println("Expressão correta! Parênteses alinhados!");
        } else {
            System.out.println("Expressão inválida! Parênteses desalinhados!");
        }
    }
}