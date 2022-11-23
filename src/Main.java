import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze \n Podaj pierwszą liczbę");
        Scanner sc=new Scanner(System.in);
        float number1=sc.nextFloat();
        System.out.println("Podaj drugą liczbę");
        float number2=sc.nextFloat();

        System.out.println("1. dodawanie, 2. odejmowanie, 3.mnożenie, 4.dzielenie");
        System.out.println("Jaką operacje chcesz wykonać ");
        int opcja=sc.nextInt();
        switch (opcja){
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.out.println(number1/number2);
                break;
        }
    }
}