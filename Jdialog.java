import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Jdialog  {
private static Dialog d;
Button b;
Jdialog() {
Frame f = new Frame("parthisri");
d = new Dialog(f,"dialog",true);
d.addWindowListener(new WindowAdapter() {
public  void windowClosing(WindowEvent e) {
d.dispose();
}
});
d.setLayout(new FlowLayout());
b = new Button("OK");
b.setBackground(Color.green);
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Jdialog.d.setVisible(false);
}
});
d.add(b);
d.add(new Label("click ok to continue"));
d.setSize(300,300);
d.setVisible(true);
}
public static void main(String[] args) {
new Jdialog();
}
}



