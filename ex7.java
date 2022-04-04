//7. Fazer um programa que solicite 2 números, depois disso
//informe:
//a) A soma dos números;
//b) O produto (multiplicação) do primeiro número pelo quadrado do
//segundo;
//c) O quadrado do primeiro número;
//d) A raiz quadrada da soma dos números;
//e) O módulo do primeiro número.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        double number1;
        double number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("INSERTO TWO NUMBERS");
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();


        System.out.println("THE SUM OF NUMBERS ARE: "+ (number1+number2));
        System.out.println("THE PRODUCT of the first number by the square of the SECOND : "+ (number1*(number2*number2)));
        System.out.println("The square of first number: " + (number1*number1));
        System.out.println("square root of the sum " + Math.sqrt(number1+number2));
        System.out.println("module first: " + Math.abs(number1));

        sc.close();
    }
}
