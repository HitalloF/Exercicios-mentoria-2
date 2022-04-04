package ex2Class;

import java.util.Scanner;

public class Conversao {


    public static void main(String[] args) {
        double temperatura;
        String opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert TEMPERATURE");
        temperatura = sc.nextDouble();

        System.out.println("convert to Kelvin  put K\nconvert to  Réaumur Re\nconvert to Rankine Ra\nconver to Fahrenheit F");
        opc = sc.next();

        if (opc.equals("k") || opc.equals("K")){
          K k1 = new K();
          k1.Kelvin(temperatura);
        }
        else if (opc.equals("Re") || opc.equals("RE") || opc.equals("re") ){
            Re re1 = new Re();
            re1.Reaumur(temperatura);
        }
        else if (opc.equals("Ra") || opc.equals("RA") || opc.equals("ra") ){
            Ra ra1 = new Ra();
            ra1.Rankine(temperatura);
        }
        else if (opc.equals("F") || opc.equals("f")  ){
            F f1 = new F();
            f1.Fahrenheit(temperatura);
        }


        sc.close();
    }

}
