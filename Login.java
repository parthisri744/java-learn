import java.awt.*;
public class Login extends Frame {
TextField tf,tf1;
Label l1,l2;
Login() {
l1 = new Label("Enter you name : ");
l1.setBounds(40,50,130,20);
tf = new TextField();
tf.setBounds(200,50,100,30);
l2 = new Label("Enter you password : ");
l2.setBounds(40,100,130,20);
tf1 = new TextField();
tf1.setBounds(200,100,100,30);
Button b = new Button("log in ");
b.setBounds(100,140,70,40);
b.setBackground(Color.green);
Button b1 = new Button("cancel ");
b1.setBounds(180,140,70,40);
b1.setBackground(Color.red);
add(tf);add(b);add(l1);add(l2);add(tf1);add(b1);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
new TesLogin();
}
}
