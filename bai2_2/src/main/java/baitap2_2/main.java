/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class main {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
        ArrayList<officer> list=new ArrayList<>();
        officer of=new officer();
        of.inputListArray(list);
       
        of.OutlistArray(list);
        of.sort(list);
        of.OutlistArray(list);
        System.out.println("abc");
        
    }
}
