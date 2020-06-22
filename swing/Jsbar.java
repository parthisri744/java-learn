import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jsbar extends WindowAdapter  {
JFrame f;
JScrollBar b;
JLabel l;
public Jsbar() {
f = new JFrame("parthiban");
f.addWindowListener(this);
l = new JLabel();
l.setBounds(30,50,300,30);
l.setFont(new Font("Times New Roman",Font.PLAIN, 20));
b = new JScrollBar();
b.setBounds(60,80,60,80);
b.addAdjustmentListener(new AdjustmentListener () {
public void adjustmentValueChanged(AdjustmentEvent e) {
l.setText("Scrollbar value :"+b.getValue());
}
});
f.add(l);f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
public void windowClosing(WindowEvent e) {
int a = JOptionPane.showConfirmDialog(f,"Are You Sure ?");
if(a == JOptionPane.YES_OPTION) {
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
public static void main(String[] args) {
new Jsbar();
}
}

