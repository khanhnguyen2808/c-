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
public class countMark implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
         double javaMark=(double)Application.Mark1.getValue();
         double plusMark=(double)Application.Mark2.getValue();
         double sum;
         sum=(javaMark+plusMark)/2;
         
         Application.Mark3.setText(String.valueOf(sum));
         
         if(sum>8){
             Application.outline1.setText("very good !");
             
         }else if(sum>6.5||8<sum){
             Application.outline1.setText("good");
             
         }else if(sum>4||sum<6.5){
             Application.outline1.setText("medium");
         }else{
             Application.outline1.setText("weak");
         }
         
         if(sum>8&&(javaMark==10||plusMark==10)){
             Application.outline2.setText("you have a scholarship");
         }else if(sum>5&&(javaMark<5||plusMark<5)){
             Application.outline2.setText("you should try to learn more ! ");
         }else{
             Application.outline2.setText("it's oke !");
         }
         
    }
    
}
