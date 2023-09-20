import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Teams {
    public static void main(String[] args) {
    ex86();
    }
        static void ex77(){
        int[] exV = {5,1,4,2,7,8,3,6};
        for (int i = 8;i >= 5; i --){
            int aux = exV[i];
            exV[i] = exV[7-i + 1];
            exV[7-i + 1] = aux;
        }
        exV[2] = exV[1];
        exV[exV[2]] = exV[exV[1]];

        System.out.println(Arrays.toString(exV));
    }

    public static void ex77ArrayList() {
        List<Integer> exV = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 7, 8, 3, 6));

        for (int i = 8; i >= 5; i--) {
            int aux = exV.get(i);
            exV.set(i, exV.get(7 - i + 1));
            exV.set(7 - i + 1, aux);
        }

        exV.set(2, exV.get(1));
        exV.set(exV.get(2), exV.get(exV.get(1)));

        System.out.println(exV);
    }

    
    static void ex78Vetor(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pessoas = new ArrayList<>();
        for(int i = 0;i < 5 ;i++){
            System.out.println("Insira o nome da pessoa "+ (i+1)+"º");
            pessoas.add (sc.next());
        }
        System.out.println("Insira mais um nome: ");
        String nome = sc.next();
        pessoas.add(nome);
        for(int i = 0;i < 5 ;i++){
            if(nome.equals(pessoas.get(i))){
                System.out.println("O nome na posição: " + (i+1) + " = "+pessoas.get(i)+" é igual ao nome fornecido, o nome é: " + nome);
            }
        }

    public static void ex78ArrayList() {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> pessoas = new ArrayList<>();
    
    for (int i = 0; i < 5; i++) {
        System.out.println("Insira o nome da pessoa " + (i + 1) + "º");
        pessoas.add(sc.next());
    }
    
    System.out.println("Insira mais um nome: ");
    String nome = sc.next();
    pessoas.add(nome);
    
    for (int i = 0; i < 5; i++) {
        if (nome.equals(pessoas.get(i))) {
            System.out.println("O nome na posição: " + (i + 1) + " = " + pessoas.get(i) + " é igual ao nome fornecido, o nome é: " + nome);
        }
    }
}


        
        

    }

    static void ex79ArraySimples(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        double arma_nota = 0;
        double media = 0;
        int maior_que_A_media = 0;
        for(int i = 0; i < notas.length; i ++ ){
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
            arma_nota += notas[i];
        }
        media = arma_nota / notas.length;
        for(int i = 0; i < notas.length; i ++ ){
            if(notas[i] > media){
                maior_que_A_media += 1;
            }
        }
        System.out.println("A média das notas dos alunos: " + media);
        System.out.println("Vezes em que a nota de algum aluno foi maior que a média: " + maior_que_A_media);
    }

    public static void ex79ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    double somaNotas = 0;
    double media = 0;
    int maiorQueMedia = 0;

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira a nota do aluno " + (i + 1) + ": ");
        int nota = sc.nextInt();
        notas.add(nota);
        somaNotas += nota;
    }

    media = somaNotas / notas.size();

    for (int nota : notas) {
        if (nota > media) {
            maiorQueMedia++;
        }
    }

    System.out.println("A média das notas dos alunos: " + media);
    System.out.println("Quantidade de alunos com nota maior que a média: " + maiorQueMedia);
}

    

        static void ex80ArraySimples(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        double arma_media = 0;
        double media = 0;
        for(int i = 0; i < notas.length; i ++ ){
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
            arma_media += notas[i];
        }
        media = arma_media / notas.length;
        int maior = notas[0];
        int pos = 0;
        for(int i = 0; i < notas.length; i ++ ){
            if(maior < notas[i]){
                maior = notas[i];
                pos = (i+1);
            }
            else{
                pos = (i+1);
            }
        }
        System.out.println("O Aarray: " + Arrays.toString(notas));
        System.out.println("A média das notas: " + media);
        System.out.println("A maior das notas: " + maior);
        System.out.println("A posição do Maior é o número " + pos +" na lista");


    }

    
public static void ex80ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    double somaNotas = 0;
    double media = 0;

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira a nota do aluno " + (i + 1) + ": ");
        int nota = sc.nextInt();
        notas.add(nota);
        somaNotas += nota;
    }

    media = somaNotas / notas.size();
    int maior = notas.get(0);
    int pos = 0;

    for (int i = 0; i < notas.size(); i++) {
        if (maior < notas.get(i)) {
            maior = notas.get(i);
            pos = (i + 1);
        } else {
            pos = (i + 1);
        }
    }

    System.out.println("O ArrayList: " + notas);
    System.out.println("A média das notas: " + media);
    System.out.println("A maior das notas: " + maior);
    System.out.println("A posição do Maior é o número " + pos + " na lista");
}

    

        static void ex81ArraySimples(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        double arma_media = 0;
        double media = 0;
        for(int i = 0; i < notas.length; i ++ ){
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
            arma_media += notas[i];
        }
        media = arma_media / notas.length;
        int menor = notas[0];
        int pos = 1;
        for(int i = 0; i < notas.length; i ++ ){
            if(menor > notas[i]){
                menor = notas[i];
                pos = (i+1);
            }
            else{
                pos = (i+1);
            }
        }
        System.out.println("O Array: " + Arrays.toString(notas));
        System.out.println("A média das notas: " + media);
        System.out.println("A menor das notas: " + menor);
        System.out.println("A posição do Maior é o número " + pos +" na lista");


    }

    public static void ex81ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    double somaNotas = 0;
    double media = 0;

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira a nota do aluno " + (i + 1) + ": ");
        int nota = sc.nextInt();
        notas.add(nota);
        somaNotas += nota;
    }

    media = somaNotas / notas.size();
    int menor = notas.get(0);
    int pos = 1;

    for (int i = 0; i < notas.size(); i++) {
        if (menor > notas.get(i)) {
            menor = notas.get(i);
            pos = (i + 1);
        } else {
            pos = (i + 1);
        }
    }

    System.out.println("O ArrayList: " + notas);
    System.out.println("A média das notas: " + media);
    System.out.println("A menor das notas: " + menor);
    System.out.println("A posição da Menor é o número " + pos + " na lista");
}   
        
        static void ex82ArraySimples(){

        int[] notasV = new int[5];
        int[] notasM = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < notasV.length; i ++ ) {
            System.out.println("Insira os números: ");
            notasV[i] = sc.nextInt();
        }
        System.out.println("Insira mais um número: ");
        int maisum = sc.nextInt();

        for(int i = 0; i < notasM.length; i++){
            notasM[i] = notasV[i] * maisum;
        }
        System.out.println("O Array Original: " + Arrays.toString(notasV));
        System.out.println("O Array Multiplicado: " + Arrays.toString(notasM));

    }


    public static void ex82ArrayList() {
    ArrayList<Integer> notasV = new ArrayList<>();
    ArrayList<Integer> notasM = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números: ");
        int nota = sc.nextInt();
        notasV.add(nota);
    }

    System.out.println("Insira mais um número: ");
    int maisUm = sc.nextInt();

    for (int i = 0; i < 5; i++) {
        notasM.add(notasV.get(i) * maisUm);
    }

    System.out.println("O ArrayList Original: " + notasV);
    System.out.println("O ArrayList Multiplicado: " + notasM);
}
    
    

        static void ex83ArraySimples(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < notas.length; i ++ ) {
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
        }
        for(int i = 1; i < notas.length; i ++ ) {
            System.out.println("Da primeira até a ultima: " + i);
        }

        System.out.println("----------------------");

        for(int i = 1; i < notas.length; i ++ ) {
            System.out.println("Da última até o começo: " + notas[notas.length - i]);
        }
        System.out.println("Da última até o começo: " + notas[0]);
        System.out.println("O Array: " + Arrays.toString(notas));

    }

    public static void ex83ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números: ");
        int nota = sc.nextInt();
        notas.add(nota);
    }

    for (int i = 1; i < notas.size(); i++) {
        System.out.println("Da primeira até a última: " + i);
    }

    System.out.println("----------------------");

    for (int i = 1; i < notas.size(); i++) {
        System.out.println("Da última até o começo: " + notas.get(notas.size() - i));
    }
    
    System.out.println("Da última até o começo: " + notas.get(0));
    System.out.println("O ArrayList: " + notas);
}

    
    

        static void ex84() {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        System.out.println("Insira o valor de N: ");
        n = sc.nextInt();

        int[] Aba = new int[n];
        int[] Bab = new int[n];
        int[] Soma = new int[n];

        for (int i = 0; i < Aba.length; i++) {
            System.out.println("Insira os valores do vetor A: ");
            Aba[i] = sc.nextInt();

            System.out.println("Insira os valores do vetor B: ");
            Bab[i] = sc.nextInt();
        }
//System.out.println("Insira os valores do vetor B: ");
//            Aba[i] = sc.nextInt();
//
        for (int i = 0; i < Aba.length; i++) {
            Soma[i] = Aba[i] + Bab[i];
        }

        System.out.println("O vetor A: " + Arrays.toString(Aba));
        System.out.println("O vetor B: " + Arrays.toString(Bab));
        System.out.println("O vetor das somas de A e B: " + Arrays.toString(Soma));


    }

    public static void ex84ArrayList() {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    System.out.println("Insira o valor de N: ");
    n = sc.nextInt();

    ArrayList<Integer> Aba = new ArrayList<>();
    ArrayList<Integer> Bab = new ArrayList<>();
    ArrayList<Integer> Soma = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        System.out.println("Insira o valor " + (i + 1) + " do vetor A: ");
        int valorA = sc.nextInt();
        Aba.add(valorA);

        System.out.println("Insira o valor " + (i + 1) + " do vetor B: ");
        int valorB = sc.nextInt();
        Bab.add(valorB);
    }

    for (int i = 0; i < n; i++) {
        Soma.add(Aba.get(i) + Bab.get(i));
    }

    System.out.println("O ArrayList A: " + Aba);
    System.out.println("O ArrayList B: " + Bab);
    System.out.println("O ArrayList das somas de A e B: " + Soma);
}
    

public class Exercicio85ArraySimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] temperaturas = new int[365];
        
        // Leitura das temperaturas médias diárias
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Insira a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextInt();
        }

        // Encontrar a menor e a maior temperatura do ano
        int menorTemp = temperaturas[0];
        int maiorTemp = temperaturas[0];
        int somaTemps = 0;

        for (int temp : temperaturas) {
            if (temp < menorTemp) {
                menorTemp = temp;
            }

            if (temp > maiorTemp) {
                maiorTemp = temp;
            }

            somaTemps += temp;
        }

        // Calcular a temperatura média anual
        double mediaAnual = (double) somaTemps / temperaturas.length;

        // Contar o número de dias com temperatura inferior à média anual
        int diasAbaixoMedia = 0;

        for (int temp : temperaturas) {
            if (temp < mediaAnual) {
                diasAbaixoMedia++;
            }
        }

        // Exibir os resultados
        System.out.println("Menor temperatura do ano: " + menorTemp);
        System.out.println("Maior temperatura do ano: " + maiorTemp);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + diasAbaixoMedia);
    }
}

    public class Exercicio85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> temperaturas = new ArrayList<>();

        // Leitura das temperaturas médias diárias
        for (int i = 0; i < 365; i++) {
            System.out.println("Insira a temperatura média do dia " + (i + 1) + ": ");
            temperaturas.add(sc.nextInt());
        }

        // Encontrar a menor e a maior temperatura do ano
        int menorTemp = temperaturas.get(0);
        int maiorTemp = temperaturas.get(0);
        int somaTemps = 0;

        for (int temp : temperaturas) {
            if (temp < menorTemp) {
                menorTemp = temp;
            }

            if (temp > maiorTemp) {
                maiorTemp = temp;
            }

            somaTemps += temp;
        }

        // Calcular a temperatura média anual
        double mediaAnual = (double) somaTemps / temperaturas.size();

        // Contar o número de dias com temperatura inferior à média anual
        int diasAbaixoMedia = 0;

        for (int temp : temperaturas) {
            if (temp < mediaAnual) {
                diasAbaixoMedia++;
            }
        }

        // Exibir os resultados
        System.out.println("Menor temperatura do ano: " + menorTemp);
        System.out.println("Maior temperatura do ano: " + maiorTemp);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + diasAbaixoMedia);
    }
}

    
    
    static void ex86(){
        Scanner sc = new Scanner(System.in);
        int[] vetorD = new int[9];
        for(int i = 0;i< vetorD.length;i++){
            System.out.println("Insira os valores desordenados: ");
            vetorD[i] = sc.nextInt();
        }
        System.out.println("O Array desordenado: " + Arrays.toString(vetorD));
        for(int i = 0;i< vetorD.length;i++){
            for(int j = i + 1;j< vetorD.length;j++){
                if(vetorD[i] > vetorD[j]){
                    int temporario = vetorD[i];
                    vetorD[i] = vetorD[j];
                    vetorD[j] = temporario;
                }
            }
        }
        System.out.println("O Array ordenado: " + Arrays.toString(vetorD));
    }

    public static void ex86ArrayList() {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> vetorD = new ArrayList<>();

    for (int i = 0; i < 9; i++) {
        System.out.println("Insira os valores desordenados: ");
        vetorD.add(sc.nextInt());
    }

    System.out.println("O ArrayList desordenado: " + vetorD);

    // Implementar a ordenação manualmente (Bubble Sort)
    for (int i = 0; i < vetorD.size() - 1; i++) {
        for (int j = 0; j < vetorD.size() - 1 - i; j++) {
            if (vetorD.get(j) > vetorD.get(j + 1)) {
                int temp = vetorD.get(j);
                vetorD.set(j, vetorD.get(j + 1));
                vetorD.set(j + 1, temp);
            }
        }
    }

    System.out.println("O ArrayList ordenado: " + vetorD);
}

    
        public static void ex87ArrayNormal() {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[11];
        int novoNumero;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Insira mais um número: ");
        novoNumero = sc.nextInt();
        
        int posicaoInsercao = 0;
        while (posicaoInsercao < 10 && novoNumero > vetor[posicaoInsercao]) {
            posicaoInsercao++;
        }
        
        for (int i = 10; i > posicaoInsercao; i--) {
            vetor[i] = vetor[i - 1];
        }
        
        vetor[posicaoInsercao] = novoNumero;
        
        System.out.println("Vetor com o novo número inserido e ordenado: " + Arrays.toString(vetor));
    }

    
static void ex87ArrayList(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vetorD = new ArrayList<>(6);
        for(int i = 0;i < 5 ;i++){
            System.out.println("Insira os valores desordenados: ");
            vetorD.add(sc.nextInt());
        }
        for (int markas: vetorD){
            System.out.println(markas);
        }
        for(int i = 0;i< vetorD.size();i++){
            for(int j = i + 1;j< vetorD.size()-1;j++){
                if(vetorD.get(i).compareTo(vetorD.get(i+1)) > 0){
                    int temporario = vetorD.get(i);
                    vetorD.set(i,vetorD.get(i+1));
                    vetorD.set(i+1,temporario);
                }
            }
        }
        System.out.println("O Array ordenado: ");
        for (int mostra:vetorD){
            System.out.println(mostra);
        }

//        System.out.println("Insira mais um valor: ");
//        int mais = sc.nextInt();


    }

        static void ex88ArraySimples(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < notas.length; i ++ ) {
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
        }
        boolean existe = false;
        System.out.println("Insira mais um número: ");
        int maisum = sc.nextInt();
        for(int i = 0; i < notas.length; i ++ ) {
            if (maisum == notas[i]){
                existe = true;
            }
        }


    public static void ex88ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números: ");
        notas.add(sc.nextInt());
    }

    boolean existe = false;
    System.out.println("Insira mais um número: ");
    int maisum = sc.nextInt();

    for (int nota : notas) {
        if (maisum == nota) {
            existe = true;
            break;  // Se encontrado, não precisa continuar verificando
        }
    }

    if (existe) {
        System.out.println("O número existe no ArrayList.");
    } else {
        System.out.println("O número não existe no ArrayList.");
    }
}
    

    static void ex89(){
        int[] V1 = new int[5];
        int[] V2 = new int[5];

        int qtd_Vezes = 0;
        int msm_pos = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < V1.length; i ++ ) {
            System.out.println("Insira os números: ");
            V1[i] = sc.nextInt();
        }
        for(int i = 0; i < V1.length; i ++ ) {
            System.out.println("Insira os números VETOR 2: ");
            V2[i] = sc.nextInt();
        }
        for(int i = 0; i < V1.length; i ++ ) {
            if(V1[i] == V2[i]){
                qtd_Vezes += 1;
            }

        }
        System.out.println(Arrays.toString(V1));
        System.out.println(Arrays.toString(V2));
        System.out.println("Qtd vezes iguais em que é o mesmo número e na mesma posição: " + qtd_Vezes);


    }


    public static void ex89ArrayList() {
    ArrayList<Integer> V1 = new ArrayList<>();
    ArrayList<Integer> V2 = new ArrayList<>();

    int qtd_Vezes = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números para o vetor 1: ");
        V1.add(sc.nextInt());
    }

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números para o vetor 2: ");
        V2.add(sc.nextInt());
    }

    for (int i = 0; i < V1.size(); i++) {
        if (V1.get(i).equals(V2.get(i))) {
            qtd_Vezes += 1;
        }
    }

    System.out.println("Vetor 1: " + V1);
    System.out.println("Vetor 2: " + V2);
    System.out.println("Quantidade de vezes em que os números são iguais na mesma posição: " + qtd_Vezes);
}
                
        static void ex90ArraySimples() {
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
        }
        int existe = 0;
        System.out.println("Insira mais um número: ");
        int maisum = sc.nextInt();
        for (int i = 0; i < notas.length; i++) {
            if (maisum == notas[i]) {
                existe += 1;
            }
        }

        System.out.println("A quantidade de vezes em que o número digitado aparece no array é: " + existe);
    }

    public static void ex90ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números: ");
        notas.add(sc.nextInt());
    }

    int existe = 0;
    System.out.println("Insira mais um número: ");
    int maisum = sc.nextInt();

    for (int nota : notas) {
        if (maisum == nota) {
            existe += 1;
        }
    }

    System.out.println("A quantidade de vezes em que o número digitado aparece no ArrayList é: " + existe);
}


        static void ex91ArraySimples() {
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
        }
        int mesmo = 0;
        for (int i = 0; i < notas.length; i++) {
            for(int j = i + 1; j < notas.length; j++){
                if(notas[i] == notas[j]){
                    mesmo += 1;
                    System.out.println("O número: " + notas[i] + " está repetido na posição: " + (i+1) + " e na posição: " + (j+1));
                }
            }
        }
    }


    public static void ex91ArrayList() {
    ArrayList<Integer> notas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira os números: ");
        notas.add(sc.nextInt());
    }

    int mesmo = 0;
    for (int i = 0; i < notas.size(); i++) {
        for (int j = i + 1; j < notas.size(); j++) {
            if (notas.get(i).equals(notas.get(j))) {
                mesmo += 1;
                System.out.println("O número: " + notas.get(i) + " está repetido na posição: " + (i + 1) + " e na posição: " + (j + 1));
            }
        }
    }
}
            

}
