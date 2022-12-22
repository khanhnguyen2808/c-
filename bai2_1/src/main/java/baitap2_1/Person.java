/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



/**
 *
 * @author This PC
 */
public class Person {
    private String name;
    private String birthDay;
    private String adress; 
    Scanner sc=new Scanner(System.in);
    

    public Person(String name, String birthDay, String adress) {
        super();
        this.name = name;
        this.birthDay = birthDay;
        this.adress = adress;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public void input(){
        sc.nextLine();
        System.out.println("input name : ");
        name=sc.nextLine();
        System.out.println("input adress : ");
        adress=sc.nextLine();
        System.out.println("input birthday : ");
        birthDay=sc.nextLine();
    }


    
    @Override
    public String toString() {
        return super.toString()+"name=" + name + ", birthDay=" + birthDay + ", adress=" + adress ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.birthDay);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.birthDay, other.birthDay);
    }
    

    
    
    
}
