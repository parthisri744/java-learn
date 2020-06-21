import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
public class JWindow extends Frame implements WindowListener {
public JWindow() {
addWindowListener(this);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void windowActivated(WindowEvent e) {
System.out.println("Activated");
}
public void windowClosed(WindowEvent e) {
System.out.println("Closed");
}
public void windowClosing(WindowEvent e) {
System.out.println("Closing");
}
public void windowDeactivated(WindowEvent e) {
System.out.println("Deactivated");
}
public void windowDeiconified(WindowEvent e) {
System.out.println("Deiconified");
}
public void windowIconified(WindowEvent e) {
System.out.println("Iconified");
}
public void windowOpened(WindowEvent e) {
System.out.println("Opened");
}
public static void main(String[] args) {
new JWindow();
}
}
