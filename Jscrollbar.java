import java.awt.*;
import java.awt.event.*;
public class Jscrollbar extends Frame implements AdjustmentListener {
Scrollbar s;
Label l;
public Jscrollbar() {
l = new Label();
l.setSize(300,100);
l.setAlignment(Label.CENTER);
s = new Scrollbar();
s.setBounds(100,100,40,100);
s.addAdjustmentListener(this);
add(s);add(l);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void adjustmentValueChanged(AdjustmentEvent e) {
l.setText("Scrollbar value is :"+s.getValue());
}
public static void main(String[] args) {
new Jscrollbar();
}
}
