import java.awt.*;  
import java.awt.event.*;  
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Jmouses extends Frame implements MouseListener{  
    Label l;  
    Jmouses(){  
    addWindowListener(new WindowAdapter() {
public  void windowClosing(WindowEvent e) {
dispose();
}
});
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new Jmouses();  
}  
}  
