import javax.swing.*;    
public class Jprobar extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
Jprobar(){    
jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);   
setDefaultCloseOperation(EXIT_ON_CLOSE); 
}    
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}    
}    
}    
public static void main(String[] args) {    
    Jprobar m=new Jprobar();    
    m.setVisible(true);    
    m.iterate();    
}    
}    
