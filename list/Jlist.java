import java.awt.*;
import java.awt.event.*;
public class Jlist extends Frame implements ActionListener {
List l,li;
Label l1;
Button b;
Jlist() {
l1 = new Label();
l1.setSize(500,100);
l1.setAlignment(Label.CENTER);
l = new List(5,false);
l.setBounds(80,80,100,80);
l.add("php");
l.add("html");
l.add("css");
l.add("javascript");
l.add("bootstrap");
b = new Button("Show");
b.setBounds(220,150,60,40);
b.setBackground(Color.green);
b.addActionListener(this);
li = new List(4,true);
li.setBounds(80,200,100,80);
li.add("backend");
li.add("element");
li.add("design");
li.add("behaviour");
add(l);add(li);add(l1);add(b);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
String  data = "selected program is :"+l.getItem(l.getSelectedIndex())+"and Framework is : ";
for(String frame : li.getSelectedItems()) {
data+=frame;
}
l1.setText(data);
}
public static void main(String[] args) {
new Jlist();
}
}
