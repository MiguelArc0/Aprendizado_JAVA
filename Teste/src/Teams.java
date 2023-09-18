import java.util.Arrays;
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
    static void ex78(){
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


    }

    static void ex79ArraySimples(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);
        double arma_media = 0;
        double media = 0;
        int maior_que_A_media = 0;
        for(int i = 0; i < notas.length; i ++ ){
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
            arma_media += notas[i];
        }
        media = arma_media / notas.length;
        for(int i = 0; i < notas.length; i ++ ){
            if(notas[i] > media){
                maior_que_A_media += 1;
            }
        }
        System.out.println("A média das notas dos alunos: " + media);
        System.out.println("Vezes em que a nota de algum aluno foi maior que a média: " + maior_que_A_media);
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
        
        static void ex82(){

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

        static void ex85() {
        Scanner sc = new Scanner(System.in);

        int[] temp = new int[5];

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Insira as temperaturas: ");
            temp[i] = sc.nextInt();

        }
        int maior_temp = temp[0];
        for(int i = 0; i < temp.length; i++){
            if (maior_temp < temp[i]){
                maior_temp = temp[i];
            }
        }
        System.out.println("Maior valor: " + maior_temp);


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

static void ex87(){
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

}
