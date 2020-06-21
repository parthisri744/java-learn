import java.awt.*;
import java.awt.event.*;
public class Popup extends WindowAdapter {
PopupMenu pm;
MenuItem cut,copy,paste;
Frame f;
public Popup() {
 f = new Frame("parthisri");
f.addWindowListener(this);
pm = new PopupMenu();
copy = new MenuItem("copy");
copy.setActionCommand("copy");
cut = new MenuItem("cut");
cut.setActionCommand("cut");
paste = new MenuItem("paste");
paste.setActionCommand("paste");
pm.add(copy);
pm.add(cut);
pm.add(paste);
f.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
pm.show(f,e.getX(),e.getY());
}
});
f.add(pm);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void windowClosing(WindowEvent e){
f.dispose();
}
public static void main(String[] args) {
new Popup();
}
}
