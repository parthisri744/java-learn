import java.awt.*;
import java.awt.event.*;
public class Textarea extends Frame implements ActionListener {
TextArea ta;
Button count;
Label l1,l2;
Textarea() {
l1 =new Label();
l1.setBounds(40,50,60,30);
l2 =new Label();
l2.setBounds(150,50,100,30);
ta = new TextArea();
ta.setBounds(20,100,200,100); 
count =new Button("Count");
count.setBounds(100,220,60,40);
count.setBackground(Color.green);
count.addActionListener(this);
add(ta);add(l1);add(l2);add(count);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s1 = ta.getText();
String words[]=s1.split("\\s");
l1.setText("words :"+words.length);
l2.setText("Charecter :"+s1.length());
}
public static void main(String[] args) {
new Textarea();
}
}
