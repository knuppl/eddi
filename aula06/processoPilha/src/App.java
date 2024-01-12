public class App {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();

        Pilha Rosimeire = new Pilha();
        Pilha Afonso = new Pilha();
        Pilha Ana = new Pilha();

        Processo proc = new Processo();

        p.push(new Processo(1, "Rosimeire", "Acme"));
        p.push(new Processo(2, "Afonso", "Samsung"));
        p.push(new Processo(3, "Rosimeire", "Lenovo"));
        p.push(new Processo(4, "Ana", "Lenovo"));
        p.push(new Processo(5, "Afonso", "Acme"));
        p.push(new Processo(6, "Rosimeire", "Lenovo"));

        System.out.println("Lista de processos a serem executados: ");

        p.busca(3);
        try{
        p.busca(10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        while (!p.isVazia()) {
            proc = p.pop();
            System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n",
                    proc.responsavel, proc.codigo, proc.cliente);

            if (proc.responsavel.equals("Rosimeire")) 
                Rosimeire.push(proc);

                if (proc.responsavel.equals("Ana")) 
                    Ana.push(proc);

                if (proc.responsavel.equals("Afonso"))
                    Afonso.push(proc);

            }


        System.out.println("Lista dos processos de Rosimeire: ");
        while (!Rosimeire.isVazia()) {
            proc = Rosimeire.pop();
            System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n",
                    proc.responsavel, proc.codigo, proc.cliente);
        }

            System.out.println("Lista dos processos de Ana: ");
            while (!Ana.isVazia()) {
                proc = Ana.pop();
                System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n",
                        proc.responsavel, proc.codigo, proc.cliente);
            }
                System.out.println("Lista dos processos de Afonso: ");
                while (!Afonso.isVazia()) {
                    proc = Afonso.pop();
                    System.out.printf("Responsável: %s\t\t Código: %d\t Cliente: %s\n",
                            proc.responsavel, proc.codigo, proc.cliente);
                }

            }
        }    
