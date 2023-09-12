
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

    public void evidenciar(){
        System.out.println("Vamos checar como a casa é: ");
        System.out.println("Cor: " + getCor());
        System.out.println("Tipo - > (Casa-Apartamento-Outro) ->:   " + getTipo());
        System.out.println("Qtd quartos: " + getQuartos());
    }
    public boolean alugada(){
        System.out.println("A casa está: " + isAlugada());
        return true;
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
