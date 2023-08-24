package veic;

public class Computador {

    private String cor;

    private double teclas;
    private boolean funciona;

    public Computador (String cor, double teclas, boolean funciona){
        this.cor = cor;
        this.teclas = teclas;
        this.funciona = funciona;
    }


    public boolean ligar(){
        return true;

    }

    public String getCor() {
        return cor;
    }

    public double getTeclas() {
        return teclas;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTeclas(double teclas) {
        this.teclas = teclas;
    }
}
