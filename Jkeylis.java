import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
public class Jkeylis extends Frame implements KeyListener {
TextArea ta;
Label l;
public Jkeylis() {
addWindowListener(new WindowAdapter (){
public void windowClosing(WindowEvent e){
dispose();
}
});
l = new Label();
l.setBounds(80,50,200,30);
ta = new TextArea();
ta.setBounds(80,120,400,200);
ta.addKeyListener(this);
add(l);
add(ta);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void keyPressed(KeyEvent e) {
l.setText("keypressed");
}
public void keyReleased(KeyEvent e) {
l.setText("keyReleased");
}
public void keyTyped(KeyEvent e) {
l.setText("keyTyped");
}
public static void main(String[]  args){
new Jkeylis();
}
}
