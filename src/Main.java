//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.JOptionPane;

public class Main {

   public static void main(String[] args) {

       JOptionPane.showMessageDialog(null, "Welcome to the baby weight converter!", "Welcome", JOptionPane.INFORMATION_MESSAGE );

       String babyName = JOptionPane.showInputDialog(null, "What is your baby's name?", "Baby Name", JOptionPane.QUESTION_MESSAGE);

       while (babyName.isBlank()) {
           JOptionPane.showMessageDialog(null, "A name must be entered", "No Input", JOptionPane.ERROR_MESSAGE);
           babyName = JOptionPane.showInputDialog(null, "What is your baby's name?", "Baby Name", JOptionPane.QUESTION_MESSAGE);
            }

           double weight = Double.parseDouble(JOptionPane.showInputDialog("What is the baby's weight in lbs?"));
               // Get just the first two values of the double to represent the lbs of baby's weight as an integer

               int lbWeight = (int) weight;

               // Get just the values after the decimal point of weight variable to represent ounces
               String numberWeight = String.valueOf(weight);
               numberWeight = numberWeight.substring(numberWeight.indexOf("."));

               // Convert numberWeight back to double type and multiply value by 16 to convert from lbs to oz as a double type
               double ozWeight = Double.parseDouble(numberWeight);
               ozWeight = ozWeight * 16;
               JOptionPane.showMessageDialog(null, babyName + "'s weight in lbs and oz is " + lbWeight + "lbs " + ozWeight + "oz.");


       }
}