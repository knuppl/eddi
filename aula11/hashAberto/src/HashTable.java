public class HashTable {
    public static final int M = 21;
    private Livro[] tabela;

    public HashTable() {
        tabela = new Livro[M];
    }

    private int hash(String chave) {
        int h = 0;
        for (int i = 0; i < chave.length(); ++i)
            h = (31 * h + Math.abs(chave.charAt(i))) % M;
        return h;
    }

    public void put(Livro livro) throws Exception {
        int hash = hash(livro.getISBN());

        for (int salto = 0; salto < tabela.length; salto++) {
            int indice = (hash + salto) % tabela.length;

            if (tabela[indice] == null || tabela[indice].getISBN().equals(livro.getISBN())) {
                tabela[indice] = livro;
                return;
            }
        }

        throw new Exception("Não há espaço disponível");
    }

    public Livro get(String chave) {
        int hash = hash(chave);
        int indice = hash;

        while (tabela[indice] != null && !chave.equals(tabela[indice].getISBN())) {
            indice = (indice + 1) % tabela.length;
        }

        return (tabela[indice] != null && chave.equals(tabela[indice].getISBN())) ? tabela[indice] : null;
    }

    public Livro remove(String chave) throws Exception {
        int hash = hash(chave);

        for (int salto = 0; salto < tabela.length; salto++) {
            int indice = (hash + salto) % tabela.length;

            if (tabela[indice] == null) {
                throw new Exception("Registro não está presente");
            } else if (chave.equals(tabela[indice].getISBN())) {
                Livro livroRemovido = tabela[indice];
                tabela[indice] = null;
                return livroRemovido;
            }
        }

        throw new Exception("Registro não está presente");
    }

    public void status() {
        for (int i = 0; i < M; ++i) {
            if (tabela[i] != null) {
                System.out.printf("A posição %d possui um livro\n", i);
            } else {
                System.out.printf("A posição %d não possui livro cadastrado\n", i);
            }
        }
    }
}