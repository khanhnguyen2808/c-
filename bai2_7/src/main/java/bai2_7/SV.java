/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_7;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class SV {
    private String name;
    private String className;
    Scanner sc=new Scanner(System.in);

    public SV(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public SV() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    public void input(){
        System.out.println("input name : ");
        name=sc.nextLine();
        System.out.println("input class's name  : ");
        className=sc.nextLine();
        
    }
    public void print(){
        System.out.println("name : "+name);
        System.out.println("class's name : "+className);
    }

    @Override
    public String toString() {
        return "name=" + name + ", className=" + className + " ";
    }
    
    
}
