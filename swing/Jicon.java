import javax.swing.*;
public class Jicon  {
Jicon() {
JFrame f = new JFrame("parthisri");
JButton b = new JButton(new ImageIcon("Button.jpg"));
b.setBounds(100,80,200,60);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jicon();
}
}
