/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_3;

/**
 *
 * @author This PC
 */
public class SV {
    private String className;
    private String name;

    public SV(String className, String name) {
        this.className = className;
        this.name = name;
    }

    public SV() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("name is : "+name);
        System.out.println("class name is : "+className);
    }

    @Override
    public String toString() {
        return "SV{" + "className=" + className + ", name=" + name + '}';
    }
    
}
