public class ex4 {
    public static void main(String[] args) {
        int soma1 = 0;
        int soma2 = 0;

        int[] primeiros = {8,9,7};
        int[] segunda = {4,5,6};



        for (int i =0; i < primeiros.length; i++){
            soma1+=primeiros[i]/3;
        }
        for (int i =0; i < segunda.length; i++){
            soma2+=segunda[i]/3;
        }
        Integer media = soma1 + soma2;
        System.out.println("The sum of the two means are "+media);
    }
}
