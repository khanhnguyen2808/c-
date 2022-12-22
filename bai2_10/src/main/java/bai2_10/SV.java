/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_10;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class SV {
    private String classes; 
    private String name;
    Scanner sc=new Scanner(System.in);

    public SV(String classes, String name) {
        this.classes = classes;
        this.name = name;
    }

    public SV() {
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        System.out.println("classes  : ");
        classes=sc.nextLine();
        System.out.println("name : ");
        name=sc.nextLine();
        
    }
    @Override
    public String toString() {
        return "classes=" + classes + ", name=" + name ;
    }
    
}
