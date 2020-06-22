import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class Jlogin  {
JFrame f;
JLabel l,l2,l3;
JPasswordField t1;
JTextField t;
JButton b;
public Jlogin() {
f = new JFrame("LogIn");
l = new JLabel("UserName :");
l.setBounds(50,60,150,30);
l.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
t = new JTextField();
t.setBounds(200,60,120,30);
l2 = new JLabel("Password :");
l2.setBounds(50,100,120,30);
l2.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
t1 = new JPasswordField();
t1.setBounds(200,100,120,30);
l3 = new JLabel();
l3.setBounds(50,130,300,30);
b = new JButton("Log IN");
b.setBounds(130,180,120,40);
b.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
b.addActionListener(new ActionListener() {  
public void actionPerformed(ActionEvent e) {       
String data = t.getText();
l3.setText("UserName :"+data+"Password :"+new String(t1.getPassword()));          
}
});
b.setBackground(Color.green);
f.add(l);f.add(l2);f.add(l3);
f.add(t);f.add(t1);f.add(b);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jlogin();
}
}

