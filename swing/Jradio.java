import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jradio extends JFrame implements ActionListener {
JLabel l;
JButton b;
JRadioButton rb3,rb1,rb2;
public Jradio() {
l = new JLabel("Gender Selection");
l.setBounds(40,40,400,30);
l.setFont(new Font("Times New Roman", Font.PLAIN , 30));
rb1 = new JRadioButton("Male");
rb1.setBounds(60,100,250,30);
rb1.setFont(new Font("Times New Roman", Font.PLAIN , 20));
rb2 = new JRadioButton("Female");
rb2.setBounds(60,140,250,30);
rb2.setFont(new Font("Times New Roman", Font.PLAIN , 20));
rb3 = new JRadioButton("Others");
rb3.setBounds(60,180,250,30);
rb3.setFont(new Font("Times New Roman", Font.PLAIN , 20));
b = new JButton("Select");
b.setBounds(90,240,200,40);
b.setFont(new Font("Times new Roman",Font.PLAIN,20));
b.setBackground(Color.green);
b.addActionListener(this);
add(l);
add(rb1);
add(rb2);
add(rb3);
add(b);
setSize(500,500);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
if(rb1.isSelected()){
JOptionPane.showMessageDialog(this,"you selected Male");
}
if(rb2.isSelected()){
JOptionPane.showMessageDialog(this,"you selected Female");
}
if(rb3.isSelected()){
JOptionPane.showMessageDialog(this,"you selected Other");
}
}
public static void main(String[] args) {
new Jradio();
}
}

