/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_5;

import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class main {
    public static void main(String[] args){
    ArrayList<officer> listOfficer=new ArrayList<>();
    officer OFFICER=new officer();
    OFFICER.listArrOfficer(listOfficer);
    System.out.print("input 0 to remove data, input 1 to print data :  ");
    OFFICER.OutputMylist(listOfficer);
    OFFICER.printList(listOfficer);
    OFFICER.sortUp(listOfficer);
    
            
    }
}
