import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;    
public class Jnotepad implements ActionListener {
JFrame f;
JMenuBar mb;
JMenu file,edit,help;
JMenuItem cut,copy,paste,selectAll,open;
JTextArea ta;
public Jnotepad() {
Font big = new Font( "Serif", Font.PLAIN, 22 );
f = new JFrame("NotePad");
f.addWindowListener(new WindowAdapter () {
public void windowClosing(WindowEvent e){
int a = JOptionPane.showConfirmDialog(f,"Are You Sure To Exit ?");
if(a==JOptionPane.YES_OPTION) {
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
});
mb = new JMenuBar();
file = new JMenu("File");
file.setFont(big);
open = new JMenuItem("Open");
open.setFont(big);
open.addActionListener(this);
file.add(open);

edit = new JMenu("Edit");
edit.setFont(big);
cut = new JMenuItem("Cut");
cut.setFont(big);
cut.addActionListener(this);
copy = new JMenuItem("Copy");
copy.setFont(big);
copy.addActionListener(this);
paste = new JMenuItem("Paste");
paste.setFont(big);
paste.addActionListener(this);
selectAll = new JMenuItem("Select All");
selectAll.setFont(big);
selectAll.addActionListener(this);
help = new JMenu("Help");
help.setFont(big);
ta = new JTextArea();
ta.setBounds(10,10,780,780);
ta.setFont(new Font("Times New Roman",Font.PLAIN,20));
f.add(ta);
mb.add(file);mb.add(edit);mb.add(help);
edit.add(cut);edit.add(copy);
edit.add(paste);edit.add(selectAll); 
f.setJMenuBar(mb);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==open){    
    JFileChooser fc=new JFileChooser();    
    int i=fc.showOpenDialog(f);    
    if(i==JFileChooser.APPROVE_OPTION){    
        File f=fc.getSelectedFile();    
        String filepath=f.getPath();    
        try{  
        BufferedReader br=new BufferedReader(new FileReader(filepath));    
        String s1="",s2="";                         
        while((s1=br.readLine())!=null){    
        s2+=s1+"\n";    
        }    
        ta.setText(s2);    
        br.close();    
        }catch (Exception ex) {ex.printStackTrace();  }                 
    }    
}            
if(e.getSource()==cut) {
ta.cut();
}
if(e.getSource()==copy) {
ta.copy();
}
if(e.getSource()==paste) {
ta.paste();
}
if(e.getSource()==selectAll) {
ta.selectAll();
}
}
public static void main(String[] args) {
new Jnotepad();

}
}

