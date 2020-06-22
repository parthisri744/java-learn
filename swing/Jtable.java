import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class Jtable extends JFrame {
JTable t;
public Jtable() {
String data[][] = {{"101","parthiban","21"},{"102","parthisri","20"},{"103","parthisri","23"}};
String column[] = {"ID","NAME","AGE"};
t = new JTable(data,column);
t.setBounds(20,30,200,300);
JScrollPane sp = new JScrollPane(t);
add(sp);
setSize(400,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jtable();
}
}
