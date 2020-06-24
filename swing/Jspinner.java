import javax.swing.*;
public class Jspinner extends JFrame {
public Jspinner() {
final SpinnerModel value = new SpinnerNumberModel(4,0,100,2);
JSpinner s = new JSpinner(value);
s.setBounds(40,40,40,40);
add(s);
setSize(200,200);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jspinner();
}
} 
