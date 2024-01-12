public class Time {
    private int codigo;
    private String nome;
    private int anoFundacao;
    private String presidente;
    private String tecnico;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public String getPresidente() {
        return presidente;
    }
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    
    public Time(int codigo, String nome, int anoFundacao, String presidente, String tecnico) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.presidente = presidente;
        this.tecnico = tecnico;
    }

    public Time(){}

    
}
