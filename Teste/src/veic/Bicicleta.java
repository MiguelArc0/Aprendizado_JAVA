package veic;

public class Bicicleta {

    private String cor;

    private double Aro;
    private boolean cesta;

    public Bicicleta (String cor, double Aro, boolean cesta){
        this.cor = cor;
        this.Aro = Aro;
        this.cesta = cesta;
    }

    public boolean derrapar(){
        return true;
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
