
import java.awt.*;
public class awt2 {
 public static void main(String a[])
 {
     Frame f1= new Frame("Layout 1");
     Button b1= new Button("Ok");
     TextField t1=new TextField(null, 0);
     f1.setVisible(true);
     f1.add(t1);
     t1.setBounds(750, 200, 400, 50);
     f1.setSize(600, 600);
     f1.add(b1);
     f1.setLayout(null);
     b1.setBounds(910, 300, 80, 30);
 }
}
