package veic;

public class Predio {

    private String endereco;
    private int numeroAndares;
    private boolean possuiElevador;

    public Predio(String endereco, int numeroAndares, boolean possuiElevador) {
        this.endereco = endereco;
        this.numeroAndares = numeroAndares;
        this.possuiElevador = possuiElevador;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public boolean isPossuiElevador() {
        return possuiElevador;
    }

    public void setNumeroAndares(int numeroAndares) {
        this.numeroAndares = numeroAndares;
    }

    public void exibirDetalhes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Andares: " + numeroAndares);
        System.out.println("Possui Elevador: " + (possuiElevador ? "Sim" : "Não"));
    }


}