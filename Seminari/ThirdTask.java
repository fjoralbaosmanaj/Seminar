import javax.swing.*;
import java.awt.*;
public class ThirdTask extends JPanel
{  int width=850;
   int height=850;
   Color BACKGROUND_COLOR=Color.white;

   public ThirdTask()
   {JFrame f= new JFrame();
      f.getContentPane().add(this);
      f.setTitle("Third graph with values.");
      f.setSize(width,height);
      f.setVisible(true);
   }
   public void paintComponent(Graphics g)
   {g.setColor(Color.black);
      g.drawLine(80, 110, 200, 110); //the x axes
      g.drawLine(80, 110, 80, 20); //the y axes
      g.drawString("0",85,125);// the origin of the graph
      g.drawString("100",200,125);//the horizontal asymptote
      g.drawString("100",65,25);// the vertical asymptote
       g.setColor(Color.black);
      g.drawLine(80, 110, 80, 20);
       g.drawString("",70, 20);
       g.setColor(Color.red);
       g.drawOval(78, 110, 4, 4);
      g.fillOval(78, 110, 4, 4);
    
      Graphics2D g2d = (Graphics2D)g;
     
      g2d.drawLine(80,110,160,110);//the line when the value of y falls at
      g2d.setColor(Color.black);
      g2d.drawString("",70,110);//the position of the value of y
      g2d.setColor(Color.red);
      g2d.drawString("The graph of y=20x-(0.5x)^3  for x=0",100,70);
      
       g.setColor(Color.black);
      g.drawLine(230, 260, 350, 260); //the x axes
      g.drawLine(230, 260, 230, 170); //the y axes
      g.drawString("0",225,275);// the origin of the graph
      g.drawString("100",330,275);//the horizontal asymptote
      g.drawString("100",200,175);// the vertical asymptote
     g.setColor(Color.blue);
      g.drawLine(240, 260, 240, 170);
       g.drawString("4",240, 275);
       g.setColor(Color.blue);
       g.drawOval(240, 235, 4, 4);
      g.fillOval(240, 235, 4, 4);
    
     
      g2d.drawLine(230,237,310,237);
      g2d.setColor(Color.blue);
      g2d.drawString("39",200,237);
      g2d.setColor(Color.blue);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=2",300,180);
      
            g.setColor(Color.black);
      g.drawLine(330, 360, 450, 360); //the x axes
      g.drawLine(330, 360, 330, 270); //the y axes
      g.drawString("0",335,375);// the origin of the graph
      g.drawString("100",443,375);//the horizontal asymptote
      g.drawString("100",300,275);// the vertical asymptote
     g.setColor(Color.green);
      g.drawLine(360, 360, 360, 270);
       g.drawString("6",360, 380);
       g.setColor(Color.green);
       g.drawOval(360, 310, 4, 4);
      g.fillOval(360, 310, 4, 4);
    

    
     
      g2d.drawLine(329,310,410,310);
      g2d.setColor(Color.green);
      g2d.drawString("72",300,310);
      g2d.setColor(Color.green);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=4",380,300);
      
           g.setColor(Color.black);
      g.drawLine(429, 460, 550, 460);//the x axes
      g.drawLine(430, 460, 430, 370); //the y axes
       g.drawString("0",435,475);// the origin of the graph
      g.drawString("100",543,475);//the horizontal asymptote
      g.drawString("100",400,375);// the vertical asymptote
      g.setColor(Color.orange);
      g.drawLine(480, 460, 480, 370);
       g.drawString("8",480, 480);
       g.setColor(Color.orange);
       g.drawOval(480, 390, 4, 4);
      g.fillOval(480, 390, 4, 4);
    
    
     
      g2d.drawLine(430,389,510,389);
      g2d.setColor(Color.orange);
      g2d.drawString("93",392,389);
      g2d.setColor(Color.orange);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=6",480,430);
      
       g.setColor(Color.black);
      g.drawLine(549, 580, 670, 580);//the x axes
      g.drawLine(550, 580, 550, 490); //the y axes
      g.drawString("0",555,595);// the origin of the graph
      g.drawString("100",655,595);//the horizontal asymptote
      g.drawString("100",525,495);// the vertical asymptote
     g.setColor(Color.pink);
      g.drawLine(630, 580, 630, 490);
       g.drawString("10",630, 600);
       g.setColor(Color.pink);
       g.drawOval(628, 496, 4, 4);
      g.fillOval(628, 496, 4, 4);
    
     
      g2d.drawLine(550,500,640,500);
      g2d.setColor(Color.pink);
      g2d.drawString("96",518,510);
      g2d.setColor(Color.pink);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=8",650,520);
      
        g.setColor(Color.black);
      g.drawLine(680, 710, 820, 710); //the x axes
      g.drawLine(680, 730, 680, 650); //the y axes
      g.drawString("0",670,710);// the origin of the graph
      g.drawString("100",780,725);//the horizontal asymptote 
      g.drawString("150",655,640);// the vertical asymptote
    g.setColor(Color.magenta);
      g.drawLine(780, 730, 780, 650);
       g.drawString("10",760, 700);
       g.setColor(Color.magenta);
       g.drawOval(780, 725, 4, 4);
      g.fillOval(780, 725, 4, 4);
     
      g2d.drawLine(680,726,789,726);
      g2d.setColor(Color.magenta);
      g2d.drawString("-25",655,726);
      g2d.setColor(Color.magenta);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=10",730,640);
   }

   public static void main (String [] args)
   {new ThirdTask();
   }
}