import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, endereco;
        double cep, cel;

        System.out.println("Inserto your name");
        nome = sc.next();
        System.out.println("Now Insert your Address");
        endereco = sc.next();
        System.out.println("Now Insert your CEP");
        cep = sc.nextDouble();
        System.out.println("Now Insert your Cel phone");
        cel = sc.nextDouble();
        System.out.println("YOUR INFORMATION, Name: "+ nome +" Address: " + endereco);
        System.out.println("YOUR INFORMATION, CEP: "+ cep +" Cell phone: " + cel );
        sc.close();
    }
}
