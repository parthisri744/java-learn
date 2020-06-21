import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Jpanel extends Frame {
Panel p;
Button b,b1;
public Jpanel() {
addWindowListener(new WindowAdapter() {
public  void windowClosing(WindowEvent e) {
dispose();
}
});
p = new Panel();
p.setBounds(20,40,200,200);
p.setBackground(Color.gray);
b = new Button("Click Me");
b.setBounds(40,60,60,30);
b.setBackground(Color.green);
b1 = new Button("Cancel");
b1.setBounds(100,60,60,30);
b1.setBackground(Color.red);
add(p);
p.add(b);
p.add(b1);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
new Jpanel();
}
}



