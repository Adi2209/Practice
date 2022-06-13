import java.applet.*;
import java.awt.*;

public class q6 extends Applet {

  public void init() {
    setForeground(Color.blue);
    setBackground(Color.orange);
  }

  public void start() {}

  public void stop() {}

  public void destroy() {}

  public void paint(Graphics g) {
    g.drawString("Roll No. - 20051634", 50, 100);
    g.drawString("Name - Aditya", 50, 150);
    g.drawString("Branch - CSE", 50, 200);
    g.drawString("Section - CSE5", 50, 250);
  }
}
