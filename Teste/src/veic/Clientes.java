package veic;

public class Clientes {

    private String nome;
    private String endereco;
    private double numeroTelefone;

    public Clientes(String nome, String endereco, double numeroTelefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
    }

    public void mostrar(){
        System.out.println("Nome do cliente: " + nome + "\nEndereço do cliente: " + endereco + "\nNº de telefone: " + numeroTelefone);
    }
    public void nome_alterado(){
         System.out.println("Nome diferente: " + nome + "Arnaldo");   
    }
    public boolean existe(){
        return true;
    }

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public double getNumeroTelefone() {
        return numeroTelefone;
    }

}
