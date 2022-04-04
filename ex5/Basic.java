package ex5;

public class Basic extends Conta{
    public void basic(double saldo){
        System.out.println("your balance with 1% readjustment are : " + (saldo+(saldo*0.01)));
    }
}
