import javax.swing.*;
import java.awt.*;
public class Jmenu {
JFrame f;
JMenu m,sm;
JMenuBar mb;
JMenuItem i1,i2,i3,i4,i5;
public Jmenu() {
f = new JFrame();
mb = new JMenuBar();
m = new JMenu("Menu");
sm = new JMenu("Find");
i1 = new JMenuItem("File");
i1.setFont(new Font("Times New Roman",Font.PLAIN,20));
i2 = new JMenuItem("Save");
i2.setFont(new Font("Times New Roman",Font.PLAIN,20));
i3 = new JMenuItem("Save As");
i3.setFont(new Font("Times New Roman",Font.PLAIN,20));
i4 = new JMenuItem("Find");
i4.setFont(new Font("Times New Roman",Font.PLAIN,20));
i5 = new JMenuItem("Find And Replace");
i5.setFont(new Font("Times New Roman",Font.PLAIN,20));
m.setFont(new Font("Times New Roman",Font.PLAIN,20));
sm.setFont(new Font("Times New Roman",Font.PLAIN,20));
mb.add(m);
m.add(sm);
m.add(i1);
m.add(i2);
m.add(i3);
sm.add(i4);
sm.add(i5);
f.setJMenuBar(mb);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Jmenu();
}
}


