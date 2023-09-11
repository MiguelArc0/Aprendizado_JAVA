package veic;

import java.util.ArrayList;
import java.util.List;
public class Banco {

    private String nome;
    private String localizacao;

    private int clientes;
    public Banco(String nome, String localizacao, int clientes) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.clientes = clientes;
    }
    public void evideniar(){
        System.out.println("Nome do banco: " + getNome() + "\nLocalização: " + getLocalizacao() + "QTD clientes: " + getClientes());
    }
    public void mostrarClientes(){
        System.out.println(" A quantidade de clientes: " + getClientes() + "\nDo banco: " + getNome());
    }
    public void mostraNome (){
        System.out.println("O nome do banco: " + getNome());
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getClientes() {
        return clientes;
    }

}
