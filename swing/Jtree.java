import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Jtree {
JFrame f;
JTree t;
public Jtree() {
f = new JFrame("Tree");
DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
style.add(color);
style.add(font);
DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
DefaultMutableTreeNode yello = new DefaultMutableTreeNode("yello");
DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
color.add(red);color.add(green);color.add(blue);color.add(yello);color.add(black);
t = new JTree(style);
f.add(t);
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jtree();
}
}
