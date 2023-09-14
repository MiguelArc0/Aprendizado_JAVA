import java.util.Arrays;
import java.util.Scanner;
public class Teams {
    public static void main(String[] args) {
    ex86();
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
