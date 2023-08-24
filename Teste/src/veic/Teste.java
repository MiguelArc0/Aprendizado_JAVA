package veic;

public class Teste {
    public static void main(String[] args) {
//    carro();
//    bicicleta();

    }
    static void carro(){
        Carro c1 = new Carro("Vermelho","Chevette","H10S3M");
        c1.setCor("Vermelho");
        c1.setVelocidade(120);
        System.out.println("\n\nNosso carro: " + c1.getCor() +"\nNossa velocidade: " + c1.getVelocidade());
        c1.setCor("Azul");
        System.out.println("\n----------------------\nNosso carro: " + c1.getCor() +"\nNossa velocidade: " + c1.getVelocidade());
        Carro c2 = new Carro("Preto","Civic","HM2JD0");
        System.out.println("\n----------------------\nNosso carro: " + c2.getModelo() + "\nNossa cor: "+c2.getCor() +"\nNossa velocidade: " + c2.getVelocidade());

    }
    static void bicicleta(){
        Bicicleta b1 = new Bicicleta("Preta",1.2,true);
        b1.setCor("Rosa");
        b1.setAro(123);

        System.out.println("\nA Cor da bike: " + b1.getCor() + "\nO número de aros: " + b1.getAro() + "\nTrue ou false: " + b1.isCesta());
    }
    static void tec(){
        Teclado t1 = new Teclado("Preto",123,true);
        t1.setCor("Rosa");
        t1.setTeclas(125);

        System.out.println("A cor do teclado: " + t1.getCor() + "\nA quantidade de teclas do teclado: " + t1.getTeclas() +"\nEstá funcionado: " + t1.isFuncionando());

        Teclado tec = new Teclado("Preto",12,true);
        tec.especificacaoTeclado();
        System.out.println("\nTeste se está funcionando\n");
        tec.escrever();
        System.out.println("Mensagem bonita! \n");
        tec.escrever_bomdia();
    }
    static void comp(){
        Computador comp1 = new Computador("Preto",123,true);
        comp1.setCor("Rosa");
        comp1.setTeclas(125);

        System.out.println("A cor do computador: " + comp1.getCor() + "\nA quantidade de teclas do computador: " + comp1.getTeclas() +"\nEstá funcionado: " + comp1.isFunciona());
    }

    static void casas(){
        Casa casa1 = new Casa("Preto","Apartamento",3,true);
        casa1.setCor("Marrom-Preto");
        casa1.setQuartos(3);


        System.out.println("A cor da casa: " + casa1.getCor() + "\nA casa é um: " + casa1.getTipo() +"\nQuantidade de quartos: " + casa1.getQuartos());
    }
    static void livros(){
        Livro liv1 = new Livro("Preto","Apartamento",50,true);
        liv1.setNome("Amor platônico");
        liv1.setAutor("Elíada");

        liv1.ler();

    }

    static void cliente(){
        Clientes cl1 = new Clientes("Jacson","Rua Domingues dos Santos",50124654);
        cl1.mostrar();

    }
    static void bancos(){
        Banco banco1 = new Banco("Bradesco","Rua Domingues dos Santos",501);
        banco1.evideniar();

    }

    static void predios(){
        Predio meuPredio = new Predio("Avenida Cidade Jardi, 123", 10, true);

        meuPredio.exibirDetalhes();
    }
    static void produtos(){
        Produto prod1 = new Produto("Esponja", 10, 5554555);

        prod1.exibirDetalhesProd();

        Produto prod2 = new Produto("Café",10,5543543);

        prod2.exibirDetalhesProd();
    }







}
