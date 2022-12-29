/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

import static java.awt.SystemColor.text;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author This PC
 */
public class Application {
    public static JFrame SCREEN=new JFrame("Application Count Mark ");
    public static JLabel LABEL_TEXT_GROUP = new JLabel();
    public static JPanel PANEL = new JPanel();
    
    public static JButton button1=new JButton();
    public static JButton button2=new JButton();
    public static JButton button3=new JButton();
    
    
    public static JTextField name;
    
    protected static JFormattedTextField Mark1;
    protected static JFormattedTextField Mark2;
    protected static JTextField Mark3;
    
    public static JTextArea outline1;
    public static JTextArea outline2;
    
    public static JLabel[] text=new JLabel[10];
    
    public Application(){
        // tao khung program. 
        SCREEN.setSize(500,500);
        SCREEN.setDefaultCloseOperation(EXIT_ON_CLOSE);
        SCREEN.add(PANEL);
        PANEL.setLayout(null);
        
        // tao dong chu tieu de. 
        LABEL_TEXT_GROUP =new JLabel("count average mark");
        LABEL_TEXT_GROUP.setBounds(230, 25, 200, 50);
        PANEL.add(Application.LABEL_TEXT_GROUP);
        
        
        button1 =new JButton("COUNT");
        button1.setBounds(100, 400, 100, 50);
        ActionListener listener1 = new countMark();
        button1.addActionListener(listener1);
        PANEL.add(Application.button1);
        
        button2 =new JButton("DELETE");
        button2.setBounds(240,400,100,50);
        ActionListener listener2=new DELETE();
        button2.addActionListener(listener2);
        PANEL.add(Application.button2);
        
        button3=new JButton("EXIT");
        button3.setBounds(370,400,100,50);
        ActionListener listener3=new EXIT();
        button3.addActionListener(listener3);
        PANEL.add(Application.button3);
        
        name=new JTextField("ho va ten");
        name.setBounds(200,100,200,25);
        PANEL.add(name);
        
        Mark1=new JFormattedTextField(1.0);
        Mark1.setValue(0);
        Mark1.setBounds(200,150,200,25);
        PANEL.add(Application.Mark1);
        
        Mark2 =new JFormattedTextField(1.0);
        Mark2.setValue(0);
        Mark2.setBounds(200,200,200,25);
        PANEL.add(Application.Mark2);
        
        Mark3=new JTextField();
        Mark3.setBounds(200,250,200,25);
        PANEL.add(Application.Mark3);
        
        outline1=new JTextArea("xếp loại");
        outline1.setBounds(200,300,200,25);
        PANEL.add(Application.outline1);
        
        outline2=new JTextArea("thông báo");
        outline2.setBounds(200,350,200,25);
        PANEL.add(Application.outline2);
        
        text[0] = new JLabel("name ");
        text[0].setBounds(50,100,200,25);
        PANEL.add(text[0]);
        
        text[1]=new JLabel("mark java");
        text[1].setBounds(50,150,200,25);
        PANEL.add(text[1]);
        
        text[2]=new JLabel("plus mark");
        text[2].setBounds(50,200,200,25);
        PANEL.add(text[2]);
        
        text[3]=new JLabel("average mark");
        text[3].setBounds(50,250,200,25);
        PANEL.add(text[3]);
        
        text[4]=new JLabel("classification");
        text[4].setBounds(50,300,200,25);
        PANEL.add(text[4]);
        
        text[5]=new JLabel("notification");
        text[5].setBounds(50,350,200,25);
        PANEL.add(text[5]);
        
        
        
        
        SCREEN.setVisible(true);
        
        
        
        
        
    }
    
    
    
}
