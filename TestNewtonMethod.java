import javax.swing.*;
public class TestNewtonMethod{
   public static void main(String[] args) {
   //The commented parts below are used for nth_root method in NewtonApproximationMethod
      NewtonApproximationMethod n = new NewtonApproximationMethod();
      int arrayLength = 5;
      double[] epsilons = new double[arrayLength];
      double[] approximations = new double[arrayLength];
      String panelMessage = "Enter the number you want to find the root of:";
      String s="";
      boolean isValid = true;
      double epsilon=0;
      double number=0;
      int degree=0;
      
      while (isValid) {
         s = JOptionPane.showInputDialog(panelMessage);
         try {
            number = Double.parseDouble(s);
            //For nth_root method this condition is ignored
            if(number < 0 ){
               throw new IllegalArgumentException();
            }
            break;
         } 
         catch (IllegalArgumentException e) {
            panelMessage = "Invalid value for number.Try again";
         }
      }
   /*  panelMessage="Enter the value of degree:";
      while (isValid) {
         s = JOptionPane.showInputDialog(panelMessage);
         try {
            degree = Integer.parseInt(s);
            if(degree <= 0 ){
               throw new IllegalArgumentException();
            }
            else if(degree%2==0 && number<0){
               panelMessage="Enter an odd value for degree:";
               continue;
            }
            break;
         } 
         catch (IllegalArgumentException e) {
            panelMessage = "Invalid value for degree.Enter another value";
         }
      }*/
      for (int i = 0; i != arrayLength; i++) {
         panelMessage="Enter a value for  epsilon  ("+arrayLength+" in total):";
         while (isValid) {
            s = JOptionPane.showInputDialog(panelMessage);
            try {
               epsilon = Double.parseDouble(s);
               if(epsilon <= 0 ){
                  throw new IllegalArgumentException();
               }
               break;
            }
            catch (IllegalArgumentException e) {
               panelMessage = "Invalid value for epsilon.Enter another value:";
            }
         }
         epsilons[i] = epsilon;
        //approximations[i] = n.nth_root(number, degree, epsilon);
         approximations[i]=n.square_root(number,epsilons[i]);
      }
      DisplayOutput d=new DisplayOutput(number,epsilons,approximations);
   //   DisplayOutput d = new DisplayOutput(number, degree, epsilons, approximations);
     
      //Returns the integer part
      //JOptionPane.showMessageDialog(null, "The integer part of  "+number+" root is: "+n.int_nth_root(number,/*degree*/2));
   }
}