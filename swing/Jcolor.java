import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jcolor extends JFrame implements ActionListener {
JButton b;
Container c;
public Jcolor() {
c = getContentPane();
c.setLayout(new FlowLayout());
b = new JButton("Color");
b.addActionListener(this);
c.add(b);
}
public void actionPerformed(ActionEvent e ) {
Color color= JColorChooser.showDialog(this,"select",Color.RED);
c.setBackground(color);
}
public static void main(String[] args) {
Jcolor j =new Jcolor();
j.setSize(400,400);
j.setVisible(true);
}
}
