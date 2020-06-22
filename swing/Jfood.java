import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jfood extends JFrame implements ActionListener {
JLabel l;
JButton b;
JCheckBox cb3,cb1,cb2;
public Jfood() {
l = new JLabel("Food Ordering System");
l.setBounds(40,40,400,30);
l.setFont(new Font("Times New Roman", Font.PLAIN , 30));
cb1 = new JCheckBox("Fullmeals @ 60");
cb1.setBounds(60,100,250,30);
cb1.setFont(new Font("Times New Roman", Font.PLAIN , 20));
cb2 = new JCheckBox("Briyani @ 80");
cb2.setBounds(60,140,250,30);
cb2.setFont(new Font("Times New Roman", Font.PLAIN , 20));
cb3 = new JCheckBox("Friedrice @ 100");
cb3.setBounds(60,180,250,30);
cb3.setFont(new Font("Times New Roman", Font.PLAIN , 20));
b = new JButton("Order");
b.setBounds(90,240,200,40);
b.setFont(new Font("Times new Roman",Font.PLAIN,20));
b.setBackground(Color.green);
b.addActionListener(this);
add(l);
add(cb1);
add(cb2);
add(cb3);
add(b);
setSize(500,500);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
float amount=0;
String msg="";
if(cb1.isSelected()) {
amount+=60;
msg+="Fullmeals: 60\n";
}
if(cb2.isSelected()){
amount+=80;
msg+="Briyani : 80\n";
}
if(cb3.isSelected()) {
amount+=100;
msg+="Chicken rice : 100\n";
}
msg+="------------------------\n";
JOptionPane.showMessageDialog(this,msg+"Total :"+amount);
}
public static void main(String[] args) {
new Jfood();
}
}

