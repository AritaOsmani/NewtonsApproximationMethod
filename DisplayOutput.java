import javax.swing.*;
import java.awt.*;
public class DisplayOutput extends JPanel{
   private double[] epsilons;
   private double[] approximations;
   private double number;
   private int degree;
   private int width=600;
   
   public DisplayOutput(double number,double[] epsilons,double[] approximations){
    this(number,2,epsilons,approximations);
   }
   
   public DisplayOutput(double number,int degree,double[] epsilons,double[] approximations){
      this.number=number;
      this.degree=degree;
      this.epsilons=epsilons;
      this.approximations=approximations;
      
      JFrame frame=new JFrame();
      frame.setSize(width,width);
      frame.setVisible(true);
      frame.getContentPane().add(this);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void paintComponent(Graphics g){
      g.setColor(Color.white);
      g.fillRect(0,0,width,width);
      g.setColor(new Color(64,0,128));
      Font f=new Font("Helvetica",Font.ITALIC,30);
      g.setFont(f);
      g.drawString("Newton's Approximation Method",60,50);
      f=new Font("Serif",Font.ITALIC,20);
      g.setFont(f);
      g.setColor(new Color(251,125,0));
      g.drawString("Number= "+number,60,110);
      g.drawString("Degree=  "+degree,350,110);
      f=new Font("Serif",Font.BOLD,15);
      g.setFont(f);
      for(int i=0;i!=epsilons.length;i++){
         g.setColor(new Color(55,160,210));
         g.drawString((i+1)+".   Epsilon= "+epsilons[i],50,150+30*i);
         g.setColor(new Color(208,34,73));
         g.drawString("Approximation= "+approximations[i],250,150+30*i);
      
      }
   
   }

}