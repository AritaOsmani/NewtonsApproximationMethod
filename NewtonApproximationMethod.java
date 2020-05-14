import javax.swing.*;
public class NewtonApproximationMethod{

   /** Calculates the square root of a number*/
   public  double square_root(double number,double epsilon){
     
      double approximation=1;
      while(true){
         double rootApprox=(approximation + number / approximation) / 2;
         if(Math.abs(approximation-rootApprox)<epsilon){
            break;
         }
         approximation=rootApprox;
      }
      return approximation;
   }
   
   /** Calculates the nth root of a number*/
   public  double nth_root(double number,int degree,double epsilon){
     
      double approximation=1;
      while(true){
         double rootApprox=((degree-1)*approximation+number/(Math.pow(approximation,(degree-1))))/degree;
         if(Math.abs(approximation-rootApprox)<epsilon){
            break;
         }
         approximation=rootApprox;
      }
      return approximation;
   } 
  /** Returns the integer part of the number's root*/
   public int int_nth_root(double number,int degree){
      boolean negative=false;
      if(number<0){
         number=(-1)*number;
         negative=true;
      }   
      int approximation=(int)number;
      while(true){
         int nx=(int)(((degree-1)*approximation+(number/(Math.pow(approximation,(degree-1)))))/degree);
         if(Math.pow(approximation,degree)<=number)
            break;
         approximation=nx;
      }
      if(negative){
         return -approximation;
      }
      return approximation;
   
   }
}