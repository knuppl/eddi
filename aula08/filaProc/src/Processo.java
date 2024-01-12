public class Processo {
    static int proximoCodigo = 1;
    int codigo;
    String titulo;

    public Processo(){}

    public Processo(int codigo, String titulo){
        this.codigo = proximoCodigo;
        proximoCodigo++;
        this.titulo = titulo; 
    }
}
