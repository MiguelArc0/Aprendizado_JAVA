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
    public void escrever(){
    System.out.println("Parabéns o teclado está funcionando");
    return true;
    }
    public void escrever_ola(){
    System.out.println("Olá");
    return true; 
    }
    
    public void escrever_bomdia(){
    System.out.println("Olá, Bom dia!!!");
    return true;
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
