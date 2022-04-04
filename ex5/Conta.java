package ex5;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        double saldo = 100;
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your balance are: " + saldo);
        System.out.println("For your balance with readjustment INSERT:\n 1 Corrente\n 2 Poupanca\n 3 Basico ");
        opc = sc.nextInt();
        if (opc == 1){
            Corrente c1 = new Corrente();
            c1.corrente(saldo);
        }
        else if (opc == 2){
            Poupanca p1 = new Poupanca();
            p1.poupanca(saldo);
        }
        else if (opc == 3){
            Basic b1 = new Basic();
            b1.basic(saldo);
        }
    }
}


