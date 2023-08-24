package veic;

public class Produto {

    private String nome;
    private double preco;
    private int codigo_Barras;

    public Produto(String nome, double preco, int codigo_Barras) {
        this.nome = nome;
        this.preco = preco;
        this.codigo_Barras = codigo_Barras;
    }

    public void exibirDetalhesProd(){
        System.out.println("O produto: " + getNome()+ "\nSeu respectivo preço: " + getPreco()+"R$" + "Código de Barras: " + getCodigo_Barras());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo_Barras() {
        return codigo_Barras;
    }

    public void setCodigo_Barras(int codigo_Barras) {
        this.codigo_Barras = codigo_Barras;
    }
}
