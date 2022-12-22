/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_2;

/**
 *
 * @author This PC
 */
public class Person extends myDate{
    private String name;
    private String address;
    private int phone;

    public Person(String name, String address, int phone) {
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void input(){
        super.input();
        sc.nextLine();
        System.out.println("input name : ");
        name=sc.nextLine();
        sc.nextLine();
        System.out.println("address : ");
        address=sc.nextLine();
        sc.nextLine();
        System.out.println("phone : ");
        phone=sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ "name=" + name + ", address=" + address + ", phone=" + phone ;
    }

    
    
}
