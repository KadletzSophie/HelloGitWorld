import java.util.InputMismatchException;
import java.util.Scanner;

/****
 * @author Sophie Kadletz
 * @version 14.10.2020
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
                System.out.printf("Geben Sie den ersten Wert ein: %n");
                int wert1 = sc.nextInt();

                System.out.printf("Geben Sie den zweiten Wert ein: %n ");
                int wert2 = sc.nextInt();

                int summe = wert1 + wert2;
                int differenz = wert1 - wert2;
                int multiplikation = wert1*wert2;
                int division = wert1/wert2;
                int rest = wert1%wert2;
                System.out.printf("--------------------------------- %n");
                System.out.printf("Ihr erster wert: %d %n",wert1);
                System.out.printf("Ihr zweiter wert: %d %n",wert2);
                System.out.printf("--------------------------------- %n");
                System.out.printf("Summe der Werte: %d %n",summe);
                System.out.printf("--------------------------------- %n");
                System.out.printf("Differenz der Werte: %d %n",differenz);
                System.out.printf("--------------------------------- %n");
                System.out.printf("Produkt der Werte: %d %n",multiplikation);
                System.out.printf("--------------------------------- %n");
                System.out.printf("Division der Werte: %d %n",division);
                System.out.printf("--------------------------------- %n");
                System.out.printf("Bei der Divison von %d und %d ergibt sich ein Rest von %d %n",wert1,wert2,rest);
                System.out.printf("--------------------------------- %n");
            }
        catch (InputMismatchException ex){
                System.out.printf("Geben Sie bitte einen gültigen (numerischen) Wert ein");
        }
    }
}
