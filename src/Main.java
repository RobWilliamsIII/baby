//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

   public static void main(String[] args) {

       String babyName = JOptionPane.showInputDialog("What is your baby's name?");

       double weight = Double.parseDouble(JOptionPane.showInputDialog("What is baby's weight in lbs? "));

       int lbWeight = (int) weight;

       String numberWeight = String.valueOf(weight);
       numberWeight = numberWeight.substring(numberWeight.indexOf("."));

       double ozWeight = Double.parseDouble(numberWeight);
       ozWeight = ozWeight * 16;
       JOptionPane.showMessageDialog(null, babyName + "'s weight in lbs and oz is " + lbWeight + "lbs " + ozWeight + "oz.");

    }
}