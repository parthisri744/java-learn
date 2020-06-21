import java.awt.*;
import java.awt.event.*;
public class Jmenu extends WindowAdapter {
Frame f;
MenuBar mb;
Menu m ;
MenuItem i1,i2,i3,i4;
public Jmenu() {
f = new Frame("parthisri");
f.addWindowListener(this);
mb = new MenuBar();
m = new Menu("Menu");
Menu submenu = new Menu("submenu")  ;
i1 = new MenuItem("item 1");
i2 = new MenuItem("item 2");
i3 = new MenuItem("item 3");
i4 = new MenuItem("item 4");
m.add(i1);
m.add(i2);
m.add(i3);
submenu.add(i4);
submenu.add(i4);
mb.add(m);
m.add(submenu);
f.setMenuBar(mb);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void windowClosing(WindowEvent e) {
f.dispose();
}
public static void main(String[] args) {
new Jmenu();
}
}
