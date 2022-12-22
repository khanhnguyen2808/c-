/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_7;

import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class MAIN {
    public static void main(String[] args){
        ArrayList<SVCN> listSVCN=new ArrayList<>();
        SVCN o=new SVCN();
        o.listSVCN(listSVCN);
        o.outList(listSVCN);
        System.out.println(" after sorting arrayList ! ");
        o.compareInfor(listSVCN);
        System.out.println("if you press 0, the data in program will be deleted, and otherwise press 1 to print out data. ");
        o.Cancel(listSVCN);
     
        
        
    }
}
