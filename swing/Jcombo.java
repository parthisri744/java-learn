import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jcombo extends JFrame  implements ActionListener  {
JLabel l;
JButton b;
JComboBox<String> cb;
public Jcombo() {
l = new JLabel();
l.setBounds(80,50,300,30);
l.setFont(new Font("Times New Roman",Font.PLAIN, 20));
String language[] = {"c","c++","java","python","parthisri"};
cb = new JComboBox<>(language);
cb.setBounds(60,100,150,30);
b = new  JButton("Show");
b.setBounds(240,100,100,40);
b.setFont(new Font("Times New Roman",Font.PLAIN,20));
b.addActionListener(this);
b.setBackground(Color.green);
add(cb);
add(b);
add(l);
setSize(500,500);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
String data = "selected program is :"+cb.getItemAt(cb.getSelectedIndex());
l.setText(data);
} 
public static void main(String[] args) {
new Jcombo();
}
} 

