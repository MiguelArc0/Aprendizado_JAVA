package veic;

public class Teclado {

    private String cor;

    private double teclas;

    private boolean funcionando;

    public boolean digitar(){
        return true;
    }
    public Teclado(String cor, double teclas, boolean funcionando){
        this.cor = cor;
        this.teclas = teclas;
        this.funcionando = funcionando;
    }

    public String getCor() {
        return cor;
    }
    public double getTeclas(){
        return teclas;
    }
    public boolean isFuncionando(){
        return funcionando;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTeclas(double teclas) {
        this.teclas = teclas;
    }
}
