
package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Test implements ActionListener
{
    JFrame jf;
    JTextField jt;
    JButton jb1, jb2;
    void createFrame()
    {
        jf=new JFrame();
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jt=new JTextField();
        jt.setBounds(100, 50, 300, 40);
        jf.add(jt);
        
        jb1=new JButton("Click Me");
        jb1.addActionListener(this);
        jb1.setBounds(100, 150, 120, 50);
        jf.add(jb1);
        
        jb2=new JButton("Clear");
        jb2.addActionListener(this);
        jb2.setBounds(250, 150, 120, 50);
        jf.add(jb2);
        
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb1)
        {
            String name=jt.getText();
            //System.out.println("hello : "+name);
            
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(jf, "Name cannot be empty");
            }
            else
            {
                JOptionPane.showMessageDialog(jf, "hello : "+name);
            }
        }
        if(e.getSource()==jb2)
        {
            jt.setText("");
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.createFrame();
    }
}
