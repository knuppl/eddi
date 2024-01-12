public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private float valor;
    public Veiculo elemento;

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

    public Veiculo(){}

    public Veiculo(String placa, String marca, String modelo, float valor){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

}
