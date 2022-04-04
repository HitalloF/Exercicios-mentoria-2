//6. Faça um Programa que receba um número inteiro, calcule e
//imprima a tabuada de 0 a 15 desse número.

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("INSERT THE NUMBER");
        number = sc.nextInt();

        for( int i=0; i<16; i++){
            System.out.println(number*i);
        }


        sc.close();
    }
}
