package ex5;

public class Corrente extends  Conta{
    public void corrente(double saldo){
        System.out.println("your balance with 10% readjustment are: " +(saldo+(saldo*0.1)));
    }
}
