import java.awt.*;
import java.awt.event.*;
public class Checkbo extends Frame {
Checkbox  cb1,cb2,cb3,cb4;
Label l1;
Checkbo() {
l1 = new Label();
l1.setAlignment(Label.CENTER);  
l1.setSize(400,100);  
cb1 = new Checkbox("java");
cb1.setBounds(80,80,150,30);
cb2 = new Checkbox("c++");
cb2.setBounds(80,110,150,30);
cb3 = new Checkbox("go");
cb3.setBounds(80,140,150,30);
cb4 = new Checkbox("python");
cb4.setBounds(80,170,150,30);
add(cb1);
add(cb2);
add(cb3);
add(cb4);
add(l1);
cb1.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
l1.setText("java Checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
}
});
cb2.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
l1.setText("c++ Checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
}
});
cb3.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
l1.setText("go Checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
}
});
cb4.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
l1.setText("python Checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
}
});
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
new Checkbo();
}
}
