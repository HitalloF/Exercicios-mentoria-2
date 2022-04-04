import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert inter number");
        numero = sc.nextInt();
        System.out.println("predecessor: " + (numero - 1)+" successor: "+(numero+1));
        sc.close();
    }
}
