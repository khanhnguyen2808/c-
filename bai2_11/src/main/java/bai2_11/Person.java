/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class Person extends Myaddress implements MyDate {
    public int day;
    public int month;
    public int year;
    private String name;
    private String phoneNumber;

    public Person(int day, int month, int year, String name, String phoneNumber, String province, String district) {
        super(province, district);
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Person(int day, int month, int year, String name, String phoneNumber) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }
    

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public boolean checkDate() {
        int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("year: " + year);
        if (year % 4 == 0) {
            dayMax[2] = 29;
        }
        if (month > 13 || month < 0) {
            return false;
        }
        if (year < 0) {
            return false;
        }

        if ((day > dayMax[month])) {
            return false;
        }
        return true;

    }

    
        public void input(){
            super.input();
            do{
                System.out.println("name : ");
                name=sc.nextLine();
            }while(name.length()>30&&name.length()<0);
            
            System.out.println("phoneNumber  : ");
            phoneNumber=sc.nextLine();
            do {
            System.out.println("input day : ");
            day = sc.nextInt();

            System.out.println("input month : ");
            month = sc.nextInt();

            System.out.println("input year : ");
            year = sc.nextInt();

        } while (checkDate() == false); 
           
            
        }
        
        public void listPerson(ArrayList<Person> list){
            System.out.println("limited number of student : ");
            int number=sc.nextInt();
            for(int i=0;i<number;i++){
                System.out.println("person "+(i+1));
                Person p=new Person();
                p.input();
                list.add(p);
            }
        }
        public void outputListPerson(ArrayList<Person> list){
            System.out.println("===========output============");
            for(int i=0;i<list.size();i++){
                System.out.println("person "+(i+1));
                System.out.println(list.get(i));
            }
        }

    @Override
    public String toString() {
        return "Person{" + super.toString()+"day=" + day + ", month=" + month + ", year=" + year + ", name=" + name + ", phoneNumber=" + phoneNumber + '}';
    }

    @Override
    public void myDate(int day, int month, int year) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void sort(ArrayList<Person> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {

                int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int ki = dayMax[list.get(i).getMonth()];
                int kj = dayMax[list.get(j).getMonth()];

                int sum = list.get(i).getYear() * 365 + list.get(i).getMonth() * ki + list.get(i).getDay();
                int sum2 = list.get(j).getYear() * 365 + list.get(i).getMonth() * kj + list.get(i).getDay();
                if (sum > sum2) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
    public void Cancel(ArrayList<Person> list) {

        sc.nextLine();
        int user = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {

            if (user == 1) {

                System.out.println("person  " + (i + 1) + " {" + list.get(i) + " ");
            }
            if (user == 0) {

                System.out.print("Cancel !!!");
            }
        }
    }

}
