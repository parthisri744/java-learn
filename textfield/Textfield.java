import java.awt.*;
import java.awt.event.*;
public class Textfield extends Frame implements ActionListener{
TextField input1,input2,result;
Label l1,l2,l3,l4,l5;
Button sum,sub;
Textfield() {
l1 = new Label("Enter First NO :");
l1.setBounds(10,60,150,20);
input1 = new TextField();
input1.setBounds(180,50,150,30);
l2 = new Label("Enter Second no :");
l2.setBounds(10,100,150,20);
input2 = new TextField();
input2.setBounds(180,90,150,30);
l3 = new Label("Results  :");
l3.setBounds(10,140,150,20);
result = new TextField();
result.setBounds(180,130,150,30);
l4 = new Label("SUM");
l4.setBounds(80,180,30,20);
sum = new Button("+");
sum.setBounds(140,170,50,40);
sum.setBackground(Color.blue);
sum.addActionListener(this);
l5 = new Label("SUB");
l5.setBounds(200,180,30,20);
sub = new Button("-");
sub.setBounds(240,170,50,40);
sub.setBackground(Color.green);
sub.addActionListener(this);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(sum);
add(sub);
add(input1);
add(input2);
add(result);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
String s1 = input1.getText();
String s2 = input2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = 0;
if(e.getSource()==sum) {
c=a+b;
}else if (e.getSource()==sub) {
c=a-b;
}
String ans = String.valueOf(c);
result.setText(ans);
}
public static void main(String[] args) {
new Textfield();
}
}
