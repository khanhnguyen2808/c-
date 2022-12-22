/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_1;

import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class main {
    public static void main(String[] args){

        ArrayList<employee> list=new ArrayList<>();
        employee epl=new employee();
        epl.arrayList(list);
        epl.output(list);
        epl.printDate(list);
        System.out.println("xếp thâm niên tăng dần ");
        epl.output(list);
//        epl.arrayList(list);
//        epl.output(list);
    }
}
