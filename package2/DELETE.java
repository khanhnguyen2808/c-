/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author This PC
 */
public class DELETE implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Application.name.setText("");
        Application.Mark1.setValue(0);
        Application.Mark2.setValue(0);
        Application.Mark3.setText("");
        Application.outline1.setText("");
        Application.outline2.setText("");

        
    }
    
}
