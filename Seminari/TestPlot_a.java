public class TestPlot_a
{
  public static void main(String[] args)
   { PointGraphWriter_a e = new PointGraphWriter_a();
     e.setAxes(50, 110, 90, "5", "30");
     e.setTitle("Graph of y = x*x");
     // axes start at position 50,110; the axes have length 90 pixels
     // x-axis is labelled 0..5
     // y-axis is labelled 0..100
     int scale_factor = 3;
     e.setPoint1(0 * scale_factor); // 0*0 = 0
     e.setPoint2(1 * scale_factor); // 1*1 = 1
     e.setPoint3(4 * scale_factor); // 2*2 = 4
     e.setPoint4(9 * scale_factor); // etc.
     e.setPoint5(16 * scale_factor);
     e.setPoint6(25 * scale_factor);
   }
}