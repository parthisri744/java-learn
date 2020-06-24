import javax.swing.*;
import java.awt.*;
public  class Jtabbed {
JFrame f;
JTextArea ta;
JPanel p1,p2,p3;
public Jtabbed() {
f = new JFrame("parthisri");
ta = new JTextArea(200,200);
p1 = new JPanel();
ta.add(p1);
p2 = new JPanel();
p3 = new JPanel();
JTabbedPane tp = new JTabbedPane();
tp.setBounds(50,50,200,200);
tp.add("Main",p1);
p1.setBackground(Color.RED);
p2.setBackground(Color.green);
p3.setBackground(Color.blue);
tp.add("Visit",p2);
tp.add("Help",p3);
f.add(tp);
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jtabbed();
}
}
