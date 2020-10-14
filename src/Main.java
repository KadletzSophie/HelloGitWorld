import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            try {
                System.out.printf("Geben Sie den ersten Wert ein: %n");
                int wert1 = sc.nextInt();

                System.out.printf("Geben Sie den zweiten Wert ein: %n ");
                int wert2 = sc.nextInt();

                int summe = wert1 + wert2;
                System.out.printf("Ihr erster wert: %d %n",wert1);
                System.out.printf("Ihr zweiter wert: %d %n",wert2);
                System.out.printf("Summe der Werte: %d %n",summe);
                b=false;
            }
        catch (InputMismatchException ex){
            System.out.printf("Geben Sie bitte einen gültigen (numeriscehn) Wert ein");

        }
    }
}}
