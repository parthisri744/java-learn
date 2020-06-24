import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Jskey {
public static void main(String[]  args ) {
Font font = new Font("Times New Roman", Font.PLAIN , 20);
JFrame f = new JFrame("parthisri");
JMenuBar mb = new JMenuBar();
JMenu file = new JMenu("File");
file.setFont(font);
file.setMnemonic(KeyEvent.VK_F);
mb.add(file);
JMenuItem  mi = new JMenuItem("open", KeyEvent.VK_O);
file.add(mi);
mi.setFont(font);
file.addSeparator();
JMenuItem mi1 = new JMenuItem("Open Folder", KeyEvent.VK_J);
file.add(mi1);
mi1.setFont(font);
file.addSeparator();
JCheckBoxMenuItem ci = new JCheckBoxMenuItem("Auto Save");
ci.setFont(font);
ci.setMnemonic(KeyEvent.VK_A);
file.add(ci);
ci.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
AbstractButton aButton = (AbstractButton) e.getSource();
boolean Selected = aButton.getModel().isSelected();
String newLabel;
Icon newIcon;
if(Selected) {
newLabel = "value-1";
}else {
newLabel = "value-2";
}
}
});
f.setJMenuBar(mb);
f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
