import java.util.ArrayList;
import java.util.Iterator;

public class Hash {
    public static final int M = 17;
    private ArrayList<Time>[] tabela;
    int tamanho = 0;

    public Hash(){
        tabela = (ArrayList<Time>[]) new ArrayList[M];
    }

    private int hash (int chave){
        int h = 0;
        for (int i = 0; i < chave; ++i)
            h = (31 * h + chave) % M;
            return h;
    }


    public Time get(int chave) throws Exception{
        if(isEmpty())
        throw new Exception("Não há times cadastrados");

        int hash = hash(chave);
        ArrayList<Time> times = tabela[hash];
        if(times == null)
            return null;
        for(Time time: times)
            if (time.getCodigo() == chave)
                return time;
            return null;
    }

    public void put(Time t){
        int hash = hash(t.getCodigo());
        ArrayList<Time> times = tabela[hash];
        if (times == null){
            times = new ArrayList<Time>();
            times.add(t);
            tabela[hash] = times;
        } else {
            boolean achei = false;
            for (Time time : times)
                if (time.getCodigo() == t.getCodigo())
                    achei = true;
                    if(!achei)
                        times.add(t);
        }
        tamanho++;
    }

    public Time remove(int chave){
        int hash = hash(chave);
        ArrayList<Time> times = this.tabela[hash];

        Iterator<Time> it = times.iterator();
        Time atual = null;

        while (it.hasNext()){
            atual = it.next();
            if (atual.getCodigo() == chave){
                it.remove();
                tamanho--;
                return atual;
            }
        }
        return null;
    }

    public void listar() throws Exception {
        if(isEmpty())
            throw new Exception("Não há times cadastrados");
        
        System.out.println("Lista de times:");
        System.out.println("========================");
            for (ArrayList<Time> times : tabela) {
            if (times != null) {
                for (Time time : times) {
                    System.out.printf("Código: %d\n", time.getCodigo());
                    System.out.printf("Nome: %s\n", time.getNome());
                    System.out.printf("Ano de Fundação: %d\n", time.getAnoFundacao());
                    System.out.printf("Presidente: %s\n", time.getPresidente());
                    System.out.printf("Técnico: %s\n", time.getTecnico());
                    System.out.println("------------------------");
                }
            } 
        } 
        }

        public int getTamanho(){
            return tamanho;
        }

        public boolean isEmpty(){
            return tamanho == 0;
        }
    }


