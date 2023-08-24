package veic;

public class Carro {
    private double velocidade;
    private String placa;
    private String Cor;
    private String Modelo;


    public Carro(String Cor, String Modelo, String placa){
        this.Cor = Cor;
        this.Modelo = Modelo;
        this.placa = placa;
    }

    public void andar(double distancia){
        if (velocidade <= 0){
            velocidade = 20;
        }
        System.out.println("Estamos andando " +distancia);
    }
    public void frear(double forca){
        velocidade = 0;
        System.out.println("Esstamos parando" + forca);
    }
    public boolean capotar() {
        return true;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setCor(String cor) {
        Cor = cor;
    }
}
