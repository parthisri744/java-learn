import java.awt.*;
import java.awt.event.*;
public class Test extends WindowAdapter {
Frame f ;
public Test() {
f = new Frame("parthiban");
f.addWindowListener(this);
Image icon = Toolkit.getDefaultToolkit().getImage("parthiban.jpg");
f.setIconImage(icon);
f.setSize(200,200);
f.setLayout(null);
f.setVisible(true);
}
public void windowClosing(WindowEvent e) {
f.dispose();
}
public static void main(String[] args) {
new Test();
}
}
