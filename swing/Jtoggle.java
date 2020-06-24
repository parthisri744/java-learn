import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jtoggle extends JFrame implements ItemListener {
JToggleButton b;
public Jtoggle() {
b = new JToggleButton("ON");
b.setBounds(40,60,60,30);
add(b);
b.addItemListener(this);
b.setBackground(Color.green);
setSize(300,300);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent e) {
if(b.isSelected()) {
b.setText("ON");
}else {
b.setText("OFF");
b.setBackground(Color.red);
}
}
public static void main(String[] args) {
new Jtoggle();
}
}
