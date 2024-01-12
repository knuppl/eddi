public class Financiamento{
    private double valorParcela;
    private double juros;
    private double parcelaSemJuros;

    public double getParcelaSemJuros() {
        return parcelaSemJuros;
    }

    public void setParcelaSemJuros(double parcelaSemJuros) {
        this.parcelaSemJuros = parcelaSemJuros;
    }

    public Financiamento(double valorParcela, double juros){
        this.valorParcela = valorParcela;
        this.juros = juros;
    }

    public Financiamento(){}


    public double getJuros(){
        return juros;
    }

    public void setJuros(double juros){
        this.juros = juros;
    }

    public double getValorParcela(){
        return valorParcela;
    }

    public void setValorParcela(double valorParcela){
        this.valorParcela = valorParcela;
    }

    public void calcularValorParcela() {
        valorParcela = (juros * valorParcela) + valorParcela;
    }

}