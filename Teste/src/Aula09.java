public class Aula09 {

    public static void main(String[] args) {
//        int[] numa = {1,2,3,4,5};
//
//        for(int i = 0; i < numa.length; i++){
//            System.out.println(numa[i]);
//        }
//        for(int num:numa){
//            System.out.println(num);//Esse tipo de for funciona percorrendo cada elemento do vetor, no código em questão 'num' se torna cada elemento do array numa
//            // num = 1 -> num = 2 -> num = 3 ... E sempre lembrando que os tipos tem que serem os mesmos, int com int e String com String. EX:
//            // num = nums[0] -> num = nums[1] -> num = nums[2] -> num = nums[3] -> num = nums[4]
//        }



        double s = somas(1.32,4.32);
        System.out.println(s);
        System.out.println(soma(1111111111,2323423,234234,121,423423,21212,7657,2342,123123,876586));
    }

    public static int soma(int ... numeros){
        int res = 0;
        for(int n: numeros){
            res += n;
        }
        return res;
    }


    public static double somas(double a, double b) {
        double soma = a + b;
        return soma;
    }
    public static void ex2(String M, int j,double b, double c){
        System.out.println(M);
        System.out.println(j);
        System.out.println(b);
        double soma = b + c;
    }
}
