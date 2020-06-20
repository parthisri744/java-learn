import java.awt.*;  
import java.awt.event.*;  
public class Findip extends Frame implements ActionListener{  
    TextField tf; Label l,l1; Button b;  
    Findip(){  
        l1 =new Label("Enter website :");
        l1.setBounds(20,50,150,40);
        tf=new TextField();  
        tf.setBounds(200,50, 150,30);  
        l=new Label();  
        l.setBounds(30,80, 300,30);      
        b=new Button("Find IP");  
        b.setBounds(120,120,60,30);  
        b.setBackground(Color.green);
        b.addActionListener(this);    
        add(b);add(tf);add(l);add(l1);
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        try{  
        String host=tf.getText();  
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP of "+host+" is: "+ip);  
        }catch(Exception ex){System.out.println(ex);}  
    }  
    public static void main(String[] args) {  
        new Findip();  
    }  
}  
