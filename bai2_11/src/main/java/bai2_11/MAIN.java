/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_11;

import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class MAIN {
    public static void main(String[] args){
        ArrayList listPerson=new ArrayList<>();
        Person p=new Person();
        p.listPerson(listPerson);
        p.sort(listPerson);
        System.out.println("nhap 1 de in nhap 0 de huy ! ");
        p.Cancel(listPerson);
        
    }
}
