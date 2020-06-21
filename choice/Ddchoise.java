import java.awt.*;
import java.awt.event.*;
public class Ddchoise extends Frame implements ActionListener {
Choice ch;
Label l1;
Button b;
Ddchoise() {
l1 = new Label();
l1.setBounds(80,60,250,30);
ch = new Choice();
ch.setBounds(100,120,100,40);
ch.add("select");
ch.add("python");
ch.add("java");
ch.add("c++");
ch.add("go");
ch.add("c");
b = new Button("show");
b.setBounds(200,120,50,40);
b.addActionListener(this);
add(b);add(ch);add(l1);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
String data = ch.getItem(ch.getSelectedIndex());
l1.setText("selected Programing language  :"+data);
}
public static void main(String[] args) {
new Ddchoise();
}
}
