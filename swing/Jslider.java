import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Jslider extends JFrame {
JPanel p;
JSlider s;
JLabel l ;
public Jslider() {
s = new JSlider(JSlider.HORIZONTAL,0,100,50);
s.setSize(200,30);
s.setMinorTickSpacing(2);
s.setMajorTickSpacing(20);
s.setPaintTicks(true);
s.setPaintLabels(true);
p = new JPanel();
p.add(s);
add(p);
setSize(400,200);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jslider();
}
}
