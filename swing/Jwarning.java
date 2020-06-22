import javax.swing.*;
public class Jwarning {
JFrame f;
Jwarning() {
f = new JFrame("parthisri");
JOptionPane.showInputDialog(f,"Enter ur Name :");
JOptionPane.showMessageDialog(f,"successfully updated","Alert",JOptionPane.WARNING_MESSAGE);
}
public static void main(String[] args) {
new Jwarning();
}
}
