import java.awt.*;
import javax.swing.*;
public class PointGraphWriter_a extends JPanel
{
   private int x_position;
   private int y_position;
   private int height = 108;//points height
   private int axis_length=110;
   int thick = 3; //the points thicknes
   private int width = 300; // the frame width
   private int frame_height = 200; // the frame height
   private int pointDistance = 20; // distance between points 
   private int p1 = pointDistance;


        Graphics g ;
   JFrame my_frame;

  
   public PointGraphWriter_a()
   {
      my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setSize(width,frame_height);
      my_frame.setVisible(true);
   } 
      public void setTitle(String title)
   {
      my_frame.setTitle(title);
   }
      public void paintComponent(Graphics g)
   {
      g.setColor(Color.white);
      g.fillRect(0, 0, width, frame_height); 
   }
   public void setAxes(int x_pos, int y_pos,int axis_length, String x_label, String y_label)
   {
      g = this.getGraphics();
      this.x_position = x_pos;
      this.y_position = y_pos;
      g.setColor(Color.black);
      
     
      g.drawString(x_label, x_position+110, y_position+15);
 
      g.drawString("0", x_position, y_position+15);
      
      g.drawString("0", x_position-15, y_position);
      
      g.drawString(y_label, y_position-80, x_position - 20);
      // x-axis
      g.drawLine(x_position, y_position, axis_length+70 , y_position);
      // y-axis
      g.drawLine(x_position, axis_length-70, x_position, y_position);

   }
    // setPoint1 draws the first point in the graph
public void setPoint1(int height)
   {
      g.setColor(Color.black);
      g.drawOval(x_position, height+108, thick, thick);
      g.fillOval(x_position, height+108, thick, thick);
            

      } 
      
    // setPoint2 draws the second point in the graph  
         public void setPoint2(int height)
   {
      g.setColor(Color.black);
      g.drawOval((x_position/5)+60,height+100, thick, thick);
      g.fillOval((x_position/5)+60,height+100, thick, thick);
       
      g.drawLine(x_position,height+106,(x_position/5)+60,height+102);
     

   }
   // setPoint3 draws the third point in the graph
   public void setPoint3(int height)
   {
      g.setColor(Color.black);
      g.drawOval((x_position/5)+p1+60, height+84, thick, thick);
      g.fillOval((x_position/5)+p1+60, height+84, thick, thick);
      
      g.drawLine((x_position/5)+60,height+94,(x_position/5)+p1+60,height+86);
      
      
      
         }
   // setPoint4 draws the fourth point in the graph
 public void setPoint4(int height)
    {  g.setColor(Color.black);
      g.drawOval((x_position/5)+p1*2+60,height+60, thick, thick);
      g.fillOval((x_position/5)+p1*2+60, height+60, thick, thick);

      g.drawLine((x_position/5)+60+p1,y_position-12,(x_position/5)+p1*2+60,height+62);

      


   }
   
   // setPoint5 draws the fifth point in the graph 
   public void setPoint5(int height)
   {     
      g.setColor(Color.black);
      g.drawOval((x_position/5)+p1*3+60, height+20, thick, thick);
      g.fillOval((x_position/5)+p1*3+60, height+20, thick, thick);
      
      g.drawLine((x_position/5)+p1*2+60,y_position-p1,(x_position/5)+p1*3+60,height+22);

 
        }
   
   // setPoint6 draws the sixth point in the graph
   public void setPoint6( int height)
   { 
      g.setColor(Color.black);
      g.drawOval((x_position/5)+p1*4+60, height-28, thick, thick);
      g.fillOval((x_position/5)+p1*4+60, height-28, thick, thick);
      
      g.drawLine((x_position/5)+p1*3+60,y_position-p1*2,(x_position/5)+p1*4+60,height-26);

  }
}