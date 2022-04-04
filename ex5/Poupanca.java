package ex5;

public class Poupanca extends Conta{
    public void poupanca(double saldo){
        System.out.println("your balance with 50% readjustment are : " + (saldo+(saldo*0.5)));
    }
}
