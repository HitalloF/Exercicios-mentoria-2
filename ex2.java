import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        double temperatura;
        String opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("INSERT TEMPERATURE");
        temperatura = sc.nextDouble();
        System.out.println("convert to Kelvin  put K\nconvert to  Réaumur Re\nconvert to Rankine Ra\nconver to Fahrenheit F");
        opc = sc.next();

        if (opc.equals("k") || opc.equals("K")){
            double conversao = temperatura + 273.15;
            System.out.printf("Temperature K%.2f%n ", conversao);
        }
        else if (opc.equals("Re") || opc.equals("RE") || opc.equals("re") ){
            double conversao = temperatura * 0.8;
            System.out.printf("Temperature RE%.2f%n ", conversao);
        }
        else if (opc.equals("Ra") || opc.equals("RA") || opc.equals("ra") ){
            double conversao = temperatura * 1.8 + 32 + 459.67;
            System.out.printf("Temperature RA%.2f%n ", conversao);
        }
        else if (opc.equals("F") || opc.equals("f")  ){
            double conversao = (temperatura * 9/5) + 32;
            System.out.printf("Temperature  F%.2f%n ", conversao);
        }


        sc.close();
    }
}
