package veic;

public class Casa {

    private String cor;

    private String tipo;

    private int quartos;

    private boolean alugada;

    public Casa(String cor, String tipo, int quartos, boolean alugada){
        this.cor = cor;
        this.tipo = tipo;
        this.quartos = quartos;
        this.alugada = alugada;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuartos() {
        return quartos;
    }

    public boolean isAlugada() {
        return alugada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
}
