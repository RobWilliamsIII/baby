//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("What is your baby's name? ");
       String babyName = scanner.nextLine();

       System.out.println("What is baby's weight in lbs? ");
       double weight = scanner.nextDouble();
       scanner.nextLine();
       int lbWeight = (int) weight;

       String numberWeight = String.valueOf(weight);
       numberWeight = numberWeight.substring(numberWeight.indexOf("."));

       double ozWeight = Double.parseDouble(numberWeight);
       ozWeight = ozWeight * 16;

       System.out.println( babyName + "'s weight in lbs and oz is " + lbWeight + "lbs " + ozWeight + "oz.");


    }
}