import javax.swing.*;
public class Jpassword  {
public static void main(String[] args) {
JFrame f;
JPasswordField p ;
JLabel l;
f = new JFrame("parthiban");
p = new JPasswordField();
p.setBounds(120,100,120,30);
l = new JLabel("Password :");
l.setBounds(20,100,100,30);
f.add(l);f.add(p);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
 
