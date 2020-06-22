import javax.swing.*;
import java.awt.event.*;
public class Jsno extends WindowAdapter {
JFrame j;
public Jsno() {
j = new JFrame();
j.addWindowListener(this);
j.setSize(300,300);
j.setLayout(null);
j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
j.setVisible(true);
}
public void windowClosing(WindowEvent e) {
int a = JOptionPane.showConfirmDialog(j,"Are You Sure");
if(a==JOptionPane.YES_OPTION) {
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
public static void main(String[] args){
new Jsno();
}
}
