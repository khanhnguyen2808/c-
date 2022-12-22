/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_5;

/**
 *
 * @author This PC
 */
public class Person extends MyAddress {

    private String name;
    private String phone;

    public Person(String name, String phone, String province, String district) {
        super(province, district);
        this.name = name;
        this.phone = phone;
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void input() {
        super.input();
        System.out.println("name : ");
        name = sc.nextLine();
        System.out.println("phone : ");
        phone = sc.nextLine();
    }
    public void print(){
        super.print();
        System.out.println("name : "+name);
        System.out.println("phone : "+phone);
    }

    @Override
    public String toString() {
        return super.toString()+"name=" + name + ", phone=" + phone;
    }
    
    
}
