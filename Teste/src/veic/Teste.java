package veic;

public class Teste {
    public static void main(String[] args) {
//    carro();
    bicicleta();


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
    }
    static void comp(){
        Computador comp1 = new Computador("Preto",123,true);
        comp1.setCor("Rosa");
        comp1.setTeclas(125);

        System.out.println("A cor do teclado: " + comp1.getCor() + "\nA quantidade de teclas do teclado: " + comp1.getTeclas() +"\nEstá funcionado: " + comp1.isFunciona());
    }




}
