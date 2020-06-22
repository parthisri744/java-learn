import javax.swing.*;  
import java.awt.*;
public class Test {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
Button b1 = new Button("click");
b1.setBounds(130,140,100,40);
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
    f.add(b1);      
f.add(b);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  

