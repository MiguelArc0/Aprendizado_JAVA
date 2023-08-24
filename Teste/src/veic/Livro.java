package veic;

public class Livro {
    private String autor;

    private String nome;

    private int qtd_pag;

    private boolean aberto;

    public Livro(String nome, String autor, int qtd_pag, boolean aberto) {
        this.nome = nome;
        this.autor = autor;
        this.qtd_pag = qtd_pag;
        this.aberto = aberto;
    }

    public void ler(){
        System.out.println("Estou lendo o livro: " + nome + " do autor: " + autor);
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd_pag() {
        return qtd_pag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
