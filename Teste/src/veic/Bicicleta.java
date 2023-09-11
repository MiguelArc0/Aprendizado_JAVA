package veic;

public class Bicicleta {

    private String cor;
    private double Aro;
    private boolean cesta;

    private int velocidade;
    public Bicicleta (String cor, double Aro, boolean cesta, int velocidade){
        this.cor = cor;
        this.Aro = Aro;
        this.cesta = cesta;
        this.velocidade = velocidade;
    }

    public boolean derrapar(){
        return true;
    }
    public void MostrarExpecificacao(){
        System.out.println("A Bike tem a cor: " + getCor() + "Com " + getAro() + "Aro\n" + "\n Tem cesta? -> " + isCesta());
    }
    public void Andar(){
        System.out.println("A Bicicleta está andando a: " + velocidade + " km/Hora");
    }

    public int getVelocidade(){
        return velocidade;
    }

    public String getCor() {
        return cor;
    }

    public double getAro() {
        return Aro;
    }

    public boolean isCesta() {
        return cesta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAro(double aro) {
        Aro = aro;
    }


}

