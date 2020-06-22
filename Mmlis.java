import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
public class Mmlis extends Frame implements MouseMotionListener {
public Mmlis() {
addWindowListener(new WindowAdapter () {
public void windowClosing(WindowEvent e) {
dispose();
}
});
addMouseMotionListener(this);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void mouseDragged(MouseEvent e) {
Graphics g = getGraphics();
g.setColor(Color.green);
g.fillOval(e.getX(),e.getY(),20,20);
}
public void mouseMoved(MouseEvent  e ){
}
public static void main(String[] args) {
new Mmlis();
}
}
