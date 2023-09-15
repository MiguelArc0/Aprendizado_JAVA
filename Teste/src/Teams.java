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
}
